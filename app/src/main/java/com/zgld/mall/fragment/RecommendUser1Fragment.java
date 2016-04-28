package com.zgld.mall.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.RecommendUserAdapter;
import com.zgld.mall.beans.YRebateRelation;
import com.zgld.mall.utils.Contents;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendUser1Fragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2,
        AdapterView.OnItemClickListener, View.OnClickListener {
    View view;
    PullToRefreshListView listview;
    Activity activity;
    int pageNum = 1;
    List<YRebateRelation> listInfo = new ArrayList<YRebateRelation>();
    RecommendUserAdapter infoAdapter;
    @Override
    public void onAttach(Activity activity) {
        this.activity = activity;
        super.onAttach(activity);
    }
    public RecommendUser1Fragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static RecommendUser1Fragment newInstance(String param1, String param2) {
        RecommendUser1Fragment fragment = new RecommendUser1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void handleMsg(Message msg) {
        try {
            if(msg.getData().getInt(Contents.STATUS)==200){
                Bundle bundle = msg.getData();
                String json = "";
                json = bundle.getString(Contents.JSON);
                if(bundle.getInt(Contents.STATUS)!=200)
                {
                    return;
                }
                if (json == null) {
                    return;
                }
                Gson gson = new Gson();
                Type entityType = null;
                switch (msg.what) {
                    case 201:
                        JSONArray jsonArray = new JSONObject(json).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
                        listInfo = new ArrayList<YRebateRelation>();
                        entityType = new TypeToken<List<YRebateRelation>>() {
                        }.getType();
                        List<YRebateRelation> list = gson.fromJson(jsonArray.toString(), entityType);
                        if (list != null) {
                            listInfo.addAll(list);
                        }
                        infoAdapter = new RecommendUserAdapter(activity,listInfo);
                        listview.setAdapter(infoAdapter);
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_recommend_user1, null);
            lazyLoad();
        } else {
            ViewGroup group = (ViewGroup) view.getParent();
            if (group != null) {
                group.removeView(view);
            }
        }

        return view;
    }

    protected void lazyLoad() {
        listview = (PullToRefreshListView) view.findViewById(R.id.listview);
        listview.setMode(PullToRefreshBase.Mode.BOTH);
        listview.setOnRefreshListener(this);
        pageNum = 1;
        listInfo = new ArrayList<YRebateRelation>();
        infoAdapter = new RecommendUserAdapter(activity, listInfo);
        listview.getRefreshableView().setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();
        initData();
    }
   private void initData(){
       Map<String,String> m = new HashMap<>();
       m.put("id",1+"");
       getData(201, "recommend/recommend_user.html", m, null);
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {

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
}
