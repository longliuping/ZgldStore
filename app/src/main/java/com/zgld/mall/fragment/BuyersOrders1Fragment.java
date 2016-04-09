package com.zgld.mall.fragment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

import com.android.volley.Request.Method;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshExpandableListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.BuyersOrdersAdapter;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.volley.NetWorkTools;

public class BuyersOrders1Fragment extends BuyersOrdersBaseFragment implements OnRefreshListener2,
        OnItemClickListener, OnClickListener,BuyersOrdersAdapter.BuyersOrdersAdapterListener {
    List<Orders> listInfo = new ArrayList<Orders>();
    PullToRefreshExpandableListView listview;
    BuyersOrdersAdapter infoAdapter;
    View view;
    Activity activity;
    View null_data_default, network_error;
    int pageNum = 1;
    @Override
    public void onAttach(Activity activity) {
        this.activity = activity;
        super.onAttach(activity);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.seller_orders_expandable, null);
            isPrepared = true;
            lazyLoad();
            registerBoradcastReceiver();
        } else {
            ViewGroup group = (ViewGroup) view.getParent();
            if (group != null) {
                group.removeView(view);
            }
        }

        return view;
    }

    private void initData() {
        network_error.setVisibility(View.GONE);
        null_data_default.setVisibility(View.GONE);
        if (pageNum == 1 && !NetWorkTools.isHasNet(activity)) {
            null_data_default.setVisibility(View.GONE);
            network_error.setVisibility(View.VISIBLE);
            network_error.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    initData();
                }
            });
            listview.onRefreshComplete();
            return;
        }
        Map<String,String> m = new HashMap<>();
        m.put(Contents.PAGENUM,pageNum+"");
        m.put(Contents.PAGESIZE,20+"");
        m.put("id","1");
        getData(202, "order/user_order.html", m, null);
    }

    @Override
    public void handleMsg(Message msg) {
        try {
            Bundle bundle = msg.getData();
            String json = "";
            json = bundle.getString(Contents.JSON);
            Gson gson = new Gson();
            Type entityType = null;
            JSONArray jsonArray = new JSONArray();
            if(msg.getData().getInt(Contents.STATUS)!=200){
                return;
            }
            switch (msg.what) {
                case 202:
                    if (pageNum == 1) {
                        listInfo = new ArrayList<Orders>();
                        infoAdapter = new BuyersOrdersAdapter(activity, listInfo,this);
                        listview.getRefreshableView().setAdapter(infoAdapter);
                    }
                    JSONObject jsonObject = new JSONObject(json).getJSONObject(Contents.DATA);
                    jsonArray = jsonObject.getJSONArray(Contents.LISTINIFO);
                    entityType = new TypeToken<List<Orders>>() {
                    }.getType();
                    List<Orders> list = gson.fromJson(jsonArray.toString(), entityType);
                    if (list != null && list.size() > 0) {
                        listInfo.addAll(list);
                        infoAdapter = new BuyersOrdersAdapter(activity, listInfo,this);
                        listview.getRefreshableView().setAdapter(infoAdapter);
                        int groupCount = listview.getRefreshableView().getCount();
                        for (int i = 0; i < groupCount; i++) {
                            listview.getRefreshableView().expandGroup(i);
                        }
                        infoAdapter.notifyDataSetChanged();
                        pageNum++;
                    }
                    if (listInfo == null || listInfo.size() <= 0) {
                        null_data_default.setVisibility(View.VISIBLE);
                    } else {
                        null_data_default.setVisibility(View.GONE);
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            listview.onRefreshComplete();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        pageNum = 1;
        initData();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        initData();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    int sendCargoPosition;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == activity.RESULT_OK) {
            if (requestCode == 209) {
//                listInfo.remove(commentProductPosition);
                infoAdapter.notifyDataSetChanged();
            }
        }
    }

    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(BroadcastUtils.BUYERS_ORDER_ACTION_NAME)) {
            }
        }

    };

    public void registerBoradcastReceiver() {
        IntentFilter myIntentFilter = new IntentFilter();
        myIntentFilter.addAction(BroadcastUtils.BUYERS_ORDER_ACTION_NAME);
        activity.registerReceiver(mBroadcastReceiver, myIntentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mBroadcastReceiver != null) {
            activity.unregisterReceiver(mBroadcastReceiver);
        }
    }

    private int mCurIndex = -1;
    /** 标志位，标志已经初始化完成 */
    private boolean isPrepared;
    /** 是否已被加载过一次，第二次就不再去请求数据了 */
    private boolean mHasLoadedOnce;

    @Override
    protected void lazyLoad() {
        if (!isPrepared || !isVisible || mHasLoadedOnce) {
            return;
        }
        listview = (PullToRefreshExpandableListView) view.findViewById(R.id.listview);
        listview.setMode(Mode.BOTH);
        listview.setOnRefreshListener(this);
        listview.setOnItemClickListener(this);
        listview.getRefreshableView().setGroupIndicator(null);
        listview.getRefreshableView().setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        pageNum = 1;
        listInfo = new ArrayList<Orders>();
        infoAdapter = new BuyersOrdersAdapter(activity, listInfo,this);
        listview.getRefreshableView().setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();
        null_data_default = view.findViewById(R.id.null_data_default);
        null_data_default.setVisibility(View.GONE);
        network_error = view.findViewById(R.id.network_error);
        network_error.setVisibility(View.GONE);
        initData();
    }

    @Override
    public void update(int tag, Bundle bundle) {
        infoAdapter.notifyDataSetChanged();
    }
}