package com.zgld.mall.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.ProductReviewAdapter;
import com.zgld.mall.beans.ProductReviews;
import com.zgld.mall.beans.YShop;
import com.zgld.mall.utils.Contents;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class ProductReviewFragment extends ProductBaseFragment implements OnRefreshListener2 {
	List<ProductReviews> list;
	PullToRefreshListView listView;
	View view;
	YShop info;
	int pageIndex = 1;
	Activity activity;
	ProductReviewAdapter productReviewAdapter;
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
		info = (YShop) activity.getIntent().getSerializableExtra("info");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (view == null) {
			view = inflater.inflate(R.layout.fragment_product_review, null);
			isPrepared = true;
			lazyLoad();
		} else {
			ViewGroup group = (ViewGroup) view.getParent();
			if (group != null) {
				group.removeView(view);
			}
		}

		return view;
	}

	private void initData() {
		if (info != null) {
			Map<String, String> m = new HashMap<String, String>();
			m.put("productId", info.getProducts().getProductId()+"");
			m.put(Contents.PAGENUM,pageIndex+"");
			m.put(Contents.PAGESIZE,20+"");
			getData(Request.Method.POST, 666, "reviews/view_product_reviews.html", m, null, pageIndex);
		}
	}

	@Override
	public void handleMsg(Message msg) {
		try {
			Gson gson = new Gson();
			Bundle bundle = msg.getData();
			String json = "";
			json = bundle.getString(Contents.JSON);
			if (json == null) {
				return;
			}
			switch (msg.what){
				case 666:
					JSONArray jsonArray = new JSONObject(json).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
					List<ProductReviews> data = gson.fromJson(jsonArray.toString(), new TypeToken<List<ProductReviews>>() {
					}.getType());
					if(pageIndex==1){
						list = new ArrayList<>();
						productReviewAdapter = new ProductReviewAdapter(list,activity);
						listView.setAdapter(productReviewAdapter);
					}
					list.addAll(data);
					productReviewAdapter.notifyDataSetChanged();;
					pageIndex++;
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			listView.onRefreshComplete();
		}
	}

	@Override
	public void onPullDownToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
		pageIndex = 1;
		initData();
	}

	@Override
	public void onPullUpToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
		initData();
	}

	private int mCurIndex = -1;
	/** 标志位，标志已经初始化完成 */
	private boolean isPrepared;
	/** 是否已被加载过一次，第二次就不再去请求数据了 */
	private boolean mHasLoadedOnce;

	@Override
	protected void lazyLoad() {
		// TODO Auto-generated method stub
		if (!isPrepared || !isVisible || mHasLoadedOnce) {
			return;
		}
		listView = (PullToRefreshListView) view.findViewById(R.id.lv_review);
		listView.setMode(Mode.BOTH);
		listView.setOnRefreshListener(this);
		initData();
	}
}
