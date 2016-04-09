package com.zgld.mall.fragment;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.beans.Supplier;
import com.zgld.mall.beans.YShop;
import com.zgld.mall.utils.Contents;

public class ProductParamFragment extends ProductBaseFragment implements OnRefreshListener2 {
	Gson gson;
	PullToRefreshListView listView;
//	List<ProductParam> list;
	View view;
	YShop product;
	Activity activity;

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
		Intent intent = activity.getIntent();
		product = (YShop) intent.getSerializableExtra("info");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (view == null) {
			gson = new Gson();
			view = inflater.inflate(R.layout.fragment_product_param, null);
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
		if (product != null) {
//			getData(Method.GET, 201, "ProductAttributes/QueryAttributes?productid=" + product.getHishopProducts().getProductId(), null,
//					null, 1);
		}
	}

	@Override
	public void handleMsg(Message msg) {
		try {
			Bundle bundle = msg.getData();
			String json = "";
			json = bundle.getString(Contents.JSON);
			if (json == null) {
				return;
			}
//			list = gson.fromJson(json, new TypeToken<List<ProductParam>>() {
//			}.getType());
//			if (null != list) {
//				ProductParamAdapter paramAdapter = new ProductParamAdapter(activity, list);
//				listView.setAdapter(paramAdapter);
//			}
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
		listView = (PullToRefreshListView) view.findViewById(R.id.lv_param);
		listView.setMode(Mode.BOTH);
		listView.setOnRefreshListener(this);
		initData();
	}
}
