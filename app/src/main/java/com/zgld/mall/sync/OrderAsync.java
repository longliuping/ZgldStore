package com.zgld.mall.sync;

import java.util.Map;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.zgld.mall.R;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.volley.AsyncGameRunner;
import com.zgld.mall.volley.NetWorkTools;
import com.zgld.mall.volley.RequestListenr;

import org.json.JSONObject;

public class OrderAsync implements RequestListenr {
	public interface OrderAsyncListener {
		void complete(int tag, Bundle data);
	}

	Context context = null;
	int method;
	int tag;
	String url;
	Map m;
	String title;
	int pageIndex;
	OrderAsyncListener listener;

	public OrderAsync(Context context, int method, int tag, String url, Map m, String title, int pageIndex,
			OrderAsyncListener listener) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.method = method;
		this.tag = tag;
		this.url = url;
		this.m = m;
		this.title = title;
		this.pageIndex = pageIndex;
		this.listener = listener;
		init();
	}

	void init() {
		if (NetWorkTools.isHasNet(context)) {
			AsyncGameRunner.request(method, tag, Contents.BASE_URL + url, this, context, m,null,1);
		} else {
			Toast.makeText(context, context.getString(R.string.no_wifi_or_open_mobile_data), Toast.LENGTH_SHORT).show();
		}
	}

	@Override
	public void onCompelete(int tag, String json) {
		// TODO Auto-generated method stub
		try{
			JSONObject object = new JSONObject(json);
			String msgStr = object.getString(Contents.MSG);
			if(!msgStr.equals(Contents.SUCCESS)) {
				Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
			}
			Bundle data = new Bundle();
			data.putInt(Contents.STATUS,object.getInt(Contents.STATUS));
			data.putString(Contents.JSON, json);
			data.putString(Contents.DATA,object.getJSONObject(Contents.DATA).toString());
			listener.complete(tag,data);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void onException(String exception) {
		// TODO Auto-generated method stub
	}
}
