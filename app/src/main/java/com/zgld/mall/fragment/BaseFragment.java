package com.zgld.mall.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.zgld.mall.R;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.CustomDialog;
import com.zgld.mall.volley.AsyncGameRunner;
import com.zgld.mall.volley.NetWorkTools;
import com.zgld.mall.volley.RequestListenr;

import org.json.JSONObject;

import java.util.Date;
import java.util.Map;

/**
 * Created by ILoveYou on 2016/3/4.
 */
public abstract class BaseFragment extends Fragment implements RequestListenr {
    CustomDialog dialog;
    public Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            handleMsg(msg);
        };
    };

    public abstract void handleMsg(android.os.Message msg);
    private Activity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public void onCompelete(Message msg) {
        Message message = handler.obtainMessage();
        message.what = msg.what;
        message.setData(msg.getData());
        handler.sendMessage(message);
    }

    /**
     * 请求出现异常时
     */

    @Override
    public void onException(String exception) {
        handler.sendEmptyMessage(Contents.TAG_ERROES);
    }
    /**
     * 获取网络数据的方法
     * @param tag 请求标识
     * @param url 请求的地址
     * @param m 请求参数
     * @param title  请求的标题
     * @return
     */
    public RequestQueue getData(int tag, String url, Map m, String title) {
        if (NetWorkTools.isHasNet(activity)) {
            return AsyncGameRunner.request(tag, Contents.BASE_URL + url, this, getActivity(), m,title);
        } else {
            if (time + 2000 < new Date().getTime()) {
                time = new Date().getTime();
                Toast.makeText(activity, activity.getString(R.string.no_wifi_or_open_mobile_data), Toast.LENGTH_SHORT)
                        .show();
            }
            handler.sendEmptyMessage(Contents.TAG_ERROES);
        }
        return null;
    }

    /**
     *
     * @param tag
     * @param url
     * @param m
     * @param title
     */
    public void getDataCache(int tag, String url, Map m, String title) {
       try{
           RequestQueue queue = Volley.newRequestQueue(activity);
           Cache.Entry en = queue.getCache().get(Contents.BASE_URL + url);
           if (en != null && en.data != null) {
               String json = new String(en.data);
               Message msg = handler.obtainMessage();
               msg.what = tag;
               Bundle data = new Bundle();
              if(json!=null && json.length()>10){
                  JSONObject object = new JSONObject(json);
                  data.putString(Contents.JSON, json);
                  data.putInt(Contents.STATUS, object.getInt(Contents.STATUS));
                  data.putString(Contents.DATA, object.getJSONObject(Contents.DATA).toString());
                  msg.setData(data);
              }
               handler.sendMessage(msg);
           }
       }catch (Exception e){
           e.printStackTrace();;
       }
    }
    long time = 0;
}
