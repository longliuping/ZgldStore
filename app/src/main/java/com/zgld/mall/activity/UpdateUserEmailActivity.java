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
import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.AspnetUsers;
import com.zgld.mall.utils.BroadcastUtils;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.EmailUtil;
import com.zgld.mall.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class UpdateUserEmailActivity extends BaseActivity implements View.OnClickListener{
    Button submit;
    EditText name;
    AspnetUsers users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_update_user_email);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        String nameStr = this.getIntent().getStringExtra("name");
        users = new UserDataShare(this).getUserData();
        if(nameStr==null || users == null){
            finish();;
            return;
        }
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText(nameStr);
        name = (EditText) findViewById(R.id.name);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void handleMsg(Message msg) {
        try {
            if(msg.getData().getInt(Contents.STATUS)==200) {
                switch (msg.what) {
                    case 201:
                        UserDataShare share = new UserDataShare(this);
                        share.updateUser(msg);
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
                if(StringUtils.isEmpty(name)){
                    Toast.makeText(this,"内容不能为空",Toast.LENGTH_LONG).show();
                }else if(!EmailUtil.emailMatches(name.getText().toString())){
                    Toast.makeText(this,"邮箱格式错误",Toast.LENGTH_LONG).show();
                }else{
                    Map<String,String> m = new HashMap<>();
                    m.put(Contents.TOKEN,users.getUserToken().getAccountToken());
                    m.put(Contents.USERID,users.getUserId()+"");
                    m.put("userinfo.email",name.getText().toString());
                    getData(Request.Method.POST,201,"user/update_user_email.html",m,null,1);
                }
                break;
        }
    }
}
