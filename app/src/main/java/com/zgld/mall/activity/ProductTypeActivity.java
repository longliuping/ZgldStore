package com.zgld.mall.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.HomeProductAdapter;
import com.zgld.mall.beans.HishopCategories;
import com.zgld.mall.beans.HishopProductTypes;
import com.zgld.mall.beans.HishopProducts;
import com.zgld.mall.beans.Products;
import com.zgld.mall.utils.Contents;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductTypeActivity extends BaseActivity implements AdapterView.OnItemClickListener,PullToRefreshBase.OnRefreshListener2{
    PullToRefreshScrollView scrollview;
    GridView gridview;
    HishopCategories info = null;
    int pageNum = 1;
    HomeProductAdapter infoAdapter;
    List<Products> listInfo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_product_type);
        info = (HishopCategories) this.getIntent().getSerializableExtra(Contents.INFO);
        if(info==null){
            finish();;
            return;
        }
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText(info.getName());
        gridview = (GridView) findViewById(R.id.gridview);
        gridview.setOnItemClickListener(this);
        scrollview = (PullToRefreshScrollView) findViewById(R.id.scrollview);
        scrollview.setFocusable(true);
        scrollview.setFocusableInTouchMode(true);
        scrollview.requestFocus();
        scrollview.setMode(PullToRefreshBase.Mode.BOTH);
        scrollview.setOnRefreshListener(this);
        initData();
    }
    void initData(){
        getData(Request.Method.GET, 201, "product/home_type_product.html?id="+info.getAssociatedProductType()+"&pageSize=18&pageNum="+pageNum, null, null, pageNum);
    }
    @Override
    public void handleMsg(Message msg) {
        scrollview.onRefreshComplete();
        try{
            if(msg.getData().getInt(Contents.STATUS)==200){
                JSONArray jsonArray = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
                switch (msg.what){
                    case 201:
                        if(pageNum==1){
                            listInfo = new ArrayList<>();
                            infoAdapter = new HomeProductAdapter(this,listInfo);
                            gridview.setAdapter(infoAdapter);
                        }
                        List<Products> listObj  = new Gson().fromJson(jsonArray.toString(),new TypeToken<List<Products>>() {
                        }.getType());
                        if(listObj!=null && listObj.size()>0){
                            listInfo.addAll(listObj);
                        }
                        infoAdapter.notifyDataSetChanged();
                        pageNum++;
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ProductDetailActivity.class);
        intent.putExtra(Contents.PRODUCTID,listInfo.get(position).getProductId());
        startActivity(intent);
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
}
