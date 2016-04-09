package com.zgld.mall.activity;
import java.util.HashMap;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.City;
import com.zgld.mall.beans.County;
import com.zgld.mall.beans.GsonObject;
import com.zgld.mall.beans.Province;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.Contents;

import org.json.JSONObject;

/**
 * 添加地址
 *
 */
public class AddAddressActivity extends BaseActivity implements OnClickListener {
    EditText address, name, phone, landline, detail, zip_code;
    Button complete;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub
       try{
           if (msg.getData() == null || msg.getData().getString(Contents.JSON) == null) {
               return;
           }
           String json = msg.getData().getString(Contents.JSON);
           switch (msg.what) {
               case 202:
                   JSONObject jo = new JSONObject(json);
                   if (jo.getInt(Contents.STATUS)==200) {
                       Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show();
                       setResult(RESULT_OK);
                       finish();
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
        setContentView(R.layout.activity_add_address);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_add_address));
        address = (EditText) findViewById(R.id.address);
        address.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AddAddressActivity.this, ProvinceActivity.class), 200);
            }
        });
        complete = (Button) findViewById(R.id.complete);
        complete.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        landline = (EditText) findViewById(R.id.landline);
        detail = (EditText) findViewById(R.id.detail);
        zip_code = (EditText) findViewById(R.id.zip_code);
    }

    Province province;
    City city;
    County county;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        province = Contents.listProvince.get(Contents.selectedProvincePosition);
        if (province != null && province.getCitys().size() > 0) {
            city = province.getCitys().get(Contents.selectedCityPosition);
            if (city != null && city.getCountys().size() > 0) {
                county = city.getCountys().get(Contents.selectedCountyPosition);
                if (county != null) {
                    address.setText(province.getName() + "-" + city.getName() + "-" + county.getName());
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.complete:
                if (TextUtils.isEmpty(name.getText().toString())) {
                    Toast.makeText(this, getString(R.string.name_not_be_empty), Toast.LENGTH_SHORT).show();
                    break;
                }
                if (TextUtils.isEmpty(phone.getText().toString())) {
                    Toast.makeText(this, getString(R.string.phone_not_be_empty), Toast.LENGTH_SHORT).show();
                    break;
                }
                if (TextUtils.isEmpty(address.getText().toString())) {
                    Toast.makeText(this, getString(R.string.address_not_be_empty), Toast.LENGTH_SHORT).show();
                    break;
                }
                if (TextUtils.isEmpty(detail.getText().toString())) {
                    Toast.makeText(this, getString(R.string.detail_not_be_empty), Toast.LENGTH_SHORT).show();
                    break;
                }
                Map<String, String> m = new HashMap<String, String>();
                m.put("address.shipTo", name.getText().toString());
                m.put("address.address", detail.getText().toString());
                m.put("address.zipcode", zip_code.getText().toString());
                m.put("address.cellPhone", phone.getText().toString());
                m.put("address.telPhone", landline.getText().toString());
                if (county.getId() <= 0) {
                    if (city.getId() <= 0) {
                        m.put("address.regionId", province.getId() + "");
                    } else {
                        m.put("address.regionId", city.getId() + "");
                    }
                } else {
                    m.put("address.regionId", county.getId() + "");
                }
                getData(202, "addresses/add_user_shipping_addresses.html", m, null);
                break;
        }
    }
}
