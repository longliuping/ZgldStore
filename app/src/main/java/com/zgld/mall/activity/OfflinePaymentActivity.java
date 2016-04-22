package com.zgld.mall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.utils.Contents;

import java.util.HashMap;
import java.util.Map;

public class OfflinePaymentActivity extends BaseActivity implements View.OnClickListener{
    EditText money;
    View pay_button;
    Integer shopId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_offline_payment);
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText("线下付款");
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        money = (EditText) findViewById(R.id.money);
        pay_button = findViewById(R.id.pay_button);
        pay_button.setOnClickListener(this);
        shopId = this.getIntent().getIntExtra(Contents.SHOPID, 0);
        if(shopId==null || shopId<=0){
            finish();
            return;
        }
    }

    @Override
    public void handleMsg(Message msg) {
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pay_button:
                if(new UserDataShare(this).getUserData()!=null){
                    if(TextUtils.isEmpty(money.getText())){
                        Toast.makeText(this,"请输入金额",Toast.LENGTH_LONG).show();
                    }else{
                        Map m = new HashMap<>();
                        m.put("shopId",shopId+"");
                        m.put("money",money.getEditableText().toString());
                        getData(this, 201, "supplier/offline_payment.html", m, null);
                    }
                }else{
                    Contents.loginPage(this,null);
                }
                break;
        }
    }
}
