package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.utils.Contents;

import java.util.HashMap;
import java.util.Map;

public class UserWithdrawActivity extends BaseActivity {
    EditText number;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_user_withdraw);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("申请提现");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        number = (EditText) findViewById(R.id.number);
        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,String> m = new HashMap<String, String>();
                if(number.getText().toString()==null || number.getText().length()<=0){
                    Toast.makeText(UserWithdrawActivity.this,"请收入金额!",Toast.LENGTH_LONG).show();
                    return;
                }
                m.put("amount",number.getText().toString());
                getData(UserWithdrawActivity.this,201, "account/user_apply_withdrawal.html", m,null);
            }
        });
    }

    @Override
    public void handleMsg(Message msg) {
        try{
            if(msg.getData().getInt(Contents.STATUS)==200){
                finish();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
