package com.zgld.mall.alipay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;

import com.zgld.mall.activity.BuyersOrdersFragmentActivity;
import com.zgld.mall.beans.OrderPayConfig;

/**
 * Created by Am on 2016/4/15.
 */
public class AlipayPay {
    public interface  AlipayPayListener{
        public void onCompelete(Context context,Message msg);
    }
    public void pay(final Context context,OrderPayConfig config,final AlipayPayListener listener){
        new AsyncAlipay((Activity)context, new AsyncAlipay.AsyncAlipayListener() {
            public static final String RSA_PUBLIC = "";
            private static final int SDK_PAY_FLAG = 1;
            @Override
            public void complete(Message msg) {
                switch (msg.what) {
                    case SDK_PAY_FLAG: {
                        PayResult payResult = new PayResult((String) msg.obj);
                        /**
                         * 同步返回的结果必须放置到服务端进行验证（验证的规则请看https://doc.open.alipay.com/doc2/
                         * detail.htm?spm=0.0.0.0.xdvAU6&treeId=59&articleId=103665&
                         * docType=1) 建议商户依赖异步通知
                         */
                        String resultInfo = payResult.getResult();// 同步返回需要验证的信息

                        String resultStatus = payResult.getResultStatus();
                        // 判断resultStatus 为“9000”则代表支付成功，具体状态码代表含义可参考接口文档
                        if (TextUtils.equals(resultStatus, "9000")) {
                            Toast.makeText(context, "支付成功", Toast.LENGTH_SHORT).show();
//                            listener.update(2,null);
                        } else {
                            // 判断resultStatus 为非"9000"则代表可能支付失败
                            // "8000"代表支付结果因为支付渠道原因或者系统原因还在等待支付结果确认，最终交易是否成功以服务端异步通知为准（小概率状态）
                            if (TextUtils.equals(resultStatus, "8000")) {
                                Toast.makeText(context, "支付结果确认中", Toast.LENGTH_SHORT).show();

                            } else {
                                // 其他值就可以判断为支付失败，包括用户主动取消支付，或者系统返回的错误
                                Toast.makeText(context, "支付失败", Toast.LENGTH_SHORT).show();
                            }
                        }
                        break;
                    }
                    default:
                        break;
                }
                listener.onCompelete(context,msg);
            }
        }).pay(config);
    }
}
