package com.zgld.mall.jazzy;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;

public class JazzProductDetailAdapter extends PagerAdapter {
	public interface JazzProductDetailAdapterListener {
		/**
		 * jazz点击item 相应事件
		 * 
		 * @param position
		 */
		void jazzOnItemClick(int position);
	}

	JazzyProductDetailViewPager mViewPager;
	List<String> mImageUrls = new ArrayList<String>();
	ImageView[] mImageViews;
	Context context;
	JazzProductDetailAdapterListener listener;

	public JazzProductDetailAdapter(Context context, JazzyProductDetailViewPager mViewPager, List<String> mImageUrls,
			ImageView[] mImageViews, JazzProductDetailAdapterListener listener) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.mViewPager = mViewPager;
		this.mImageUrls = mImageUrls;
		this.mImageViews = mImageViews;
		this.listener = listener;
	}

	@Override
	public int getCount() {
		return mImageUrls.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object obj) {
		if (view instanceof OutlineContainer) {
			return ((OutlineContainer) view).getChildAt(0) == obj;
		} else {
			return view == obj;
		}
	}

	@Override
	public void destroyItem(View container, int position, Object object) {
		((ViewPager) container).removeView(mViewPager.findViewFromObject(position));
	}

	@Override
	public Object instantiateItem(View container, final int position) {
		mImageViews[position].setScaleType(ImageView.ScaleType.CENTER_INSIDE);
		SysApplication.DisplayAbstractImage(mImageUrls.get(position), mImageViews[position]);
		((ViewPager) container).addView(mImageViews[position], 0);
		mViewPager.setObjectForPosition(mImageViews[position], position);
		mImageViews[position].setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				listener.jazzOnItemClick(position);
			}
		});
		return mImageViews[position];
	}

}
