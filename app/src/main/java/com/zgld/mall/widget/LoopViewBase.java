package com.zgld.mall.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by ILoveYou on 2016/3/4.
 */
public class LoopViewBase extends RelativeLayout {
    public LoopViewBase(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoopViewBase(Context context) {
        super(context);
    }

    public LoopViewBase(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Display d = ((Activity) getContext()).getWindowManager().getDefaultDisplay();
        heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(((d.getHeight()-100) / 3), View.MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
