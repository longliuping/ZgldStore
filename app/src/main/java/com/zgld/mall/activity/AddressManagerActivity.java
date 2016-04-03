package com.zgld.mall.activity;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.adapter.AddressAdapter;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.HishopUserShippingAddresses;
import com.zgld.mall.beans.UserToken;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.CustomDialog;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 地址管理
 *
 */
public class AddressManagerActivity extends BaseActivity implements OnItemClickListener, OnRefreshListener2,
        AddressAdapter.AddressAdapterListener {
    PullToRefreshListView listview;
    List<HishopUserShippingAddresses> listInfo = new ArrayList<HishopUserShippingAddresses>();
    AddressAdapter infoAdapter;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub
      try{
          listview.onRefreshComplete();
          Bundle bundle = msg.getData();
          String json = "";
          if (bundle == null) {
              return;
          }
          json = bundle.getString(Contents.JSON);
          if(bundle.getInt(Contents.STATUS)!=200)
          {
              return;
          }
          if (json == null) {
              return;
          }
          Gson gson = new Gson();
          Type entityType = null;
          switch (msg.what) {
              case 201:
                  JSONArray jsonArray = new JSONObject(json).getJSONObject(Contents.DATA).getJSONArray(Contents.LISTINIFO);
                  listInfo = new ArrayList<HishopUserShippingAddresses>();
                  entityType = new TypeToken<List<HishopUserShippingAddresses>>() {
                  }.getType();
                  List<HishopUserShippingAddresses> list = gson.fromJson(jsonArray.toString(), entityType);
                  if (list != null) {
                      for (int i = 0; i < list.size(); i++) {
                          HishopUserShippingAddresses info = list.get(i);
                          listInfo.add(info);
                      }
                  }
                  infoAdapter = new AddressAdapter(this, listInfo, this);
                  listview.setAdapter(infoAdapter);
                  infoAdapter.notifyDataSetChanged();
                  if (listInfo == null || listInfo.size() <= 0) {
                      startActivityForResult(new Intent(AddressManagerActivity.this, AddAddressActivity.class), 200);
                  }
                  break;
              case 202:
                  initData();
                  JSONObject jsonObject = new JSONObject(json);
                  if(jsonObject.getInt(Contents.STATUS)==200) {
                      listInfo.remove(deletePosition);
                      deletePosition = 0;
                  }
                  break;
          }
      }catch (Exception e){
          e.printStackTrace();
      }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_address_manager);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_manager_address));
        listview = (PullToRefreshListView) findViewById(R.id.listview);
        listview.setOnItemClickListener(this);
        listview.setOnRefreshListener(this);
        TextView add = (TextView) findViewById(R.id.add);
        add.setVisibility(View.VISIBLE);
        add.setOnClickListener(new OnClickListener()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivityForResult(new Intent(AddressManagerActivity.this, AddAddressActivity.class), 200);
            }
        });
        initData();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 200) {
                initData();
            }
        }
    }

    void initData() {
        Map<String,String> m = new HashMap<>();
        AspnetUsers user =new UserDataShare(this).getUserData();
        m.put(Contents.TOKEN,user.getUserToken().getAccountToken());
        m.put(Contents.USERID,user.getUserId()+"");
        getData(com.android.volley.Request.Method.POST, 201, "addresses/user_shipping_addresses.html", m, null, 1);
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
        // TODO Auto-generated method stub
        initData();
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
        // TODO Auto-generated method stub
        listview.onRefreshComplete();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void selectedChecked(int position) {
        // TODO Auto-generated method stub
        HishopUserShippingAddresses info = listInfo.get(position);
        Intent intent = new Intent();
        intent.putExtra(Contents.INFO, info);
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void updateAddress(int position) {
        // TODO Auto-generated method stub
        Intent intent = new Intent(this, UpdateUserAddressActivity.class);
        intent.putExtra(Contents.INFO, listInfo.get(position));
        startActivityForResult(intent, 200);
    }

    int deletePosition;
    CustomDialog dialog;

    @Override
    public void deleteAddress(final int position) {
        // TODO Auto-generated method stub
        deletePosition = position;
        dialog = new CustomDialog(this, R.style.mystyle, R.layout.customdialog, R.array.title_car_delete_address,
                new CustomDialog.CustomDialogListener() {

                    @Override
                    public void customDialogClickRight() {
                        // TODO Auto-generated method stub
                        dialog.dismiss();
                        Map<String,String> m = new HashMap<>();
                        AspnetUsers user =new UserDataShare(AddressManagerActivity.this).getUserData();
                        UserToken userToken = user.getUserToken();
                        m.put(Contents.TOKEN,userToken.getAccountToken());
                        m.put(Contents.USERID, user.getUserId() + "");
                        m.put("address.shippingId",listInfo.get(deletePosition).getShippingId()+"");
                        getData(Request.Method.POST, 202, "addresses/delete_user_shipping_addresses.html", m, null, 1);
                    }

                    @Override
                    public void customDialogClickLeft() {
                        // TODO Auto-generated method stub
                        dialog.dismiss();
                    }
                });
        dialog.show();
    }
}
