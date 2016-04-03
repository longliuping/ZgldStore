package com.zgld.mall.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.zgld.mall.R;

/**
 * Created by ILoveYou on 2016/3/4.
 */
public class ConfirmDialog extends Dialog {

    private Context context;
    private String title;

    public ConfirmDialog(Context context, String title) {
        super(context, R.style.MyDialogStyle);
        this.context = context;
        this.title = title;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    public void init() {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_main, null);
        setContentView(view);
        TextView tv = (TextView) view.findViewById(R.id.title);
        if (TextUtils.isEmpty(title)) {
            tv.setText("正在加载中...");
        } else {
            tv.setText(title);
        }
        Window dialogWindow = getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        DisplayMetrics d = context.getResources().getDisplayMetrics(); // 获取屏幕宽、高用
        lp.width = (int) (d.widthPixels * 0.8); // 高度设置为屏幕的0.6
        dialogWindow.setAttributes(lp);
    }

}