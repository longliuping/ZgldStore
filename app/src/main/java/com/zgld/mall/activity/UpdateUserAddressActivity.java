package com.zgld.mall.activity;

import android.os.Bundle;
import com.zgld.mall.R;
import com.zgld.mall.beans.City;
import com.zgld.mall.beans.County;
import com.zgld.mall.beans.Province;
import com.zgld.mall.beans.UserShippingAddresses;
import com.zgld.mall.utils.Contents;

import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

/**
 * 修改用户地址
 *
 */

public class UpdateUserAddressActivity extends BaseActivity implements OnClickListener {

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub
        if (msg.getData() == null || msg.getData().getString(Contents.JSON) == null) {
            return;
        }
        String json = msg.getData().getString(Contents.JSON);
        switch (msg.what) {
            case 202:
                if(msg.getData().getInt("status")==200) {
                    setResult(RESULT_OK);
                    finish();
                }
                break;
        }
    }
    Button complete;
    UserShippingAddresses info = new UserShippingAddresses();
    EditText address, name, phone, detail, zip_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_update_user_address);
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
                startActivityForResult(new Intent(UpdateUserAddressActivity.this, ProvinceActivity.class), 200);
            }
        });
        complete = (Button) findViewById(R.id.complete);
        complete.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
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
                m.put("address.addressId", info.getAddressId()+"");
                m.put("address.shipTo", name.getText().toString());
                m.put("address.address", detail.getText().toString());
                m.put("address.zipcode", zip_code.getText().toString());
                m.put("address.mobile", phone.getText().toString());
                if (county.getId() <= 0) {
                    if (city.getId() <= 0) {
                        m.put("address.regionId", province.getId() + "");
                    } else {
                        m.put("address.regionId", city.getId() + "");
                    }
                } else {
                    m.put("address.regionId", county.getId() + "");
                }
                m.put("shippingRegion", address.getText().toString());
                m.put("shippingId", info.getAddressId() + "");
                getData( 202, "addresses/update_user_shipping_addresses.html", m, null);
                break;
        }
    }
}
