package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.zgld.mall.R;
import com.zgld.mall.adapter.ImageBrowserAdapter;
import com.zgld.mall.photoview.PhotoTextView;
import com.zgld.mall.photoview.ScrollViewPager;
import com.zgld.mall.utils.Contents;

import java.util.ArrayList;
import java.util.List;

public class ImageBrowserActivity extends BaseActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

    private ScrollViewPager mSvpPager;
    private PhotoTextView mPtvPage;
    private ImageView mIvDownload;
    private ImageBrowserAdapter mAdapter;
    private String mType;
    private int mPosition;
    private int mTotal;

    public static final String IMAGE_TYPE = "image_type";
    public static final String TYPE_ALBUM = "image_album";
    public static final String TYPE_PHOTO = "image_photo";
    List<String> urls = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_browser);
        urls = this.getIntent().getStringArrayListExtra(Contents.URLS);
        initViews();
        initEvents();
        init();
    }

    @Override
    public void handleMsg(Message msg) {

    }

    protected void initViews() {
        mSvpPager = (ScrollViewPager) findViewById(R.id.imagebrowser_svp_pager);
        mPtvPage = (PhotoTextView) findViewById(R.id.imagebrowser_ptv_page);
        mIvDownload = (ImageView) findViewById(R.id.imagebrowser_iv_download);
    }

    protected void initEvents() {
        mSvpPager.setOnPageChangeListener(this);
        mIvDownload.setOnClickListener(this);
    }

    private void init() {
        mType = getIntent().getStringExtra(IMAGE_TYPE);
        mIvDownload.setVisibility(View.GONE);
        mPosition = getIntent().getIntExtra(Contents.POSITION, 0);
        if (urls != null && urls.size() > 0) {
            mTotal = urls.size();
            if (mPosition > mTotal) {
                mPosition = mTotal - 1;
            }
            if (mTotal > 0) {
                mPosition += 1000 * mTotal;
                mPtvPage.setText((mPosition % mTotal) + 1 + "/" + mTotal);
                mAdapter = new ImageBrowserAdapter(this, urls);
                mSvpPager.setAdapter(mAdapter);
                mSvpPager.setCurrentItem(mPosition, false);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {

    }

    @Override
    public void onPageSelected(int arg0) {
        mPosition = arg0;
        mPtvPage.setText((mPosition % mTotal) + 1 + "/" + mTotal);
    }

    @Override
    public void onClick(View arg0) {
    }

}
