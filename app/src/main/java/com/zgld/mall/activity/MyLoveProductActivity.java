package com.zgld.mall.activity;

import android.os.Bundle;

import com.zgld.mall.R;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.zgld.mall.adapter.ProductListAdapter;
import com.zgld.mall.beans.Products;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.volley.NetWorkTools;
import com.zgld.mall.widget.MyGridView;

/**
 * 喜欢
 *
 */
public class MyLoveProductActivity extends BaseActivity implements OnRefreshListener2, OnItemClickListener,
        OnClickListener {
    List<Products> listInfo;
    PullToRefreshScrollView scrollview;
    MyGridView gridview;
    ProductListAdapter infoAdapter;
    int pageIndex = 1;
    TextView name, cdk_number;
    ImageView head, code;
    View null_data_default, network_error;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        try {
            Bundle bundle = msg.getData();
            String json = "";
            if (bundle == null) {
                return;
            }
            json = bundle.getString(Contents.JSON);
            Gson gson = new Gson();
            Type entityType = null;
            JSONArray jsonArray = new JSONArray();
            try {
                if (json != null) {
                    JSONObject jsonObject = new JSONObject(json);
                    jsonArray = jsonObject.getJSONArray(Contents.DATA);
                }
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            switch (msg.what) {
                case 201:
                    entityType = new TypeToken<List<Products>>() {
                    }.getType();
                    if (pageIndex == 1) {
                        listInfo = new ArrayList<Products>();
                        infoAdapter = new ProductListAdapter(this, listInfo);
                        gridview.setAdapter(infoAdapter);
                    }
                    List<Products> list = gson.fromJson(jsonArray.toString(), entityType);
                    if (list == null || list.size() <= 0) {
                        Toast.makeText(this, getString(R.string.no_data), Toast.LENGTH_SHORT).show();
                    }
                    if (list != null) {
                        listInfo.addAll(list);
                    }
                    infoAdapter.notifyDataSetChanged();
                    pageIndex++;
                    if (listInfo == null || listInfo.size() <= 0) {
                        null_data_default.setVisibility(View.VISIBLE);
                    } else {
                        null_data_default.setVisibility(View.GONE);
                    }
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            scrollview.onRefreshComplete();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_my_love_product);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated com.android.volley.Request.Method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_love));
        scrollview = (PullToRefreshScrollView) findViewById(R.id.scrollview);
        scrollview.setOnRefreshListener(this);
        scrollview.setMode(Mode.BOTH);
        scrollview.setFocusable(true);
        scrollview.setFocusableInTouchMode(true);
        scrollview.requestFocus();
        gridview = (MyGridView) findViewById(R.id.gridview);
        gridview.setOnItemClickListener(this);
        name = (TextView) findViewById(R.id.name);
        cdk_number = (TextView) findViewById(R.id.cdk_number);
        head = (ImageView) findViewById(R.id.head);
        code = (ImageView) findViewById(R.id.code);
        findViewById(R.id.user_data_base).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MyLoveProductActivity.this, PersonalDataActivity.class));
            }
        });
//        name.setText(Contents.getUser(this).getNickname());
//        cdk_number.setText(getString(R.string.cdk_number) + Contents.getUser(this).getUserId());
//        SysApplication.DisplayImage(Contents.getUser(this).getHeadImg(), head);
//        name.setText(Contents.getUser(this).getNickname());
        null_data_default = findViewById(R.id.null_data_default);
        null_data_default.setVisibility(View.GONE);
        network_error = findViewById(R.id.network_error);
        network_error.setVisibility(View.GONE);
        initData();
    }

    private void initData() {
        network_error.setVisibility(View.GONE);
        null_data_default.setVisibility(View.GONE);
        if (pageIndex == 1 && !NetWorkTools.isHasNet(this)) {
            null_data_default.setVisibility(View.GONE);
            network_error.setVisibility(View.VISIBLE);
            network_error.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    initData();
                }
            });
            scrollview.onRefreshComplete();
            return;
        }
//        getData(com.android.volley.Request.Method.GET, 201,
//                "UserOrProduct/GetLikeProduct?userId=" + Contents.getUser(this).getUserId() + "&token="
//                        + Contents.getUser(this).getToken() + "&pageSize=20&pageIndex=" + pageIndex + "&startDate",
//                null, null, pageIndex);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // TODO Auto-generated com.android.volley.Request.Method stub
//        Intent intent = new Intent(this, ProductDetailActivity.class);
//        intent.putExtra(Contents.PRODUCTID, listInfo.get(position).getProductId());
//        startActivityForResult(intent, 200);
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        pageIndex = 1;
        initData();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        initData();
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated com.android.volley.Request.Method stub
    }
}

