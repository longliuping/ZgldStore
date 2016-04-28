package com.zgld.mall.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.RecommendUserAdapter;
import com.zgld.mall.beans.YRebateRelation;
import com.zgld.mall.utils.Contents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendUser3Fragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2,
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
    public RecommendUser3Fragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static RecommendUser3Fragment newInstance(String param1, String param2) {
        RecommendUser3Fragment fragment = new RecommendUser3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void handleMsg(Message msg) {
        try {
            if(msg.getData().getInt(Contents.STATUS)==200){

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
        listview.setOnItemClickListener(this);
        pageNum = 1;
//        listInfo = new ArrayList<Orders>();
//        infoAdapter = new BuyersOrdersAdapter(activity, listInfo,this);
//        listview.getRefreshableView().setAdapter(infoAdapter);
//        infoAdapter.notifyDataSetChanged();
        initData();
    }
   private void initData(){
       Map<String,String> m = new HashMap<>();
       getData(201, "recommend/user_shipping_addresses.html", m, null);
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
