package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.CodeUtils;

public class UpdateUserCodeActivity extends BaseActivity {
    ImageView user_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_update_user_code);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("我的二维码");

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        YAccount account = (YAccount) new UserDataShare(this).getUserData();
        ImageView item_user_head = (ImageView) findViewById(R.id.item_user_head);
        SysApplication.DisplayUserImage(account.getAccountHead(),item_user_head);
        TextView item_user_name = (TextView) findViewById(R.id.item_user_name);
        item_user_name.setText(account.getAccountName());
        user_code = (ImageView) findViewById(R.id.user_code);
        user_code.setImageBitmap(CodeUtils.createImage(this, 200, 200));
    }

    @Override
    public void handleMsg(Message msg) {

    }
}
