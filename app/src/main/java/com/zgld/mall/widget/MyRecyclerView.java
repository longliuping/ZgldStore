package com.zgld.mall.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by ILoveYou on 2016/3/4.
 */
public class MyRecyclerView extends RecyclerView{
    Context context;
    public MyRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);this.context = context;
    }

    public MyRecyclerView(Context context) {
        super(context);this.context = context;
    }

    public MyRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);this.context = context;
    }
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,

                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
