package com.zgld.mall.activity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import com.zgld.mall.R;

/**
 * 关于我们
 */
public class AboutActivity extends BaseActivity {
    @Override
    public void handleMsg(Message msg) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_about);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated com.android.volley.Request.Method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText("关于我们");
    }
}
