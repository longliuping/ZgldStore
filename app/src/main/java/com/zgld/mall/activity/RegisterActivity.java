package com.zgld.mall.activity;

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
import com.zgld.mall.utils.Contents;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends BaseActivity implements  View.OnClickListener
{
    Button user_register;
    EditText user_name,user_password,user_password_r,user_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.back).setOnClickListener(this);
        TextView title = (TextView) findViewById(R.id.title);
        title.setText("注册");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        user_name = (EditText) findViewById(R.id.user_name);
        user_password = (EditText) findViewById(R.id.user_password);
        user_password_r = (EditText) findViewById(R.id.user_password_r);
        user_code = (EditText) findViewById(R.id.user_code);
        user_register = (Button) findViewById(R.id.user_register);
        user_register.setOnClickListener(this);
    }

    @Override
    public void handleMsg(Message msg) {
        try{
            switch (msg.what){
                case 201:
                    if(msg.getData().getInt(Contents.STATUS)==200){
                        JSONObject jsonObject = new JSONObject(msg.getData().getString(Contents.JSON)).getJSONObject(Contents.DATA).getJSONObject(Contents.INFO);
                        Gson gson = new Gson();
                        AspnetUsers users = gson.fromJson(jsonObject.toString(), new TypeToken<AspnetUsers>() {
                        }.getType());
                        new UserDataShare(this).saveUserData(users);
                        setResult(RESULT_OK);
                        finish();
                    }
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.user_register:
                if(user_name.getText()==null || user_name.getText().toString().isEmpty())
                {
                    Toast.makeText(this,"用户名不能为空",Toast.LENGTH_SHORT).show();
                }else if(user_name.getText().toString().length()<6){
                    Toast.makeText(this,"用户名长度不能小于6",Toast.LENGTH_SHORT).show();
                }else if(user_password.getText().toString()==null || user_password.getText().toString().isEmpty()){
                    Toast.makeText(this,"密码不能为空",Toast.LENGTH_SHORT).show();
                }else if(user_password.getText().toString().length()<6)
                {
                    Toast.makeText(this,"密码长度不能小于6",Toast.LENGTH_SHORT).show();
                }else if(!user_password.getText().toString().equals(user_password_r.getText().toString()))
                {
                    Toast.makeText(this,"两次输入的密码不一致",Toast.LENGTH_SHORT).show();
                }else{
                    Map<String,String> m = new HashMap<>();
                    m.put("name",user_name.getText().toString());
                    m.put("password", user_password.getText().toString());
                    if(user_code.getText()!=null){
                        m.put("id",user_code.getText().toString());
                    }
                    getData(Request.Method.POST, 201, "user/user_register.html",m,null,1);
                }
                break;
        }
    }
}
