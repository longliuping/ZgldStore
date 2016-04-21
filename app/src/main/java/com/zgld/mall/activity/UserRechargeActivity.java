package com.zgld.mall.activity;

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

public class UserRechargeActivity extends BaseActivity {
    EditText number;
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_user_recharge);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("充值");
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
                if (number.getText().toString() == null || number.getText().length() <= 0) {
                    Toast.makeText(UserRechargeActivity.this, "请收入金额!", Toast.LENGTH_LONG).show();
                    return;
                }
                m.put("amount",number.getText().toString());
                getData(UserRechargeActivity.this,201, "account/user_recharge.html", m, null);
            }
        });
    }

    @Override
    public void handleMsg(Message msg) {
        try{
            if(msg.getData().getInt(Contents.STATUS)==200){
//                finish();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
