package com.zgld.mall.activity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.BalanceDrawRequestAdapter;
import com.zgld.mall.adapter.InpourRequestAdapter;
import com.zgld.mall.beans.InpourRequest;
import com.zgld.mall.utils.Contents;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InpourRequestActivity extends BaseActivity implements PullToRefreshBase.OnRefreshListener2{
    PullToRefreshListView listview;
    int pageNum = 1;
    List<InpourRequest> listInfo = new ArrayList<>();
    InpourRequestAdapter infoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_inpour_request);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText(this.getIntent().getStringExtra("name") + "");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        listview = (PullToRefreshListView) findViewById(R.id.listview);
        listview.setOnRefreshListener(this);
        listview.setMode(PullToRefreshBase.Mode.BOTH);
        initData();
    }
    @Override
    public void handleMsg(Message msg) {
        try
        {
            if(msg.getData().getInt(Contents.STATUS)==200){
                switch (msg.what){
                    case 201:
                        JSONArray jsonArray = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
                        Gson gson = new Gson();
                        List<InpourRequest>listObj = gson.fromJson(jsonArray.toString(),new TypeToken<List<InpourRequest>>(){}.getType());
                        if(pageNum==1){
                            listInfo = new ArrayList<>();
                            infoAdapter = new InpourRequestAdapter(this,listInfo);
                            listview.setAdapter(infoAdapter);
                        }
                        listInfo.addAll(listObj);
                        infoAdapter.notifyDataSetChanged();
                        pageNum++;
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            listview.onRefreshComplete();
        }
    }
    public void initData(){
        Map<String,String> m = new HashMap<>();
        m.put("pageSize",20+"");
        m.put("pageNum",pageNum+"");
        getData(201, "account/find_inpour_request.html", m,null);
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
