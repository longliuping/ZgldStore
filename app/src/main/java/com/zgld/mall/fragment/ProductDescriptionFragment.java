package com.zgld.mall.fragment;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshWebView;
import com.zgld.mall.R;
import com.zgld.mall.beans.Supplier;
import com.zgld.mall.beans.YShop;
import com.zgld.mall.utils.Contents;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;

public class ProductDescriptionFragment extends ProductBaseFragment implements OnRefreshListener2 {
	View view;
	WebView textView;
	YShop info = new YShop();
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
			view = inflater.inflate(R.layout.fragment_product_description, null);
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

	@Override
	public void handleMsg(Message msg) {

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
		textView = (WebView) view.findViewById(R.id.product_details);
		WebSettings settings = textView.getSettings();
		// 支持javascript
		settings.setJavaScriptEnabled(true);
		// 设置可以支持缩放
		// textView.getSettings().setSupportZoom(true);
		// 设置出现缩放工具
		// textView.getSettings().setBuiltInZoomControls(true);
		// 扩大比例的缩放
		settings.setUseWideViewPort(true);
		// 自适应屏幕
		settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		settings.setLoadWithOverviewMode(true);
		settings.setDefaultTextEncodingName("utf-8");
		settings.setAppCacheEnabled(true);
		settings.setCacheMode(settings.LOAD_CACHE_ELSE_NETWORK);
		String style = "<div style=\"width:100%; text-align:center;\" >"+info.getProducts().getDescription()+"</div>";
		textView.loadDataWithBaseURL(Contents.BASE_IMAGE_PATH, style, "text/html", "utf-8", "");
	}

	@Override
	public void onPullDownToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
//		textView.onRefreshComplete();
	}

	@Override
	public void onPullUpToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
//		textView.onRefreshComplete();
	}
}
