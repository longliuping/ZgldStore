package com.zgld.mall.indicator;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class FragmentPagerAdp extends FragmentPagerAdapter {
	ArrayList<TabInfoBean> tabs = null;
	Context context = null;
	Bundle data;

	public FragmentPagerAdp(Context context, FragmentManager fm, ArrayList<TabInfoBean> tabs) {
		super(fm);
		this.tabs = tabs;
		this.context = context;
	}

	public FragmentPagerAdp(Context context, FragmentManager fm, ArrayList<TabInfoBean> tabs, Bundle data) {
		super(fm);
		this.tabs = tabs;
		this.context = context;
		this.data = data;
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fragment = null;
		if (tabs != null && position < tabs.size()) {
			TabInfoBean tab = tabs.get(position);
			if (tab == null)
				return null;
			fragment = tab.createFragment();
		}
		if (fragment != null) {
			fragment.setArguments(data);
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if (tabs != null && tabs.size() > 0)
			return tabs.size();
		return 0;
	}

	@Override
	public int getItemPosition(Object object) {
		// TODO Auto-generated method stub
		return POSITION_NONE;
	}

	@Override
	public Object instantiateItem(View container, int position) {
		// TODO Auto-generated method stub
		TabInfoBean tab = tabs.get(position);
		@SuppressWarnings("deprecation")
		Fragment fragment = (Fragment) super.instantiateItem(container, position);
		tab.fragment = fragment;
		return fragment;
	}
}
