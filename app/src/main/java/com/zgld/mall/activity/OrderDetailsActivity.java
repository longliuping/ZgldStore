package com.zgld.mall.activity;

import android.location.Address;
import android.os.Bundle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.R;
import com.zgld.mall.adapter.OrderDetailsAdapter;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.utils.Contents;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ExpandableListView.OnGroupClickListener;

/**
 * 订单详情
 *
 */
public class OrderDetailsActivity extends BaseActivity {

    ExpandableListView listview;
    OrderDetailsAdapter infoAdapter;
    int pageIndex = 1;

    public static List<Orders> listInfo = new ArrayList<>();

    TextView name, address, address_title;
    Address addressInfo;
    String orderId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_order_details);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated com.android.volley.Request.Method stub
                finish();
            }
        });
        orderId = this.getIntent().getStringExtra("orderId");
        ScrollView scrollview = (ScrollView) findViewById(R.id.scrollview);
        scrollview.setFocusable(true);
        scrollview.setFocusableInTouchMode(true);
        scrollview.requestFocus();
        listview = (ExpandableListView) findViewById(R.id.listview);
        listview.setGroupIndicator(null);
        listview.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                // TODO Auto-generated com.android.volley.Request.Method stub
                return true;
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_order_details));
        name = (TextView) findViewById(R.id.name);
        address = (TextView) findViewById(R.id.address);
        address_title = (TextView) findViewById(R.id.address_title);
//        getData(com.android.volley.Request.Method.GET, 201, "Orders/OrderItems?token="
//                + Contents.getUser(this).getToken() + "&orderId=" + orderId + "&pageSize=100&pageIndex=" + pageIndex
//                + "", null, null, pageIndex);
    }

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        Bundle bundle = msg.getData();
        String json = "";
        if (bundle == null) {
            return;
        }
        json = bundle.getString(Contents.JSON);
        if (json == null) {
            return;
        }
        Gson gson = new Gson();
        Type entityType = null;
        switch (msg.what) {
            case 201:
                entityType = new TypeToken<Orders>() {
                }.getType();
                try {
//                    listInfo = new Orders.OrderItems();
//                    listInfo = gson.fromJson(new JSONObject(json).getJSONObject("data").toString(), entityType);
//                    infoAdapter = new OrderDetailsAdapter(this, listInfo);
                    listview.setAdapter(infoAdapter);
                    infoAdapter.notifyDataSetChanged();
                    int groupCount = listview.getCount();
                    for (int i = 0; i < groupCount; i++) {
                        listview.expandGroup(i);
                    }
                    pageIndex++;
//                    if (listInfo != null && listInfo.getOrders() != null) {
//                        for (int i = 0; i < listInfo.getOrders().size(); i++) {
//                            OrderItems.Order obj = listInfo.getOrders().get(i);
//                            name.setText("收货人:" + obj.getShipTo() + "    " + obj.getCellPhone());
//                            address.setText("收货地址:" + obj.getShippingRegion());
//                        }
//                    }
                } catch (JsonSyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
        }
    }
}

