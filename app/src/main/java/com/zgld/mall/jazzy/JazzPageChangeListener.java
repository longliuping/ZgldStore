package com.zgld.mall.jazzy;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.ImageView;

import com.zgld.mall.R;

/**
 * 当ViewPager中页面的状态发生改变时调用
 * 
 * @author Administrator
 * 
 */
public class JazzPageChangeListener implements OnPageChangeListener {
	private ImageView[] mIndicators;
	public JazzPageChangeListener(ImageView[] mIndicators) {
		// TODO Auto-generated constructor stub
		this.mIndicators = mIndicators;
	}
	/**
	 * This method will be invoked when a new page becomes selected.
	 * position: Position index of the new selected page.
	 */
	public void onPageSelected(int position) {
		setImageBackground(position);
	}

	public void onPageScrollStateChanged(int arg0) {

	}

	public void onPageScrolled(int arg0, float arg1, int arg2) {

	}
	/**
	 * 设置选中的tip的背景
	 * 
	 * @param selectItemsIndex
	 */
	private void setImageBackground(int selectItemsIndex) {
		for (int i = 0; i < mIndicators.length; i++) {
			if (i == selectItemsIndex) {
				mIndicators[i].setBackgroundResource(R.drawable.jazz_default);
			} else {
				mIndicators[i].setBackgroundResource(R.drawable.jazz_pressed);
			}
		}
	}
}
