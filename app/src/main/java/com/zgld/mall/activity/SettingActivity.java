package com.zgld.mall.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.umeng.update.UmengUpdateAgent;
import com.umeng.update.UmengUpdateListener;
import com.umeng.update.UpdateResponse;
import com.zgld.mall.AppManager;
import com.zgld.mall.DataCleanManager;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.adapter.HotCategoryAdapter;
import com.zgld.mall.adapter.SettingMenuAdapter;
import com.zgld.mall.beans.SettingMenu;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.ConfirmDialog;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.CustomDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * 设置
 * 
 */
public class SettingActivity extends BaseActivity implements OnClickListener, CustomDialog.CustomDialogListener,AdapterView.OnItemClickListener {
	CustomDialog dialog;

	View check_app_update, logout, about, clear, server_center, wechat, update_pwd, message;
	ListView listview;
	int types[] = new int[]{1,2,2};
	String names[] = new String[]{"关于我们","清楚缓存","检查升级"};
	String values[] = new String[]{"关于我们","清楚缓存","检查升级"};
	Class className[] = new Class[]{AboutActivity.class,null,null};
	List<SettingMenu> listInfo = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initStyle();
		setContentView(R.layout.activity_setting);
		AppManager.getAppManager().addActivity(this);
		TextView title = (TextView) findViewById(R.id.title);
		title.setText("设置");
		findViewById(R.id.back).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		listview = (ListView) findViewById(R.id.listview);
		for (int i =0;i<names.length;i++){
			SettingMenu info = new SettingMenu();
			info.setName(names[i]);
			info.setType(types[i]);
			info.setValue(values[i]);
			info.setClassName(className[i]);
			listInfo.add(info);
		}
		listview.setAdapter(new SettingMenuAdapter(this, listInfo));
		listview.setOnItemClickListener(this);
//		logout = findViewById(R.id.logout);
//		logout.setOnClickListener(this);
//		if (!new UserDataShare(this).isLogin()) {
//			logout.setVisibility(View.GONE);
//		} else {
//			logout.setVisibility(View.VISIBLE);
//		}
		registerBoradcastReceiver();
	}

	@Override
	public void handleMsg(Message msg) {

	}

	private void bindData() {
		// TODO Auto-generated method stub
		if (new UserDataShare(this).getUserData() == null) {
			logout.setVisibility(View.GONE);
		} else {
			logout.setVisibility(View.VISIBLE);
		}
	}

	private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			String action = intent.getAction();
			if (action.equals(BroadcastUtils.USER_LOGIN)) {
				bindData();
			}
		}

	};

	public void registerBoradcastReceiver() {
		IntentFilter myIntentFilter = new IntentFilter();
		myIntentFilter.addAction(BroadcastUtils.USER_LOGIN);
		// 注册广播
		registerReceiver(mBroadcastReceiver, myIntentFilter);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (mBroadcastReceiver != null) {
			unregisterReceiver(mBroadcastReceiver);
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.logout:
			dialog = new CustomDialog(this, R.style.mystyle, R.layout.customdialog, R.array.title_logout, this);
			dialog.show();
			break;
		}
	}

	@Override
	public void customDialogClickLeft() {
		// TODO Auto-generated method stub
		dialog.dismiss();
	}

	@Override
	public void customDialogClickRight() {
		// TODO Auto-generated method stub
		dialog.dismiss();
		new UserDataShare(this).logout();
		BroadcastUtils.sendUserLogout(this);
		Contents.loginPage(this,null,200);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		SettingMenu info = listInfo.get(position);
		if(info.getType()==1){
			Intent intent = new Intent(this,info.getClassName());
			startActivity(intent);
		}else{
			if(position==1){
				DataCleanManager.clearAllData(this);
				Toast.makeText(this, getString(R.string.cache_success), Toast.LENGTH_SHORT).show();
			}
			if(position==2){
				if (confirmDialog == null) {
					confirmDialog = new ConfirmDialog(this, getString(R.string.check_for_updates));
				}
				if (confirmDialog.isShowing()) {
					confirmDialog.dismiss();
				}
				confirmDialog.show();
				UmengUpdateAgent.setUpdateListener(new UmengUpdateListener() {

					@Override
					public void onUpdateReturned(int arg0, UpdateResponse arg1) {
						// TODO Auto-generated method stub
						if (confirmDialog != null && confirmDialog.isShowing()) {
							confirmDialog.dismiss();
						}
						if (arg0 == 1) {
							Toast.makeText(SettingActivity.this, getString(R.string.no_new_version), Toast.LENGTH_SHORT)
									.show();
						}
					}
				});
				UmengUpdateAgent.forceUpdate(this);
			}
		}
	}
}
