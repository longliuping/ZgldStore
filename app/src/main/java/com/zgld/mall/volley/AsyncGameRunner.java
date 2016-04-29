package com.zgld.mall.volley;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.GsonObject;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.dialog.ConfirmDialog;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.dialog.CustomDialog;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class AsyncGameRunner {
	static CustomDialog dialog = null;
	public static ConfirmDialog confirmDialog = null;
	public static RequestQueue request(final int tag, String url, final RequestListenr re, Context context, Map m,String title) {
		url = Contents.BASE_URL +url;
		RequestQueue queue = Volley.newRequestQueue(context);
		if (m==null) {
			getReqest(context,tag, url, re, queue);
		} else {
			postReqest(context,tag, url, re, queue, m);
		}
		return queue;
	}

	private static void getReqest(final Context context,final int tag, final String url, final RequestListenr re, RequestQueue queue) {
		StringRequest sr = new StringRequest(Request.Method.GET, url, new Listener<String>() {
			@Override
			public void onResponse(String json) {
				GsonObject gsonObject  = new GsonObject();;
				try{
					gsonObject.setJson(json);
					gsonObject.setTag(tag);
					if(json!=null && json.length()>10){
						JSONObject object = new JSONObject(json);
						String msgStr = object.getString(Contents.MSG);
						if(!msgStr.equals(Contents.SUCCESS)) {
							Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
						}
						gsonObject.setMsg(object.getString(Contents.MSG));
						gsonObject.setStatus(object.getInt(Contents.STATUS));
						gsonObject.setData(object.getJSONObject(Contents.DATA));
						if(object.getInt(Contents.STATUS)==201){
							dialog = new CustomDialog(context, R.style.mystyle, R.layout.customdialog, R.array.title_not_user, new CustomDialog.CustomDialogListener() {
								@Override
								public void customDialogClickLeft() {
									dialog.dismiss();
									Contents.loginPage(context, null);
								}

								@Override
								public void customDialogClickRight() {
									dialog.dismiss();
									Contents.loginPage(context,null);
								}
							},false);
							dialog.show();
						}
					}
				}catch (Exception e){
					e.printStackTrace();
				}finally {
					Message msg = new Message();
					msg.what = tag;
					Bundle data = new Bundle();
					data.putInt(Contents.STATUS,gsonObject.getStatus());
					data.putSerializable(Contents.GSON_OBJECT, gsonObject);
					data.putString(Contents.DATA,gsonObject.getData().toString());
					data.putString(Contents.JSON, gsonObject.getJson());
					msg.setData(data);
					re.onCompelete(msg);
				}
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				re.onException(arg0.toString());
			}
		});
		queue.add(sr);
	}

	private static void postReqest(final Context context,final int tag, final String url, final RequestListenr re, RequestQueue queue, final Map m) {
		if(m!=null) {
			YAccount user = new UserDataShare(context).getUserData();
			if(user!=null && user.getUsers()!=null) {
				m.put(Contents.TOKEN, user.getUsers().getAppUserToken());
				m.put(Contents.USERID, user.getUsers().getUserId() + "");
			}
		}
		StringRequest sr = new StringRequest(Request.Method.POST, url, new Listener<String>() {

			@Override
			public void onResponse(String json) {
				GsonObject gsonObject  = new GsonObject();;
				try{
					gsonObject.setJson(json);
					gsonObject.setTag(tag);
					if(json!=null && json.length()>10){
						JSONObject object = new JSONObject(json);
						String msgStr = object.getString(Contents.MSG);
						if(!msgStr.equals(Contents.SUCCESS)) {
							Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
						}
						gsonObject.setMsg(object.getString(Contents.MSG));
						gsonObject.setStatus(object.getInt(Contents.STATUS));
						gsonObject.setData(object.getJSONObject(Contents.DATA));
						if(object.getInt(Contents.STATUS)==201){
							dialog = new CustomDialog(context, R.style.mystyle, R.layout.customdialog, R.array.title_not_user, new CustomDialog.CustomDialogListener() {
								@Override
								public void customDialogClickLeft() {
									dialog.dismiss();
									Contents.loginPage(context, null);
								}

								@Override
								public void customDialogClickRight() {
									dialog.dismiss();
									Contents.loginPage(context,null);
								}
							},true);
							dialog.show();
						}
					}
				}catch (Exception e){
					e.printStackTrace();
				}finally {
					Message msg = new Message();
					msg.what = tag;
					Bundle data = new Bundle();
					data.putInt(Contents.STATUS,gsonObject.getStatus());
					data.putSerializable(Contents.GSON_OBJECT, gsonObject);
					data.putString(Contents.DATA, gsonObject.getData().toString());
					data.putString(Contents.JSON,gsonObject.getJson());
					msg.setData(data);
					re.onCompelete(msg);
				}
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				if (confirmDialog != null && confirmDialog.isShowing()) {
					confirmDialog.dismiss();
				}
				if (arg0.toString() != null && arg0.toString().equals("com.android.volley.ServerError")) {
					Toast.makeText(context, context.getString(R.string.network_connection_error), Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(context, context.getString(R.string.network_connection_timeout), Toast.LENGTH_SHORT)
							.show();
				}
				re.onException(arg0.toString());
				File file = new File("/mnt/sdcard/a.text");
				FileWriter fw = null;
				try {
					if (!file.exists()) {
						file.createNewFile();
					}
					fw = new FileWriter(file);
					BufferedWriter out = new BufferedWriter(fw);
					out.write(arg0.toString(), 0, arg0.toString().length() - 1);
					out.flush();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}) {
			@Override
			protected Map<String, String> getParams() throws AuthFailureError {
				return m;
			}
		};
		queue.add(sr);
	}

}
