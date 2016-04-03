package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;

import com.zgld.mall.utils.Contents;

/**
 * 购物车
 *
 */
public class ShoppingCartActivity extends BaseActivity {
    ShoppingCartMethod shoppingCartMethod;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        shoppingCartMethod = new ShoppingCartMethod(this);
        initStyle();
        shoppingCartMethod.onCreate(savedInstanceState);
        registerBoradcastReceiver();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        shoppingCartMethod.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        shoppingCartMethod.onDestroy();
        if (mBroadcastReceiver != null) {
            unregisterReceiver(mBroadcastReceiver);
        }
    }

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(Contents.CAR_UPDATE)) {
                shoppingCartMethod.carUpdate();
            }
        }

    };

    public void registerBoradcastReceiver() {
        IntentFilter myIntentFilter = new IntentFilter();
        myIntentFilter.addAction(Contents.CAR_UPDATE);
        // 注册广播
        registerReceiver(mBroadcastReceiver, myIntentFilter);
    }
}