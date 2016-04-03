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

import com.zgld.mall.R;
import com.zgld.mall.utils.Contents;

import java.util.HashMap;
import java.util.Map;

public class ModifyUserPasswordActivity extends BaseActivity {
    EditText old_pwd, new_pwd, new_confirm_pwd;
    Button complete;

    @Override
    public void handleMsg(Message msg) {
        // TODO Auto-generated method stub
        if (msg.getData() == null || msg.getData().getString(Contents.JSON) == null) {
            return;
        }
        String json = msg.getData().getString(Contents.JSON);
        switch (msg.what) {
            case 201:
                if (json != null && json.trim().equals("1")) {
                    Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK);
                    finish();
                } else {
                    Toast.makeText(this, getString(R.string.update_failed), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_modify_user_password);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(getString(R.string.title_update_pwd));
        old_pwd = (EditText) findViewById(R.id.old_pwd);
        new_pwd = (EditText) findViewById(R.id.new_pwd);
        new_confirm_pwd = (EditText) findViewById(R.id.new_confirm_pwd);
        complete = (Button) findViewById(R.id.complete);
        complete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                updatePwd();
            }

        });
    }

    private void updatePwd() {
        // TODO Auto-generated method stub
        if (TextUtils.isEmpty(new_pwd.getText().toString())) {
            Toast.makeText(this, getString(R.string.modify_user_new_password_is_not_null), Toast.LENGTH_SHORT).show();
            return;
        }
        if (new_pwd.getText().toString().length() < 5) {
            Toast.makeText(this, getString(R.string.modify_user_new_password_length_error), Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(new_confirm_pwd.getText().toString())) {
            Toast.makeText(this, getString(R.string.modify_user_confirm_password_is_not_null), Toast.LENGTH_SHORT)
                    .show();
            return;
        }
        if (new_confirm_pwd.getText().toString().length() < 5) {
            Toast.makeText(this, getString(R.string.modify_user_confirm_password_length_error), Toast.LENGTH_SHORT)
                    .show();
            return;
        }
        if (!new_pwd.getText().toString().equals(new_confirm_pwd.getText().toString())) {
            Toast.makeText(this, getString(R.string.modify_user_new_password_and_confirm_password_not_consistent),
                    Toast.LENGTH_SHORT).show();
            return;
        }
        Map<String, String> m = new HashMap<String, String>();
//        m.put("token", Contents.getUser(this).getToken());
//        m.put("userId", Contents.getUser(this).getUserId());
        m.put("password", new_confirm_pwd.getText().toString());
        getData(com.android.volley.Request.Method.POST, 201, "User/UserUpdatePwd", m, null, 1);
    }
}
