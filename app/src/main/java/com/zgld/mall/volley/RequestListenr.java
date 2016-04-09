package com.zgld.mall.volley;
import android.os.Message;
public interface RequestListenr {
	void onCompelete(Message msg);//
	void onException(String exception); //
}
