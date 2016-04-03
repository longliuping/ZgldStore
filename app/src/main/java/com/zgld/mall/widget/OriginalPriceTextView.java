package com.zgld.mall.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 原价
 * 
 * @author LLP
 * 
 */
public class OriginalPriceTextView extends TextView {
	public OriginalPriceTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public OriginalPriceTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public OriginalPriceTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		this.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}
}
