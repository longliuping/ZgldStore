package com.zgld.mall.activity;

import android.os.Bundle;
import android.os.Message;

import com.zgld.mall.R;

public class PresentDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_present_detail);
    }

    @Override
    public void handleMsg(Message msg) {

    }
}
