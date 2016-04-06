package com.zgld.mall.activity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.zgld.mall.R;

public class PresentDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_present_detail);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title_center);
        title.setText(this.getIntent().getStringExtra("name") + "");
    }

    @Override
    public void handleMsg(Message msg) {

    }
}
