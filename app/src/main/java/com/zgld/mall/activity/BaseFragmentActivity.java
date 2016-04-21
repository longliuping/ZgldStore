package com.zgld.mall.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.dialog.ConfirmDialog;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.volley.AsyncGameRunner;
import com.zgld.mall.volley.NetWorkTools;
import com.zgld.mall.volley.RequestListenr;

import java.util.Date;
import java.util.Map;

/**
 * Created by LongLiuPing on 2016/3/3.阿巴斯
 */
public abstract class BaseFragmentActivity extends FragmentActivity  implements RequestListenr {
    public static ConfirmDialog confirmDialog = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        initStyle();
    }
    public Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            handleMsg(msg);
        };
    };

    public abstract void handleMsg(android.os.Message msg);
    /**
     * 初始化透明状态栏
     */
    protected void initStyle() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);// 透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);// 透明导航栏
        }
    }

    /**
     * 请求成功
     */
    @Override
    public void onCompelete(Message msg) {
        Message message = handler.obtainMessage();
        message.what = msg.what;
        message.setData(msg.getData());
        if (confirmDialog != null && confirmDialog.isShowing()) {
            confirmDialog.dismiss();
        }
        handler.sendMessage(message);
    }

    /**
     * 请求出现异常
     */

    @Override
    public void onException(String exception) {
        if (confirmDialog != null && confirmDialog.isShowing()) {
            confirmDialog.dismiss();
        }
        handler.sendEmptyMessage(Contents.TAG_ERROES);
    }
    public void getData(Context context,int tag, String url, Map m, String title) {
        if (NetWorkTools.isHasNet(getApplicationContext())) {
            if (title!=null && title.length()>2) {
                if (confirmDialog == null) {
                    confirmDialog = new ConfirmDialog(this, title);
                }
                if (confirmDialog.isShowing()) {
                    confirmDialog.dismiss();
                }
                confirmDialog.show();
            }
            AsyncGameRunner.request(tag, url, this, this, m,title);
        } else {
            if (time + 2000 < new Date().getTime()) {
                time = new Date().getTime();
                Toast.makeText(this, getString(R.string.no_wifi_or_open_mobile_data), Toast.LENGTH_SHORT).show();
            }
            handler.sendEmptyMessage(Contents.TAG_ERROES);
        }
    }
    long time = 0;
}
