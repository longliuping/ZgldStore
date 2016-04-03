package com.zgld.mall.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.activity.ShoppingCartMethod;
import com.zgld.mall.utils.Contents;

public class CarFragment extends BaseFragment {

    ShoppingCartMethod shoppingCartMethod;
    public CarFragment() {
        // Required empty public constructor
    }


    @Override
    public void handleMsg(Message msg) {

    }

    Activity activity;

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        this.activity = activity;
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        shoppingCartMethod = new ShoppingCartMethod(activity);
        registerBoradcastReceiver();
    }
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = shoppingCartMethod.onCreateView(inflater, container, savedInstanceState);

        } else {
            ViewGroup group = (ViewGroup) view.getParent();
            if (group != null) {
                group.removeView(view);
            }
        }
        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        shoppingCartMethod.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        shoppingCartMethod.onDestroy();
        if (mBroadcastReceiver != null) {
            activity.unregisterReceiver(mBroadcastReceiver);
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
        activity.registerReceiver(mBroadcastReceiver, myIntentFilter);
    }
}
