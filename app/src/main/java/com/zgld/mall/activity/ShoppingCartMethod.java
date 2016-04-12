package com.zgld.mall.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshExpandableListView;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.adapter.ShoppingCarExpandableListAdapter;
import com.zgld.mall.beans.GsonObject;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.ShoppingCarts;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.ConfirmDialog;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.CustomDialog;
import com.zgld.mall.volley.AsyncGameRunner;
import com.zgld.mall.volley.NetWorkTools;
import com.zgld.mall.volley.RequestListenr;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 购物车公共方法
 */
public class ShoppingCartMethod implements RequestListenr, OnRefreshListener2, OnItemClickListener, OnClickListener,
		OnCheckedChangeListener, ShoppingCarExpandableListAdapter.ShoppingCarExpandableListAdapterListener {

	protected ConfirmDialog confirmDialog = null;
	CustomDialog dialog;
	Activity activity;
	List<ShoppingCarts> listInfo;
	PullToRefreshExpandableListView listview;
	ShoppingCarExpandableListAdapter infoAdapter;
	int pageIndex = 1;
	CheckBox item_car_checkbox;
	TextView item_pay;
	TextView item_payment_amount, item_total_amount;
	RelativeLayout bottom;
	List<String> indexAll = new ArrayList<String>();
	View null_data_default;
	LayoutInflater inflater;
	View back;

	public ShoppingCartMethod(Activity activity) {
		this.activity = activity;
		this.inflater = LayoutInflater.from(activity);
	}

	View view;

	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_car, null);
		activity.setContentView(view);
		initView();
		back.setVisibility(View.VISIBLE);
		back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				activity.finish();
			}
		});
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (view == null) {
			view = inflater.inflate(R.layout.fragment_car, null);
			view.findViewById(R.id.back).setVisibility(View.GONE);
			TextView title = (TextView) view.findViewById(R.id.title_center);
			title.setText("购物车");
			initView();
			back.setVisibility(View.GONE);
		} else {
			ViewGroup group = (ViewGroup) view.getParent();
			if (group != null) {
				group.removeView(view);
			}
		}

		return view;

	}

	private void initView() {
		// TODO Auto-generated method stub
		back = view.findViewById(R.id.back);
		listview = (PullToRefreshExpandableListView) view.findViewById(R.id.listview);
		listview.setOnItemClickListener(this);
		listview.getRefreshableView().setGroupIndicator(null);
		listview.getRefreshableView().setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
				// TODO Auto-generated method stub
				return true;
			}
		});
		listview.setOnRefreshListener(this);
		item_car_checkbox = (CheckBox) view.findViewById(R.id.item_car_checkbox);
		item_car_checkbox.setOnCheckedChangeListener(this);
		item_pay = (TextView) view.findViewById(R.id.item_pay);
		item_pay.setOnClickListener(this);
		item_payment_amount = (TextView) view.findViewById(R.id.item_payment_amount);
		item_total_amount = (TextView) view.findViewById(R.id.item_total_amount);
		bottom = (RelativeLayout) view.findViewById(R.id.bottom);
		bottom.setVisibility(View.GONE);
		view.findViewById(R.id.go).setOnClickListener(this);
		null_data_default = view.findViewById(R.id.null_data_default);
		null_data_default.setVisibility(View.GONE);
		registerBoradcastReceiver();
		initData();
	}
	/**
	 * 请求成功
	 */
	@Override
	public void onCompelete(Message msg) {
		try{
			handler.sendMessage(msg);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 请求出现异常�?
	 */

	@Override
	public void onException(String exception) {
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
		if (exception != null && exception.equals("com.android.volley.ServerError")) {
			Toast.makeText(activity, activity.getString(R.string.network_connection_error), Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(activity, activity.getString(R.string.network_connection_timeout), Toast.LENGTH_SHORT)
					.show();
		}
	}

	public RequestQueue getData(int tag, String url, Map m, String title) {
		if (NetWorkTools.isHasNet(activity)) {
			return AsyncGameRunner.request(tag, url, this, activity, m,title);
		} else {
			Toast.makeText(activity, activity.getString(R.string.no_wifi_or_open_mobile_data), Toast.LENGTH_SHORT)
					.show();
		}
		return null;
	}

	private void initData() {
		if (!NetWorkTools.isHasNet(activity)) {
			listview.onRefreshComplete();
		}
		if (new UserDataShare(activity).getUserData() == null) {
			listview.onRefreshComplete();
			activity.startActivityForResult(new Intent(activity, LoginActivity.class),200);
			bottom.setVisibility(View.GONE);
			null_data_default.setVisibility(View.VISIBLE);
		} else {
			Map<String,String> m = new HashMap<>();
			getData( 201, "car/user_car_product.html", m, null);
		}
	}

	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			listview.onRefreshComplete();
			try {
				GsonObject gsonObject = (GsonObject)msg.getData().getSerializable(Contents.GSON_OBJECT);
				Bundle bundle = msg.getData();
				String json = "";
				if (bundle == null) {
					return;
				}
				json = bundle.getString(Contents.JSON);
				Gson gson = new Gson();
				Type entityType = null;
				JSONArray jsonArray = null;
				if(json==null || json.length()<10){
					return;
				}
				JSONObject jsonObject = new JSONObject(json);
				String msgStr = jsonObject.getString(Contents.MSG);
				if(!msgStr.equals(Contents.SUCCESS)) {
					Toast.makeText(activity, msgStr, Toast.LENGTH_SHORT).show();
				}
				if(jsonObject.getInt(Contents.STATUS)==201){
					listInfo = new ArrayList<>();
					infoAdapter = new ShoppingCarExpandableListAdapter(activity, listInfo, ShoppingCartMethod.this);
					infoAdapter.notifyDataSetChanged();
					new UserDataShare(activity).logout();
					bindData();
					Contents.loginPage(activity,null,200);
				}
				switch (msg.what) {
					case 201:
						jsonArray = new JSONObject(json).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
						listInfo = new Gson().fromJson(jsonArray.toString(),new TypeToken<List<ShoppingCarts>>() {
						}.getType());
						infoAdapter = new ShoppingCarExpandableListAdapter(activity, listInfo, ShoppingCartMethod.this);
						listview.getRefreshableView().setAdapter(infoAdapter);
						int groupCount = listview.getRefreshableView().getCount();
						for (int i = 0; i < groupCount; i++) {
							listview.getRefreshableView().expandGroup(i);
						}

						item_car_checkbox.setChecked(false);
						infoAdapter.notifyDataSetChanged();
						break;
					case 203:
						if(jsonObject.getInt(Contents.STATUS)==200){
							if(listInfo.get(deleteGroupPosition).getListProducts().size()>=deleteChildPosition){
								listInfo.get(deleteGroupPosition).getListProducts().remove(deleteChildPosition);
								deleteChildPosition = 0;
								if(listInfo.get(deleteGroupPosition).getListProducts().size()<=0){
									listInfo.remove(deleteGroupPosition);
								}
								infoAdapter.notifyDataSetChanged();
							}
						}
						break;
				}
				bindData();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				listview.onRefreshComplete();
			}
			super.handleMessage(msg);
		}
	};

	private void bindData() {
		if (listInfo != null && listInfo.size() > 0) {
			bottom.setVisibility(View.VISIBLE);
			null_data_default.setVisibility(View.GONE);
		} else {
			bottom.setVisibility(View.GONE);
			null_data_default.setVisibility(View.VISIBLE);
		}
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onPullDownToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
		pageIndex = 1;
		initData();
	}

	@Override
	public void onPullUpToRefresh(PullToRefreshBase refreshView) {
		// TODO Auto-generated method stub
		initData();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.item_pay:
			if (!checkedProduct()) {
				Toast.makeText(activity, "请选择要结算的产品", Toast.LENGTH_SHORT).show();
			} else {
				ArrayList<ShoppingCarts> listCarts = new ArrayList<>();
				for (int i = 0; i < listInfo.size(); i++) {
					ShoppingCarts infoCar = listInfo.get(i);
					ShoppingCarts infoObj = new ShoppingCarts();
					List<Products> listHishopProducts = new ArrayList<>();
					for (int j = 0; j < infoCar.getListProducts().size(); j++) {
						Products infoPro = infoCar.getListProducts().get(j);
						if (infoCar.getListProducts().get(j).isChecked()) {
//							infoPro.setListHishopSkuitems(infoCar.getListProducts().get(j).getListHishopSkuitems());
							listHishopProducts.add(infoPro);
						}
					}
					if(listHishopProducts.size()>0){
						infoObj.setQuantity(infoCar.getQuantity());
						infoObj.setChecked(infoCar.isChecked());
//						infoObj.setAddTime(infoCar.getAddTime());
						infoObj.setProductId(infoCar.getProductId());
						infoObj.setSku(infoCar.getSku());
						infoObj.setUserId(infoCar.getUserId());
						infoObj.setListProducts(listHishopProducts);
						infoObj.setyShop(infoCar.getyShop());
						listCarts.add(infoObj);
					}
				}
				Intent intent = new Intent(activity, OKOrderActivity.class);
				Bundle bundle = new Bundle();
				bundle.putSerializable("listInfo", listCarts);
				intent.putExtras(bundle);
				activity.startActivityForResult(intent, 208);
			}
			break;
		case R.id.go:
			break;
		}
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
//		if (Contents.getUser(activity) == null) {
//			activity.startActivityForResult(new Intent(activity, LoginActivity.class),200);
//			return;
//		}
		if (resultCode == activity.RESULT_OK) {
			if (requestCode == 200) {
				initView();
				listInfo = new ArrayList<>();
				infoAdapter.notifyDataSetChanged();
				bindData();
				pageIndex = 1;
				initData();
			}
			if(requestCode==208){
				initData();
			}
		}
	}

	public void carUpdate() {
		pageIndex = 1;
		initData();
	}

	@Override
	public void childViewOnCheckedChangeListener(int groupPosition, int childPosition, boolean isChecked) {
		// TODO Auto-generated method stub
		listInfo.get(groupPosition).getListProducts().get(childPosition).setChecked(isChecked);
		if (!isChecked) {
			listInfo.get(groupPosition).setChecked(isChecked);
			item_car_checkbox.setChecked(isChecked);
		} else {
			// 如果全部选中,，分组也选中
			if (groupChecked(groupPosition)) {
				listInfo.get(groupPosition).setChecked(isChecked);
				if (checkAllChecked(groupPosition)) {
					item_car_checkbox.setChecked(isChecked);
				}
			}
		}
		infoAdapter.notifyDataSetChanged();
	}

	@Override
	public void groupViewOnCheckedChangeListener(int groupPosition, boolean isChecked) {
		// TODO Auto-generated method stub
		listInfo.get(groupPosition).setChecked(isChecked);
		for (int i = 0; i < listInfo.get(groupPosition).getListProducts().size(); i++) {
			listInfo.get(groupPosition).getListProducts().get(i).setChecked(isChecked);
		}
		if (!isChecked) {
			item_car_checkbox.setChecked(isChecked);
		} else {
			if (groupChecked(groupPosition)) {
				listInfo.get(groupPosition).setChecked(isChecked);
				if (checkAllChecked(groupPosition)) {
					item_car_checkbox.setChecked(isChecked);
				}
			}
		}
		infoAdapter.notifyDataSetChanged();
	}

	/**
	 * 判断分组是否全部选中
	 * 
	 * @param groupPosition
	 * @return
	 */
	boolean groupChecked(int groupPosition) {
		boolean result = false;
		for (int i = 0; i < listInfo.get(groupPosition).getListProducts().size(); i++) {
			if (!listInfo.get(groupPosition).getListProducts().get(i).isChecked()) {
				result = listInfo.get(groupPosition).isChecked();
				break;
			} else {
				result = true;
			}
		}
		return result;
	}

	/**
	 * 判断是否全部选中
	 * 
	 * @param groupPosition
	 * @return
	 */
	boolean checkAllChecked(int groupPosition) {
		boolean result = true;
		for (int i = 0; i < listInfo.size(); i++) {
			if (result) {
				if (!listInfo.get(i).isChecked()) {
					result = false;
					break;
				} else {
					for (int j = 0; j < listInfo.get(i).getListProducts().size(); j++) {
						if (result) {
							if (!listInfo.get(i).getListProducts().get(j).isChecked()) {
								result = false;
								break;
							}
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * 判断是否有选中结算的产品
	 * 
	 * @return
	 */
	boolean checkedProduct() {
		boolean result = false;
		for (int i = 0; i < listInfo.size(); i++) {
			for (int j = 0; j < listInfo.get(i).getListProducts().size(); j++) {
				if (listInfo.get(i).getListProducts().get(j).isChecked()) {
					result = true;
					return true;
				}
			}
		}
		return result;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listInfo.size(); i++) {
			listInfo.get(i).setChecked(isChecked);
			for (int j = 0; j < listInfo.get(i).getListProducts().size(); j++) {
				listInfo.get(i).getListProducts().get(j).setChecked(isChecked);
			}
		}
		infoAdapter.notifyDataSetChanged();
	}

	@Override
	public void viewDrawComplete() {
		// TODO Auto-generated method stub
	}

	int deleteGroupPosition = 0;
	int deleteChildPosition = 0;

	@Override
	public void deleteProduct(final int groupPosition, final int childPosition) {
		// TODO Auto-generated method stub
		deleteGroupPosition = groupPosition;
		deleteChildPosition = childPosition;
		dialog = new CustomDialog(activity, R.style.mystyle, R.layout.customdialog, R.array.title_car_delete_product,
				new CustomDialog.CustomDialogListener() {

					@Override
					public void customDialogClickRight() {
						// TODO Auto-generated method stub
						dialog.dismiss();
						deleteProduct();
					}

					private void deleteProduct() {
						Map<String, String> m = new HashMap<String, String>();
						YAccount users = new UserDataShare(activity).getUserData();
						m.put(Contents.TOKEN, users.getUsers().getAppUserToken());
						m.put(Contents.USERID,users.getUsers().getUserId() + "");
						m.put("productId", listInfo.get(groupPosition).getListProducts().get(childPosition).getProductId() + "");
						m.put("skuId", listInfo.get(groupPosition).getListProducts().get(childPosition).getSku().getSku()+"");
						getData(203, "car/delete_car_product.html", m, null);
					}

					@Override
					public void customDialogClickLeft() {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				});
		dialog.show();
	}

	@Override
	public void loveProduct(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reduceNumber(int groupPosition, int childPosition, int newNumber) {
		// TODO Auto-generated method stub
//		listInfo.get(groupPosition).getListHishopProducts().get(childPosition).setQuantity(newNumber + "");
		listInfo.get(groupPosition).setQuantity(newNumber);
//		totalMoney();
		infoAdapter.notifyDataSetChanged();
	}

	@Override
	public void addNumber(int groupPosition, int childPosition, int newNumber) {
		// TODO Auto-generated method stub
//		listInfo.get(groupPosition).getListHishopProducts().get(childPosition).setQuantity(newNumber + "");
		listInfo.get(groupPosition).setQuantity(newNumber);
		infoAdapter.notifyDataSetChanged();
	}

	private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			String action = intent.getAction();
			if (action.equals(BroadcastUtils.UPDATE_CAR_PRODUCT)) {
				pageIndex = 1;
				initData();
			}
			if(action.equals(BroadcastUtils.USER_LOGOUT)){
				listInfo.clear();
				infoAdapter.notifyDataSetChanged();
				bottom.setVisibility(View.GONE);
				null_data_default.setVisibility(View.VISIBLE);
			}
			if(action.equals(BroadcastUtils.USER_LOGIN))
			{
				pageIndex=1;
				initView();
			}
		}

	};

	public void registerBoradcastReceiver() {
		IntentFilter myIntentFilter = new IntentFilter();
		myIntentFilter.addAction(BroadcastUtils.UPDATE_CAR_PRODUCT);
		myIntentFilter.addAction(BroadcastUtils.USER_LOGOUT);
		myIntentFilter.addAction(BroadcastUtils.USER_LOGIN);
		// 注册广播
		activity.registerReceiver(mBroadcastReceiver, myIntentFilter);
	}

	public void onDestroy() {
		// TODO Auto-generated method stub
		if (mBroadcastReceiver != null) {
			activity.unregisterReceiver(mBroadcastReceiver);
		}
	}
}
