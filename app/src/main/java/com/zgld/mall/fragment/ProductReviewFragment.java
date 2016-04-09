package com.zgld.mall.fragment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.adapter.ProductReviewAdapter;
import com.zgld.mall.beans.ProductReview;
import com.zgld.mall.beans.ProductReviewData;
import com.zgld.mall.beans.Supplier;
import com.zgld.mall.beans.YShop;
import com.zgld.mall.utils.Contents;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ProductReviewFragment extends ProductBaseFragment implements OnRefreshListener2 {
	List<ProductReviewData> list;
	PullToRefreshListView listView;
	View view;
	YShop info;
	int pageIndex = 1;
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
			// getData(Method.GET, 666,
			// "ProductReviews/QueryProductReview?productId=" +
			// info.getProductId()
			// + "&size=100&pageIndex=" + pageIndex + "&startDate", null, null,
			// 1);
			Map<String, String> m = new HashMap<String, String>();
			m.put("productId", info.getProducts().getProductId()+"");
			m.put("Size", 10 + "");
			m.put("pageIndex", pageIndex + "");
//			getData(Method.POST, 666, "ProductReviews/QueryProductReview", m, null, 1);
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

			ProductReviewData data = gson.fromJson(json, new TypeToken<ProductReviewData>() {
			}.getType());
			if (data == null) {
				return;
			}
			List<ProductReview> list = data.getData();
			if (list == null || list.size() <= 0) {
				Toast.makeText(activity, activity.getString(R.string.no_data), Toast.LENGTH_SHORT).show();
			}
			listView.setAdapter(new ProductReviewAdapter(list, activity));
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
