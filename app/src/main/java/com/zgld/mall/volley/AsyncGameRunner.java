package com.zgld.mall.volley;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class AsyncGameRunner {
	public static RequestQueue request(int method, final int tag, final String url, final RequestListenr re, Context context, Map m) {
		RequestQueue queue = Volley.newRequestQueue(context);
		if (Request.Method.GET == method) {
			getReqest(tag, url, re, queue);
		} else {
			postReqest(tag, url, re, queue, m);
		}
		return queue;
	}

	public static void getReqest(final int tag, final String url, final RequestListenr re, RequestQueue queue) {
		StringRequest sr = new StringRequest(Request.Method.GET, url, new Listener<String>() {
			@Override
			public void onResponse(String arg0) {
				re.onCompelete(tag, arg0);
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				re.onException(arg0.toString());
			}
		});
//		RequestManager.getRequestQueue().add(sr);
		queue.add(sr);
	}

	public static void postReqest(final int tag, final String url, final RequestListenr re, RequestQueue queue, final Map m) {
		StringRequest sr = new StringRequest(Request.Method.POST, url, new Listener<String>() {

			@Override
			public void onResponse(String arg0) {
				re.onCompelete(tag, arg0);
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
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
//		RequestManager.getRequestQueue().add(sr);
		queue.add(sr);
	}

}
