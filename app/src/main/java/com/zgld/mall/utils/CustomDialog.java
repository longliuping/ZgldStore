package com.zgld.mall.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.zgld.mall.R;

/**
 * <p>
 * Title: CustomDialog
 * </p>
 * <p>
 * Description:自定义Dialog（参数传入Dialog样式文件，Dialog布局文件）
 * </p>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * 
 * @author jgduan
 * @version 1.01
 */
public class CustomDialog extends Dialog implements View.OnClickListener {
	CustomDialogListener listener;

	public interface CustomDialogListener {
		void customDialogClickLeft();

		void customDialogClickRight();
	}

	/** 布局文件 **/
	int layoutRes;
	/** 上下文对象 **/
	Context context;
	/** 确定按钮 **/
	private Button confirmBtn;
	/** 取消按钮 **/
	private Button cancelBtn;
	/** 离线消息按钮 **/
	private RadioButton myRadioButton;
	/** 点击次数 **/
	private int check_count = 0;
	/** Toast时间 **/
	public static final int TOAST_TIME = 1000;
	TextView message,title;
	public CustomDialog(Context context) {
		super(context);
		this.context = context;
	}

	String res[];
	/**
	 * 自定义主题及布局的构造方法
	 * 
	 * @param context
	 * @param theme
	 * @param resLayout
	 */
	public CustomDialog(Context context, int theme, int resLayout, int resId, CustomDialogListener listener) {
		super(context, theme);
		this.context = context;
		this.layoutRes = resLayout;
		this.res = context.getResources().getStringArray(resId);
		this.listener = listener;
	}
	public CustomDialog(Context context, int theme, int resLayout, int resId, CustomDialogListener listener,boolean cancelable) {
		super(context, theme);
		this.context = context;
		this.layoutRes = resLayout;
		this.res = context.getResources().getStringArray(resId);
		this.listener = listener;
		setCancelable(cancelable);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 指定布局
		this.setContentView(layoutRes);
		
		// 根据id在布局中找到控件对象
		title = (TextView) findViewById(R.id.title);
		title.setText(res[0]);
		message = (TextView) findViewById(R.id.message);
		message.setText(res[1]);
		confirmBtn = (Button) findViewById(R.id.confirm_btn);
		confirmBtn.setText(res[3]);
		cancelBtn = (Button) findViewById(R.id.cancel_btn);
		cancelBtn.setText(res[2]);
		myRadioButton = (RadioButton) findViewById(R.id.my_rbtn);

		// 设置按钮的文本颜色
		confirmBtn.setTextColor(0xff1E90FF);
		cancelBtn.setTextColor(0xff1E90FF);

		// 为按钮绑定点击事件监听器
		confirmBtn.setOnClickListener(this);
		cancelBtn.setOnClickListener(this);
		myRadioButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.confirm_btn:
			listener.customDialogClickRight();
			break;

		case R.id.cancel_btn:
			listener.customDialogClickLeft();
			break;

		case R.id.my_rbtn:
			// 点击了离线消息按钮
			check_count = check_count + 1;
			if (check_count % 2 == 0) {
				// no checked
				myRadioButton.setButtonDrawable(context.getResources().getDrawable(R.drawable.radio));
			} else {
				// checked
				myRadioButton.setButtonDrawable(context.getResources().getDrawable(R.drawable.radio_check));
			}
			break;
		}
	}
}