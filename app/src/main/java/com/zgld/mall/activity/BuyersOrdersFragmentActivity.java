package com.zgld.mall.activity;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.fragment.BuyersOrders0Fragment;
import com.zgld.mall.fragment.BuyersOrders1Fragment;
import com.zgld.mall.fragment.BuyersOrders2Fragment;
import com.zgld.mall.fragment.BuyersOrders3Fragment;
import com.zgld.mall.fragment.BuyersOrders4Fragment;
import com.zgld.mall.fragment.BuyersOrders5Fragment;
import com.zgld.mall.indicator.FragmentPagerAdp;
import com.zgld.mall.indicator.TabInfoBean;
import com.zgld.mall.indicator.TitleIndicator;
import com.zgld.mall.utils.Contents;

/**
 * @author pengyu520
 * @date 2015年11月12日 下午2:05:15
 * @Des:我的购买订单
 */
public class BuyersOrdersFragmentActivity extends BaseFragmentActivity implements OnPageChangeListener, OnClickListener {

    public static final String EXTRA_TAB = "tab";
    public static final String EXTRA_QUIT = "extra.quit";
    protected int mCurrentTab = 0;
    protected int mLastTab = -1;
    // 存放选项卡信息的列表
    protected ArrayList<TabInfoBean> mTabs = new ArrayList<TabInfoBean>();
    // viewpager adapter
    protected FragmentPagerAdp myAdapter = null;
    // viewpager
    protected ViewPager mPager;
    // 选项卡控件
    protected TitleIndicator mIndicator;

    public TitleIndicator getIndicator() {
        return mIndicator;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_buyers_orders_fragment);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_buyers_orders));
        initViews();
    }

    /**
     * 初始化工作
     */
    private void initViews() {
        mPager = (ViewPager) findViewById(R.id.pager);
        mIndicator = (TitleIndicator) findViewById(R.id.pagerindicator);
        // 设置viewpager内部页面之间的间距
        // mPager.setPageMargin(0);
        // 这里初始化界面
        mCurrentTab = supplyTabs(mTabs);
        Intent intent = this.getIntent();
        if (intent != null) {
            mCurrentTab = intent.getIntExtra(EXTRA_TAB, mCurrentTab);
        }
        myAdapter = new FragmentPagerAdp(this, getSupportFragmentManager(), mTabs);

        mPager.setAdapter(myAdapter);
        mPager.setOnPageChangeListener(this);
        mIndicator.init(mCurrentTab, mTabs, mPager);
        mPager.setCurrentItem(mCurrentTab);
        mLastTab = mCurrentTab;

    }

    private int supplyTabs(ArrayList<TabInfoBean> mTabs2) {
        String[] titles = getResources().getStringArray(R.array.title_buyers_orders);
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_ONE, titles[0], BuyersOrders0Fragment.class));
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_TWO, titles[1], BuyersOrders1Fragment.class));
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_THREE, titles[2], BuyersOrders2Fragment.class));
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_FOUR, titles[3], BuyersOrders3Fragment.class));
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_FIVE, titles[4], BuyersOrders4Fragment.class));
        mTabs2.add(new TabInfoBean(Contents.FRAGMENT_SIX, titles[5], BuyersOrders5Fragment.class));
        return Contents.FRAGMENT_ONE;
    }

    /**
     * 添加一个选项卡
     *
     * @param tab
     */
    public void addTabInfo(TabInfoBean tab) {
        mTabs.add(tab);
        myAdapter.notifyDataSetChanged();
    }

    protected TabInfoBean getFragmentById(int tabId) {
        if (mTabs == null)
            return null;
        for (int index = 0, count = mTabs.size(); index < count; index++) {
            TabInfoBean tab = mTabs.get(index);
            if (tab.getId() == tabId) {
                return tab;
            }
        }
        return null;
    }

    /**
     * 跳转到任意选项卡
     *
     * @param tabId
     *            选项卡下标
     */
    public void navigate(int tabId) {
        for (int index = 0, count = mTabs.size(); index < count; index++) {
            if (mTabs.get(index).getId() == tabId) {
                mPager.setCurrentItem(index);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // for fix a known issue in support library
        // https://code.google.com/p/android/issues/detail?id=19917
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void handleMsg(Message msg) {

    }

    /**
     * 以下三个方法是针对viewpager状态的监听设置
     */
    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == ViewPager.SCROLL_STATE_IDLE) {
            mLastTab = mCurrentTab;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        mIndicator.onScrolled((mPager.getWidth() + mPager.getPageMargin()) * position + positionOffsetPixels);
    }

    @Override
    public void onPageSelected(int position) {
        mIndicator.onSwitched(position);
        mCurrentTab = position;
    }

    @Override
    public void onClick(View v) {

    }

    /**
     * FragmentActivity向Fragemnt发出通知,在Fragment中必须实现这个接口，否则报类造型异常 将接口和Fragment绑定
     */
    @Override
    public void onAttachFragment(Fragment fragment) {
        try {
            super.onAttachFragment(fragment);
        } catch (Exception e) {

        }
    }
}
