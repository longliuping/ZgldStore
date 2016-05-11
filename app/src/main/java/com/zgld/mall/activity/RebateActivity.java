package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.adapter.BuyersOrdersAdapter;
import com.zgld.mall.adapter.RebateAdapter;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.beans.OrdersRebate;
import com.zgld.mall.beans.YRebateRelation;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RebateActivity extends BaseActivity implements PullToRefreshBase.OnRefreshListener2,AdapterView.OnItemClickListener{
    PullToRefreshScrollView scrollview;
    int pageNumber = 1;
    YRebateRelation info = null;
    ListView listview;
    RebateAdapter infoAdapter;
    List<OrdersRebate> listInfo = new ArrayList<>();
    TextView item_money;
    @Override
    public void handleMsg(Message msg) {
        try {
            if(msg.getData().getInt(Contents.STATUS)==200){
                switch (msg.what){
                    case 201:
                        if (pageNumber == 1) {
                            listInfo = new ArrayList<OrdersRebate>();
                            infoAdapter = new RebateAdapter(this, listInfo);
                            listview.setAdapter(infoAdapter);
                        }
                        String json = msg.getData().getString(Contents.JSON);
                        JSONObject jsonObject = new JSONObject(json).getJSONObject(Contents.DATA);
                        JSONArray jsonArray = jsonObject.getJSONArray(Contents.LISTINIFO);
                        Type entityType = new TypeToken<List<OrdersRebate>>() {
                        }.getType();
                        Gson gson = new Gson();
                        List<OrdersRebate> list = gson.fromJson(jsonArray.toString(), entityType);
                        if (list != null && list.size() > 0) {
                            listInfo.addAll(list);
                        }
                        Double income = jsonObject.getDouble("income");
                        item_money.setText(PriceUtil.price(income+""));
                        infoAdapter.notifyDataSetChanged();
                        pageNumber++;
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();;
        }finally {
            scrollview.onRefreshComplete();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_rebate);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("产生的收益");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        info = (YRebateRelation) this.getIntent().getSerializableExtra(Contents.INFO);
        if(info==null){
            finish();;
            return;
        }
        scrollview = (PullToRefreshScrollView) findViewById(R.id.scrollview);
        scrollview.setMode(PullToRefreshBase.Mode.BOTH);
        scrollview.setOnRefreshListener(this);
        listview = (ListView) findViewById(R.id.listview);
        listview.setOnItemClickListener(this);
        listInfo = new ArrayList<>();
        infoAdapter = new RebateAdapter(this,listInfo);
        listview.setAdapter(infoAdapter);
        ImageView item_user_head = (ImageView) findViewById(R.id.item_user_head);
        SysApplication.DisplayUserImage(info.getAccount().getAccountHead(), item_user_head);
        TextView item_user_name = (TextView) findViewById(R.id.item_user_name);
        item_user_name.setText(info.getAccount().getAccountName());
        TextView item_user_address = (TextView) findViewById(R.id.item_user_address);
        item_user_address.setText(info.getAccount().getAccountPlace());
        item_money = (TextView) findViewById(R.id.item_money);
        initData();;
    }
    private void initData(){
        Map m = new HashMap();
        m.put("id",info.getRebateRelationId()+"");
        m.put(Contents.PAGENUM,pageNumber+"");
        m.put(Contents.PAGESIZE,20+"");
        getData(this,201,"recommend/find_user_order_rebate.html", m, null);
    }


    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        pageNumber = 1;
        initData();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        initData();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
