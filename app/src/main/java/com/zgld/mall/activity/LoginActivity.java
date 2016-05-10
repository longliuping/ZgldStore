package com.zgld.mall.activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends BaseActivity implements  View.OnClickListener{

    EditText et_user_name,et_user_password;
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.tv_register).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(LoginActivity.this, RegisterActivity.class), 200);
            }
        });
        login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(this);
        et_user_password = (EditText) findViewById(R.id.et_user_password);
        et_user_name = (EditText) findViewById(R.id.et_user_name);
        String user[] = new UserDataShare(this).getLoginInfo();
        if (user != null) {
            et_user_name.setText(user[0]);
            et_user_password.setText(user[1]);
        }
    }

    @Override
    public void handleMsg(Message msg) {
        try{
        if(msg.getData().getInt(Contents.STATUS)==200){
            switch (msg.what){
                case 201:
                    JSONObject jo = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
                    YAccount user = new Gson().fromJson(jo.toString(), new TypeToken<YAccount>() {
                    }.getType());
//                    Toast.makeText(getApplicationContext(),user.getUserName(),Toast.LENGTH_SHORT).show();
                    new UserDataShare(this).saveUserData(user);
                    new UserDataShare(this).saveLoginInfo(et_user_name.getText().toString(), et_user_password.getText()
                                .toString());
                    setResult(RESULT_OK);
                    finish();
                    break;
            }
        }
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button:
                login();
                break;
        }
    }
    void login()
    {
        if(et_user_name.getText()==null || et_user_name.getText().toString().isEmpty())
        {
            Toast.makeText(LoginActivity.this,"用户名不能为空!",Toast.LENGTH_SHORT).show();
        }else
        if(et_user_password.getText()==null || et_user_password.getText().toString().isEmpty())
        {
            Toast.makeText(this,"密码不能为空!",Toast.LENGTH_SHORT).show();
        }else{
            Map<String,String> m = new HashMap();
            m.put("name",et_user_name.getText().toString());
            m.put("password",et_user_password.getText().toString());
            m.put("id","1");
            getData(LoginActivity.this,201, "user/user_login.html", m, null);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==RESULT_OK){
            if(requestCode==200){
                setResult(RESULT_OK);
                finish();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
