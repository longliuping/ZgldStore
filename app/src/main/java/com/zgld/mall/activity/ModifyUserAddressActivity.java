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
import com.zgld.mall.beans.City;
import com.zgld.mall.beans.County;
import com.zgld.mall.beans.Province;
import com.zgld.mall.beans.UserShippingAddresses;
import com.zgld.mall.utils.Contents;

/**
 * 修改用户地址
 *
 */
public class ModifyUserAddressActivity extends BaseActivity implements OnClickListener {
    EditText address, name, phone, landline, detail, zip_code;
    Button complete;
    UserShippingAddresses info = new UserShippingAddresses();

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub
        if (msg.getData() == null || msg.getData().getString(Contents.JSON) == null) {
            return;
        }
        String json = msg.getData().getString(Contents.JSON);
        switch (msg.what) {
            case 202:
                if (json != null && json.trim().equals("1")) {
                    Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK);
                    finish();
                } else {
                    Toast.makeText(this, getString(R.string.failed), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_modify_user_address);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
        info = (UserShippingAddresses) this.getIntent().getSerializableExtra(Contents.INFO);
        if (info == null) {
            finish();
            return;
        }
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_update_receiving_address));
        address = (EditText) findViewById(R.id.address);
        address.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivityForResult(new Intent(ModifyUserAddressActivity.this, ProvinceActivity.class), 200);
            }
        });
        complete = (Button) findViewById(R.id.complete);
        complete.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        landline = (EditText) findViewById(R.id.landline);
        detail = (EditText) findViewById(R.id.detail);
        zip_code = (EditText) findViewById(R.id.zip_code);

        name.setText(info.getShipTo());
//        phone.setText(info.getCellPhone());
//        landline.setText(info.getTelPhone());
//        address.setText(info.getShippingRegion());
        detail.setText(info.getAddress());
        zip_code.setText(info.getZipcode());
    }

    Province province;
    City city;
    County county;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        province = Contents.listProvince.get(Contents.selectedProvincePosition);
        if (province != null) {
            city = province.getCitys().get(Contents.selectedCityPosition);
            if (city != null) {
                county = city.getCountys().get(Contents.selectedCountyPosition);
                if (county != null) {
                    address.setText(province.getName() + "-" + city.getName() + "-" + county.getName());
                }
            } else {
                address.setText(province.getName() + "-" + city.getName());
            }
        } else {
            address.setText(province.getName());
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
//                m.put("Token", Contents.getUser(this).getToken());
//                m.put("userId", Contents.getUser(this).getUserId());
                m.put("shipTo", name.getText().toString());// 名字
                m.put("address", detail.getText().toString());// 详细地址
                m.put("zipCode", zip_code.getText().toString());// 邮政编码
                m.put("cellPhone", phone.getText().toString());
                m.put("telPhone", landline.getText().toString());
                if (county != null) {
                    m.put("regionId", county.getId() + "");
                } else if (city != null) {
                    m.put("regionId", city.getId() + "");
                } else if (province != null) {
                    m.put("regionId", province.getId() + "");
                } else {
                    m.put("regionId", info.getRegionId() + "");
                }
                m.put("shippingRegion", address.getText().toString());
                m.put("shippingId", info.getAddressId() + "");
                getData(com.android.volley.Request.Method.POST, 202, "User/UserShippingAddressesUpdate", m, null, 1);
                break;
        }
    }
}
