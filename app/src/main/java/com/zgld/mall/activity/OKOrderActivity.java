package com.zgld.mall.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.adapter.OKOrderAdapter;
import com.zgld.mall.alipay.AlipayPay;
import com.zgld.mall.alipay.AsyncAlipay;
import com.zgld.mall.alipay.OrderPay;
import com.zgld.mall.alipay.PayResult;
import com.zgld.mall.beans.OrderPayConfig;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.ShoppingCarts;
import com.zgld.mall.beans.UserShippingAddresses;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.pop.PayTypePopupWindow;
import com.zgld.mall.sync.OrderAsync;
import com.zgld.mall.utils.AddressXmlUtils;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OKOrderActivity extends BaseActivity implements PullToRefreshBase.OnRefreshListener2, AdapterView.OnItemClickListener, View.OnClickListener,
        OKOrderAdapter.BaseExpandableListAdapterListener {

    ExpandableListView listview;
    OKOrderAdapter infoAdapter;
    int pageIndex = 1;

    TextView item_pay;
    TextView item_payment_amount;
    RelativeLayout bottom;
    ArrayList<ShoppingCarts> listInfo = new ArrayList<>();
    RelativeLayout next;
    TextView name, address, address_title;
    UserShippingAddresses addressInfo;
    int totalProductNumber = 0;// 总数量
    int totalMarketPrice = 0;// 市场总价
    int totalSalePrice = 0;//销售总价
    String remark = "";
    PayTypePopupWindow menuWindow;
    Handler myHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 202:
                    int groupCount = listview.getCount();
                    for (int i = 0; i < groupCount; i++) {
                        listview.expandGroup(i);
                    }
                    infoAdapter.notifyDataSetChanged();
                    break;
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_okorder);
        listInfo = (ArrayList<ShoppingCarts>)this.getIntent().getSerializableExtra(Contents.LISTINIFO);
        if(listInfo==null || listInfo.size()<=0){
            finish();
            return;
        }
        for (int i = 0;i<listInfo.size();i++){
            ShoppingCarts car = listInfo.get(i);
            for (int j = 0;j<car.getListProducts().size();j++){
                Products pro = car.getListProducts().get(j);
                if(pro.getSku()!=null) {
                    totalSalePrice += pro.getFormCombineValue().getGoSalePrice() * car.getQuantity();
                    totalMarketPrice += pro.getMarketPrice() * car.getQuantity();
                } else {
                    totalSalePrice += pro.getFormCombineValue().getGoSalePrice() * car.getQuantity();
                    totalMarketPrice += pro.getMarketPrice() * car.getQuantity();
                }
            }
        }
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ScrollView scrollview = (ScrollView) findViewById(R.id.scrollview);
        scrollview.setFocusable(true);
        scrollview.setFocusableInTouchMode(true);
        scrollview.requestFocus();
        listview = (ExpandableListView) findViewById(R.id.listview);
        listview.setGroupIndicator(null);
        listview.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_ok_order));
        item_pay = (TextView) findViewById(R.id.item_pay);
        item_pay.setOnClickListener(this);
        item_payment_amount = (TextView) findViewById(R.id.item_payment_amount);
        bottom = (RelativeLayout) findViewById(R.id.bottom);
        totalMoney();
        infoAdapter = new OKOrderAdapter(this, listInfo, this);
        listview.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();

        next = (RelativeLayout) findViewById(R.id.next);
        next.setOnClickListener(this);
        name = (TextView) findViewById(R.id.name);
        address = (TextView) findViewById(R.id.address);
        address_title = (TextView) findViewById(R.id.address_title);
        myHandler.sendEmptyMessage(202);
    }

    @Override
    public void handleMsg(Message msg) {
       try{
           Bundle bundle = msg.getData();
           String json = "";
           json = bundle.getString(Contents.JSON);
           switch (msg.what) {
               case 205:
                   if (msg.getData().getInt(Contents.STATUS) == 200) {
                       BroadcastUtils.sendCarProduct(this);
                       setResult(RESULT_OK);
                       final Integer orderId = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getInt("orderId");
//                       new OrderPay().pay(orderId, this, new OrderPay.OrderPayListener() {
//                           @Override
//                           public void onCompelete(Message msg) {
//                               Intent intent = new Intent();
//                               intent.setClass(OKOrderActivity.this,BuyersOrdersFragmentActivity.class);
//                               startActivity(intent);
//                               finish();
//                           }
//                       });
                       final WindowManager.LayoutParams lp = this.getWindow().getAttributes();
                       lp.alpha = 0.5F; // 0.0-1.0
                       this.getWindow().setAttributes(lp);
                       // 实例化SelectPicPopupWindow
                       menuWindow = new PayTypePopupWindow(this, new PayTypePopupWindow.PayTypePopupWindowListener() {
                           @Override
                           public void onComplete(Integer position, String str) {
                               menuWindow.dismiss();
                               switch (position){
                                   case 0:
                                       new OrderPay().pay(orderId, OKOrderActivity.this, new OrderPay.OrderPayListener() {
                                           @Override
                                           public void onCompelete(Message msg) {
                                               Intent intent = new Intent();
                                                intent.setClass(OKOrderActivity.this,BuyersOrdersFragmentActivity.class);
                                                startActivity(intent);
                                                finish();
                                           }
                                       });
                                       break;
                                   case 1:
                                       Map m = new HashMap<>();
                                       m.put("orderid",orderId+"");
                                       new OrderAsync(OKOrderActivity.this, Request.Method.POST, 202, "supplier/order_offinle_alipay.html", m, null, 1, new OrderAsync.OrderAsyncListener() {
                                           @Override
                                           public void complete(Message msg) {
                                               Intent intent = new Intent();
                                               intent.setClass(OKOrderActivity.this,BuyersOrdersFragmentActivity.class);
                                               startActivity(intent);
                                               finish();
                                           }
                                       });
                                       break;
                                   case 2:
                                       Intent intent = new Intent();
                                       intent.setClass(OKOrderActivity.this, BuyersOrdersFragmentActivity.class);
                                       startActivity(intent);
                                       finish();
                                       break;
                               }
                           }
                       });
                       // 显示窗口
                       menuWindow.showAtLocation(this.getCurrentFocus(),
                               Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                       menuWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

                           @Override
                           public void onDismiss() {
                               // TODO Auto-generated com.android.volley.Request.Method
                               // stub
                               lp.alpha = 1.0F; // 0.0-1.0
                               OKOrderActivity.this.getWindow().setAttributes(lp);
                           }
                       });
                   }
                   break;
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {
    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 200) {
                addressInfo = (UserShippingAddresses) data.getSerializableExtra("info");
                bindAddress();
            }
        }
    }

    void bindAddress() {
        if (address != null) {
            name.setText("收货人:" + addressInfo.getShipTo() + "  电话：" + addressInfo.getMobile());
            String addStr = AddressXmlUtils.readXML(this,addressInfo.getRegionId());
            address.setText("收货地址：" +addStr+"  "+ addressInfo.getAddress());
            address_title.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.next:
                intent.setClass(this, AddressManagerActivity.class);
                startActivityForResult(intent, 200);
                break;
            case R.id.item_pay:
                YAccount users = new UserDataShare(this).getUserData();
                if(users==null){
                    Contents.loginPage(this,null,200);
                    return;
                }
//                if (addressInfo == null) {
//                    Toast.makeText(this, "请选择地址", Toast.LENGTH_SHORT).show();
//                    break;
//                }
                Map<String, String> m = new HashMap<String, String>();
                StringBuffer skuId = new StringBuffer();
                StringBuffer nums = new StringBuffer();
                for (int i = 0; i < listInfo.size(); i++) {
                    skuId.append(listInfo.get(i).getSku() + ",");
                    nums.append(listInfo.get(i).getQuantity() + ",");
                }
                if (!TextUtils.isEmpty(skuId)) {
                    skuId.deleteCharAt(skuId.length() - 1);
                }
                if (!TextUtils.isEmpty(nums)) {
                    nums.deleteCharAt(nums.length() - 1);
                }
//                m.put("shippingId", addressInfo.getAddressId()+"");
                m.put("skuId", skuId.toString());
                m.put("skuNumber", nums.toString());
                getData(OKOrderActivity.this,205, "order/submit_order.html", m, null);
                break;
        }
    }

    /**
     * 统计钱和产品数量
     *
     */
    void totalMoney() {
        item_payment_amount.setText(getString(R.string.pay_price)
                + PriceUtil.priceY((totalSalePrice) + ""));

    }

    @Override
    public void remark(int groupPosition, int childPosition, String remark) {
        this.remark = remark;
    }
}
