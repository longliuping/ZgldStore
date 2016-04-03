package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;

import com.zgld.mall.R;

public class RechargeDetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_recharge_details);
    }

    @Override
    public void handleMsg(Message msg) {

    }
}
