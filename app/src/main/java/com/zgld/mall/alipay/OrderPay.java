package com.zgld.mall.alipay;

import android.content.Context;
import android.os.Message;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.beans.OrderPayConfig;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.volley.AsyncGameRunner;
import com.zgld.mall.volley.RequestListenr;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Am on 2016/4/15.
 */
public class OrderPay {
    public interface OrderPayListener{
        public void onCompelete(Message msg);
    }
    public void pay(int orderId,final Context context, final OrderPayListener listener){
        Map<String, String> m = new HashMap<String, String>();
        m.put("orderid",orderId+"");
        AsyncGameRunner.request(201, "order/alipay_order_config.html", new RequestListenr() {
            @Override
            public void onCompelete(Message msg) {
                try {
                    if (msg.getData().getInt(Contents.STATUS) == 200) {
                        switch (msg.what) {
                            case 201:
                                String json = msg.getData().getString(Contents.DATA);
                                JSONObject jsonObject = new JSONObject(json).getJSONObject(Contents.INFO);
                                OrderPayConfig config = new Gson().fromJson(jsonObject.toString(), new TypeToken<OrderPayConfig>() {
                                }.getType());
                                if (config != null) {
                                    new AlipayPay().pay(context, config, new AlipayPay.AlipayPayListener() {
                                        @Override
                                        public void onCompelete(Context context, Message msg) {
//                                            listener.update(2, null);
                                            listener.onCompelete(msg);
                                        }
                                    });
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onException(String exception) {

            }
        }, context, m, null);

    }
}
