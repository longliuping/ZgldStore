package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.UserProfile;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class AlipayAccountActivity extends BaseActivity implements View.OnClickListener{
    EditText name,account;
    View ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_alipay_account);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("绑定支付宝");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        name = (EditText) findViewById(R.id.name);
        account = (EditText) findViewById(R.id.account);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);
        UserProfile profile = new UserDataShare(this).getUserData().getUserProfile();
        name.setText(profile.getRealName());
        account.setText(profile.getAlipayAccount());
    }

    @Override
    public void handleMsg(Message msg) {
        try {
            if(msg.getData().getInt(Contents.STATUS)==200){
                new UserDataShare(this).updateUser(msg);
                setResult(RESULT_OK);
                finish();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ok:
                if(StringUtils.isEmpty(name)){
                    Toast.makeText(this,"姓名不能为空",Toast.LENGTH_LONG).show();
                }else if(StringUtils.isEmpty(account)){
                    Toast.makeText(this,"支付宝账户不能为空",Toast.LENGTH_LONG).show();
                }else {
                    Map m = new HashMap<>();
                    m.put("name",name.getText().toString());
                    m.put("account",name.getText().toString());
                    getData(this,201,"user/bind_alipay.html",m,null);
                }
                break;
        }
    }
}
