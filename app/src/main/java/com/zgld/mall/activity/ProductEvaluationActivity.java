package com.zgld.mall.activity;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.adapter.ProductWaitEvaluationAdapter;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.utils.Contents;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductEvaluationActivity extends BaseActivity implements View.OnClickListener {
    Orders info = new Orders();
    TextView comment;
    EditText connent;
    CheckBox item_car_manufactor;
    ImageView item_image;
    TextView item_title, item_detail, item_price, item_market_price;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        Bundle bundle = msg.getData();
        String json = "";
        if (bundle == null) {
            return;
        }
        json = bundle.getString(Contents.JSON);
        switch (msg.what) {
            case 305:
                // if (json.trim().equals("1")) {
                try {
                    JSONObject jsonObject = new JSONObject(json);
                    if (jsonObject != null) {
                        Toast.makeText(this, jsonObject.getString(Contents.MSG), Toast.LENGTH_SHORT).show();
                        setResult(RESULT_OK);
                        finish();
                    }
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // } else {
                // Toast.makeText(this, "评价失败", Toast.LENGTH_SHORT).show();
                // }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_product_evaluation);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated com.android.volley.Request.Method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_product_evaluation));
        info = (Orders) this.getIntent().getSerializableExtra(Contents.INFO);
        comment = (TextView) findViewById(R.id.comment);
        comment.setOnClickListener(this);
        connent = (EditText) findViewById(R.id.connent);
        item_car_manufactor = (CheckBox) findViewById(R.id.item_car_manufactor);
        item_image = (ImageView) findViewById(R.id.item_image);
        item_title = (TextView) findViewById(R.id.item_title);
        item_detail = (TextView) findViewById(R.id.item_detail);
        item_price = (TextView) findViewById(R.id.item_price);
        item_market_price = (TextView) findViewById(R.id.item_market_price);
        if (info != null) {
            ExpandableListView listview = (ExpandableListView) findViewById(R.id.listview);
            listview.setGroupIndicator(null);
            List<Orders> listInfo = new ArrayList<Orders>();
            listInfo.add(info);
            ProductWaitEvaluationAdapter infoAdapter = new ProductWaitEvaluationAdapter(this, listInfo);
            listview.setAdapter(infoAdapter);
            int groupCount = listview.getCount();
            for (int i = 0; i < groupCount; i++) {
                listview.expandGroup(i);
            }
        }
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated com.android.volley.Request.Method stub
        switch (v.getId()) {
            case R.id.comment:
                if (TextUtils.isEmpty(connent.getText().toString())) {
                    Toast.makeText(this, getString(R.string.content_not_be_empty), Toast.LENGTH_SHORT).show();
                    break;
                }
                Map<String, Object> m = new HashMap<String, Object>();
//                m.put("userName", Contents.getUser(this).getNickname());
//                m.put("token", Contents.getUser(this).getUserId());
//                // m.put("productId", info.getProductId());
//                m.put("userId", Contents.getUser(this).getUserId());
//                m.put("productId", info.getOrderItems().get(0).getProductId());
//                m.put("reviewContent", connent.getText().toString());
//                getData(com.android.volley.Request.Method.POST, 305, "productReviews/ProductReviewAdd", m, null, 1);
                break;
        }
    }
}
