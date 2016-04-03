package com.zgld.mall.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.zgld.mall.R;
import com.zgld.mall.utils.ConfirmDialog;
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
    protected ConfirmDialog confirmDialog = null;
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
    public void onCompelete(int tag, String json) {
        Message msg = handler.obtainMessage();
      try{
          msg.what = tag;
          JSONObject object = new JSONObject(json);
          String msgStr = object.getString(Contents.MSG);
          if(!msgStr.equals(Contents.SUCCESS)) {
              Toast.makeText(activity, msgStr, Toast.LENGTH_SHORT).show();
          }
          Bundle data = new Bundle();
          data.putString(Contents.JSON, json);
          data.putInt(Contents.STATUS, object.getInt(Contents.STATUS));
          data.putString(Contents.DATA,object.getJSONObject(Contents.DATA).toString());
          data.putBoolean("cache", false);
          msg.setData(data);
          if (confirmDialog != null && confirmDialog.isShowing()) {
              confirmDialog.dismiss();
          }
          if(object.getInt(Contents.STATUS)==201){
              dialog = new CustomDialog(getContext(), R.style.mystyle, R.layout.customdialog, R.array.title_not_user, new CustomDialog.CustomDialogListener() {
                  @Override
                  public void customDialogClickLeft() {
                      dialog.dismiss();
                      Contents.loginPage(getActivity(), null, 200);
                  }

                  @Override
                  public void customDialogClickRight() {
                      dialog.dismiss();
                      Contents.loginPage(getActivity(),null,200);
                  }
              },false);
              dialog.show();
          }
      }catch (Exception e){
          e.printStackTrace();
      }
        handler.sendMessage(msg);
    }

    /**
     * 请求出现异常时
     */

    @Override
    public void onException(String exception) {
        if (confirmDialog != null && confirmDialog.isShowing()) {
            confirmDialog.dismiss();
        }
        handler.sendEmptyMessage(Contents.TAG_ERROES);
        if (exception != null && exception.equals("com.android.volley.ServerError")) {
            Toast.makeText(activity, activity.getString(R.string.network_connection_error), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(activity, activity.getString(R.string.network_connection_timeout), Toast.LENGTH_SHORT)
                    .show();
        }
    }
    /**
     * 获取网络数据的方法
     * @param method 请求方法(get或post)
     * @param tag 请求标识
     * @param url 请求的地址
     * @param m 请求参数
     * @param title  请求的标题
     * @param pageIndex  请求的页数
     * @return
     */
    public RequestQueue getData(int method, int tag, String url, Map m, String title, int pageIndex) {
        if (NetWorkTools.isHasNet(activity)) {
            if (pageIndex == 1) {
                if (confirmDialog == null) {
                    confirmDialog = new ConfirmDialog(activity, title);
                }
                if (confirmDialog.isShowing()) {
                    confirmDialog.dismiss();
                }
                confirmDialog.show();
            }
            return AsyncGameRunner.request(method, tag, Contents.BASE_URL + url, this, getActivity(), m);
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
     * @param method
     * @param tag
     * @param url
     * @param m
     * @param title
     * @param pageIndex
     */
    public void getDataCache(int method, int tag, String url, Map m, String title, int pageIndex) {
       try{
           if (pageIndex == 1) {
               RequestQueue queue = Volley.newRequestQueue(activity);
               Cache.Entry en = queue.getCache().get(Contents.BASE_URL + url);
               if (en != null && en.data != null) {
                   String json = new String(en.data);
                   Message msg = handler.obtainMessage();
                   msg.what = tag;
                   Bundle data = new Bundle();
                   JSONObject object = new JSONObject(json);
                   data.putString(Contents.JSON, json);
                   data.putInt(Contents.STATUS, object.getInt(Contents.STATUS));
                   data.putString(Contents.DATA,object.getJSONObject(Contents.DATA).toString());
                   data.putBoolean("cache", false);
                   msg.setData(data);
                   if (confirmDialog != null && confirmDialog.isShowing()) {
                       confirmDialog.dismiss();
                   }
                   handler.sendMessage(msg);
               }
           }
       }catch (Exception e){
           e.printStackTrace();;
       }
    }
    long time = 0;
}
