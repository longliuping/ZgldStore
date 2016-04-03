package com.zgld.mall.utils;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.android.volley.Request.Method;
import com.zgld.mall.R;
import com.zgld.mall.activity.LoginActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

public class ViewUtil {
	public static byte[] Bitmap2Bytes(Bitmap bm) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		bm.compress(Bitmap.CompressFormat.PNG, 100, baos);
		return baos.toByteArray();
	}

	public static Bitmap drawableToBitamp(Drawable drawable) {
		BitmapDrawable bd = (BitmapDrawable) drawable;
		return bd.getBitmap();
	}

	public static String trimNull(String content) {
		if (TextUtils.isEmpty(content)) {
			return "";
		} else {
			return content;
		}
	}
	public static void userNotLogin(final Context context)
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("登录");
		builder.setMessage("你还没有登录,需要登录后才能操作");
		builder.setPositiveButton(context.getString(R.string.no), new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub

			}
		});
		builder.setNegativeButton(context.getString(R.string.yes), new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				context.startActivity(new Intent(context,LoginActivity.class));
			}
		});
		builder.show();
	}
}
