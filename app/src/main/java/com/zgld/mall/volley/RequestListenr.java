package com.zgld.mall.volley;

public interface RequestListenr {
	void onCompelete(int tag, String json);//

	void onException(String exception); //
}
