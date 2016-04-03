package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
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

public class UpdateUserSexActivity extends BaseActivity implements View.OnClickListener{
    Button submit;
    View right_male, right_female, male, female;
    AspnetUsers users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_update_user_sex);
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
        right_male = findViewById(R.id.right_male);
        right_female = findViewById(R.id.right_female);
        male = findViewById(R.id.male);
        male.setOnClickListener(this);
        female = findViewById(R.id.female);
        female.setOnClickListener(this);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);
//        updateView(users.getGender()+"");
    }
    void updateView(String Gender) {
        if (TextUtils.isEmpty(Gender)) {
            right_male.setVisibility(View.VISIBLE);
            right_female.setVisibility(View.GONE);
        } else if (Gender.equals("1")) {
            right_male.setVisibility(View.VISIBLE);
            right_female.setVisibility(View.GONE);
        } else if (Gender.equals("0")) {
            right_male.setVisibility(View.GONE);
            right_female.setVisibility(View.VISIBLE);
        } else {
            right_male.setVisibility(View.GONE);
            right_female.setVisibility(View.VISIBLE);
        }
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
            case R.id.male:
                updateView("1");
                break;
            case R.id.female:
                updateView("0");
                break;
            case R.id.submit:
                int a = right_male.getVisibility();
                int b = right_female.getVisibility();
                if(right_male.getVisibility() == View.GONE && right_female.getVisibility()==View.GONE){
                    Toast.makeText(this, "请选择", Toast.LENGTH_LONG).show();
                }else{
                    Map<String,String> m = new HashMap<>();
                    if (right_male.getVisibility() == View.VISIBLE) {
                        m.put("userinfo.gender", "1");
                    } else {
                        m.put("userinfo.gender", "0");
                    }
                    m.put(Contents.TOKEN,users.getUserToken().getAccountToken());
                    m.put(Contents.USERID,users.getUserId()+"");
                    getData(Request.Method.POST,201,"user/update_user_gender.html",m,null,1);
                }
                break;
        }
    }
}
