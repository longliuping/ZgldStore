package com.zgld.mall.alipay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.alipay.sdk.app.PayTask;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by Am on 2016/4/11.
 */
public class AsyncAlipay {
    public interface AsyncAlipayListener{
        public void complete(Message msg);
    }
    // 商户PID
    public static final String PARTNER = "2088221599054403";
    // 商户收款账号
    public static final String SELLER = "709877070@qq.com";
    // 商户私钥，pkcs8格式
    public static final String RSA_PRIVATE = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALhgnZ3yOtEbHr0W" +
            "D/a7ekU3+UBdPz1+Rq1FGkM+duEKCMqWlJE2ow+WG8tR/WT3VtvYjeZGQsDpaEK6" +
            "IuoBbkIl1+a2n4i8amMp5bELaLkwbsN24fuMrO6zno3uVD4BXcn9GxTPHn7yiimu" +
            "E2hvLuCD8OkHseCDc/rf7+4B6SbpAgMBAAECgYBdi8+MipDi9TKUVzRER/ySUALr" +
            "cCQc7Aup78ySX4frR68MMngwcRssVknFz9STvJZaNrZQJkfKHuJiMJR0S8OHeZ7w" +
            "Zt2u3cXn3tbvkqoYscc7WMmBM10k16npC8uw0eB1XU/y4dT53zFPtGe6HQ5UG9Ai" +
            "OKoerWQtTqSp1FD1AQJBAOBgEa4g6lhuobs4D4kE1BsQ+xK4utbvuKG+YLfebfsL" +
            "UZZ1NmBbrzO3qYEa8PeB95YPK1OkFlPi6wRLBkO31OECQQDSXVb0oWeplZO1t/O8" +
            "58DOgVIKtRkJs7GSPFAfUak1p0/GZ+fbokUhiaNS6HLfcnMx3LyE7PFyZS4MFitm" +
            "7QsJAkB7LQJHv5YnGgT7jJkqtVXjzfynmHYpzMxlLuhVyGxEJ0CRAqPpXivejnMl" +
            "hy7GEbljzcwRTMFdJ/OxFabIwkDBAkEAjkvbJREFGP538yTid7bggg+SGnIT5K8r" +
            "f3rSy8ymRAfP+6qPeM8UKjJ7Svq3sZQufd0NnHDWhgYRFtXsN+xCWQJAGWVeTpdF" +
            "zdlPNaOflq7D2TFqo7H5kqz2s+FbByGVsNz4At5DsITBTvneHazkvWSrY11kWXui" +
            "/Vd41fMl5pEBAA==";
    // 支付宝公钥
    public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4YJ2d8jrRGx69Fg/2u3pFN/lA\n" +
            "XT89fkatRRpDPnbhCgjKlpSRNqMPlhvLUf1k91bb2I3mRkLA6WhCuiLqAW5CJdfm" +
            "tp+IvGpjKeWxC2i5MG7DduH7jKzus56N7lQ+AV3J/RsUzx5+8ooprhNoby7gg/Dp" +
            "B7Hgg3P63+/uAekm6QIDAQAB";
    private static final int SDK_PAY_FLAG = 1;
    Activity activity;
    AsyncAlipayListener listener;
    public AsyncAlipay(Activity activity,AsyncAlipayListener listener){
        this.activity = activity;
        this.listener = listener;
    }
    /**
     * call alipay sdk pay. 调用SDK支付
     *
     */
    public void pay() {
        if (TextUtils.isEmpty(PARTNER) || TextUtils.isEmpty(RSA_PRIVATE) || TextUtils.isEmpty(SELLER)) {
            new AlertDialog.Builder(activity).setTitle("警告").setMessage("需要配置PARTNER | RSA_PRIVATE| SELLER")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialoginterface, int i) {
                            //
                            activity.finish();
                        }
                    }).show();
            return;
        }
        String orderInfo = getOrderInfo("测试的商品", "该测试商品的详细描述", "0.01");

        /**
         * 特别注意，这里的签名逻辑需要放在服务端，切勿将私钥泄露在代码中！
         */
        String sign = sign(orderInfo);
        try {
            /**
             * 仅需对sign 做URL编码
             */
            sign = URLEncoder.encode(sign, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /**
         * 完整的符合支付宝参数规范的订单信息
         */
        final String payInfo = orderInfo + "&sign=\"" + sign + "\"&" + getSignType();

        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                // 构造PayTask 对象
                PayTask alipay = new PayTask(activity);
                // 调用支付接口，获取支付结果
                String result = alipay.pay(payInfo, true);

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }
    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            listener.complete(msg);
        };
    };
    /**
     * get the sdk version. 获取SDK版本号
     *
     */
    public void getSDKVersion() {
        PayTask payTask = new PayTask(activity);
        String version = payTask.getVersion();
        Toast.makeText(activity, version, Toast.LENGTH_SHORT).show();
    }

    /**
     * create the order info. 创建订单信息
     *
     */
    private String getOrderInfo(String subject, String body, String price) {

        // 签约合作者身份ID
        String orderInfo = "partner=" + "\"" + PARTNER + "\"";

        // 签约卖家支付宝账号
        orderInfo += "&seller_id=" + "\"" + SELLER + "\"";

        // 商户网站唯一订单号
        orderInfo += "&out_trade_no=" + "\"" + getOutTradeNo() + "\"";

        // 商品名称
        orderInfo += "&subject=" + "\"" + subject + "\"";

        // 商品详情
        orderInfo += "&body=" + "\"" + body + "\"";

        // 商品金额
        orderInfo += "&total_fee=" + "\"" + price + "\"";

        // 服务器异步通知页面路径
        orderInfo += "&notify_url=" + "\"" + "http://www.baidu.com" + "\"";

        // 服务接口名称， 固定值
        orderInfo += "&service=\"mobile.securitypay.pay\"";

        // 支付类型， 固定值
        orderInfo += "&payment_type=\"1\"";

        // 参数编码， 固定值
        orderInfo += "&_input_charset=\"utf-8\"";

        // 设置未付款交易的超时时间
        // 默认30分钟，一旦超时，该笔交易就会自动被关闭。
        // 取值范围：1m～15d。
        // m-分钟，h-小时，d-天，1c-当天（无论交易何时创建，都在0点关闭）。
        // 该参数数值不接受小数点，如1.5h，可转换为90m。
        orderInfo += "&it_b_pay=\"30m\"";

        // extern_token为经过快登授权获取到的alipay_open_id,带上此参数用户将使用授权的账户进行支付
        // orderInfo += "&extern_token=" + "\"" + extern_token + "\"";

        // 支付宝处理完请求后，当前页面跳转到商户指定页面的路径，可空
        orderInfo += "&return_url=\"m.alipay.com\"";

        // 调用银行卡支付，需配置此参数，参与签名， 固定值 （需要签约《无线银行卡快捷支付》才能使用）
        // orderInfo += "&paymethod=\"expressGateway\"";

        return orderInfo;
    }

    /**
     * get the out_trade_no for an order. 生成商户订单号，该值在商户端应保持唯一（可自定义格式规范）
     *
     */
    private String getOutTradeNo() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return key;
    }

    /**
     * sign the order info. 对订单信息进行签名
     *
     * @param content
     *            待签名订单信息
     */
    private String sign(String content) {
        return SignUtils.sign(content, RSA_PRIVATE);
    }

    /**
     * get the sign type we use. 获取签名方式
     *
     */
    private String getSignType() {
        return "sign_type=\"RSA\"";
    }
}
