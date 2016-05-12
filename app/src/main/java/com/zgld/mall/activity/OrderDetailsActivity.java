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
import com.zgld.mall.utils.PriceUtil;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
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
    Orders info;
    List<String> listKey = new ArrayList<>();
    List<String> listValue = new ArrayList<>();

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
        info = (Orders)this.getIntent().getSerializableExtra(Contents.INFO);
        if(info==null){
            finish();
            return;
        }
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
        listKey.add("订单编号：");listValue.add(info.getOrderId() + "");
        listKey.add("下单时间：");listValue.add(info.getOrderDate());
        listKey.add("商品金额：");listValue.add(PriceUtil.priceY(info.getOrderTotalPrice() + ""));
        switch (info.getPaymentStatus()){
            case 1:
                listKey.add("支付状态："); listValue.add("已付款");
                listKey.add("支付时间：");listValue.add(info.getPayDateTime());
                listKey.add("支付用户号：");listValue.add(info.getBuyerId()+"");
                listKey.add("支付账号：");listValue.add(info.getBuyerAccount());
                listKey.add("支付金额：");listValue.add(PriceUtil.priceY(info.getPayTotalFee() + ""));
                listKey.add("支付交易号：");listValue.add(info.getPayTradeNo());
                break;
        }
        switch (info.getConsumptionStatus()){
            case 1:
                listKey.add("使用状态："); listValue.add("已使用");
                break;
        }
        switch (info.getRefundStatus()){
            case 1:
                listKey.add("退款时间：");listValue.add(info.getRefundDateTime());
                listKey.add("退款金额：");listValue.add(PriceUtil.priceY(info.getRefundTotalFee() + ""));
                break;
        }
        ListView listview_detail = (ListView) findViewById(R.id.listview_detail);
        DetailAdapter adapter = new DetailAdapter();
        listview_detail.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
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
    class DetailAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return listKey.size();
        }

        @Override
        public Object getItem(int position) {
            return listKey.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        class ViewHolder{
            TextView left_title,right_title;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder vh = null;
            if(convertView==null){
                vh = new ViewHolder();
                convertView = LayoutInflater.from(OrderDetailsActivity.this).inflate(R.layout.item_order_detail_info,null);
                vh.left_title = (TextView) convertView.findViewById(R.id.left_title);
                vh.right_title = (TextView) convertView.findViewById(R.id.right_title);
                convertView.setTag(vh);
            }else{
                vh = (ViewHolder) convertView.getTag();
            }
            String key = listKey.get(position);
            if(key!=null){
                vh.left_title.setText(key+"");
                vh.right_title.setText(listValue.get(position)+"");
            }
            return convertView;
        }
    }
}

