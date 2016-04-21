package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.StringUtils;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class UpdateUserPasswordActivity extends BaseActivity implements View.OnClickListener{
    Button submit;
    EditText old_pwd,new_pwd,new_confirm_pwd;
    YAccount users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_update_user_password);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        String nameStr = this.getIntent().getStringExtra(Contents.NAME);
        users = new UserDataShare(this).getUserData();
        if(nameStr==null || users == null){
            finish();;
            return;
        }
        TextView name = (TextView) findViewById(R.id.title_center);
        name.setText(nameStr);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
        old_pwd = (EditText) findViewById(R.id.old_pwd);
        new_pwd = (EditText) findViewById(R.id.new_pwd);
        new_confirm_pwd = (EditText) findViewById(R.id.new_confirm_pwd);
    }

    @Override
    public void handleMsg(Message msg) {
        try{
            if(msg.getData().getInt(Contents.STATUS)==200){
                switch (msg.what){
                    case 201:
                        UserDataShare share = new UserDataShare(this);
                        share.updateUser(msg);
                        String pam[] = share.getLoginInfo();
                        if (pam != null) {
                            share.saveLoginInfo(pam[0], new_pwd.getText().toString());
                        }
                        BroadcastUtils.sendUserUpdate(this);
                        setResult(RESULT_OK);
                        finish();
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                if(StringUtils.isEmpty(old_pwd)){
                    Toast.makeText(this,"原始密码不能为空",Toast.LENGTH_LONG).show();
                }else if(StringUtils.isEmpty(new_pwd)){
                    Toast.makeText(this,"新密码不能为空",Toast.LENGTH_LONG).show();
                }else if(StringUtils.isEmpty(new_confirm_pwd)){
                    Toast.makeText(this,"确认密码不能为空",Toast.LENGTH_LONG).show();
                }else if(!new_pwd.getText().toString().equals(new_confirm_pwd.getText().toString())){
                    Toast.makeText(this,"新密码和确认密码不一致",Toast.LENGTH_LONG).show();
                }else if(new_pwd.getText().toString().length()<6){
                    Toast.makeText(this,"新密码长度不能小于6位数",Toast.LENGTH_LONG).show();
                }else{
                    Map<String,String> m = new HashMap<>();
                    m.put("oldPassword",old_pwd.getText().toString());
                    m.put("password",new_pwd.getText().toString());
                    getData(UpdateUserPasswordActivity.this,201,"user/update_user_password.html",m,null);
                }
                break;
        }
    }
}
