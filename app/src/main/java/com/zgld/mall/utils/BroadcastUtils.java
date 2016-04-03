package com.zgld.mall.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class BroadcastUtils {
	public static String BUYERS_ORDER_ACTION_NAME = "update_fragment_buyers";
	/**
	 * 更新我的订单fragment广播
	 * @param activity
	 */
	public static void sendBuyersOrder(Activity activity) {
//		Intent mIntent = new Intent(BUYERS_ORDER_ACTION_NAME);
//		mIntent.putExtra(BUYERS_ORDER_ACTION_NAME, "发送广播，相当于在这里传送数据");
//		activity.sendBroadcast(mIntent);
	}

	public static String SELLER_ORDER_ACTION_NAME = "update_fragment_seller";
	/**
	 * 更新销售的fragment广播
	 * @param activity
	 */
	public static void sendSellerOrder(Activity activity) {
//		Intent mIntent = new Intent(SELLER_ORDER_ACTION_NAME);
//		mIntent.putExtra(SELLER_ORDER_ACTION_NAME, "发送广播，相当于在这里传送数据");
//		activity.sendBroadcast(mIntent);
	}
	
	
	public static String UPDATE_CAR_PRODUCT = "update_car_product";
	/**
	 * 更新购物车产品广播
	 * @param context
	 */
	public static void sendCarProduct(Context context) {
		Intent mIntent = new Intent(UPDATE_CAR_PRODUCT);
		mIntent.putExtra(UPDATE_CAR_PRODUCT, "发送广播，相当于在这里传送数据");
		context.sendBroadcast(mIntent);
	}
	
	public static String UPDATE_PRODUCT = "update_product";
	/**
	 * 更新我发布的产品广播
	 * @param context
	 */
	public static void sendUpdateProduct(Context context)
	{
		Intent mIntent = new Intent(UPDATE_PRODUCT);
		mIntent.putExtra(UPDATE_PRODUCT, "发送广播，相当于在这里传送数据");
		context.sendBroadcast(mIntent);
	}
	public static String USER_LOGOUT = "user_logout";
	/**
	 * 用户退出登录广播
	 * @param context
	 */
	public static void sendUserLogout(Context context)
	{
		Intent mIntent = new Intent(USER_LOGOUT);
		mIntent.putExtra(USER_LOGOUT, "发送广播，相当于在这里传送数据");
		context.sendBroadcast(mIntent);
	}
	public static String USER_LOGIN = "user_login";
	/**
	 * 用户登录广播
	 * @param context
	 */
	public static void sendUserLogin(Context context)
	{
		Intent mIntent = new Intent(USER_LOGIN);
		mIntent.putExtra(USER_LOGIN, "发送广播，相当于在这里传送数据");
		context.sendBroadcast(mIntent);
	}
	public static String USER_UPDATE = "user_update";

	/**
	 * 更新登录用户信息
	 * @param context
	 */
	public static void sendUserUpdate(Context context){
		Intent mIntent = new Intent(USER_UPDATE);
		mIntent.putExtra(USER_LOGIN, "发送广播，相当于在这里传送数据");
		context.sendBroadcast(mIntent);
	}
}
