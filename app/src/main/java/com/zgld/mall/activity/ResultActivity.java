package com.zgld.mall.activity;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.zgld.mall.R;

public class ResultActivity extends BaseActivity {

    private ImageView barcodeImageView;
    private TextView formatTextView;
    private TextView timeTextView;
    private TextView metaTextView;
    private TextView resultTextView;
    private Bitmap barcodeBitmap;
    private String barcodeFormat;
    private String decodeDate;
    private CharSequence metadataText;
    private String resultString;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        setContentView(R.layout.activity_result);
        initView();
        mGetIntentData();
        setView();

    }

    @Override
    public void handleMsg(Message msg) {

    }

    private void setView() {
        barcodeImageView.setImageBitmap(barcodeBitmap);
        formatTextView.setText(barcodeFormat);
        timeTextView.setText(decodeDate);
        metaTextView.setText(metadataText);
        resultTextView.setText(resultString);
    }

    private void mGetIntentData() {
        bundle = new Bundle();
        bundle = this.getIntent().getExtras();
        barcodeBitmap = bundle.getParcelable("bitmap");
        barcodeFormat = bundle.getString("barcodeFormat");
        decodeDate = bundle.getString("decodeDate");
        metadataText = bundle.getCharSequence("metadataText");
        resultString = bundle.getString("resultString");
        if (!TextUtils.isEmpty(resultString) && resultString.startsWith("http")) {
            Uri uri = Uri.parse(resultString);
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(it);
            finish();
        }
    }

    private void initView() {
        barcodeImageView = (ImageView) findViewById(R.id.barcode_image_view);
        formatTextView = (TextView) findViewById(R.id.format_text_view);
        timeTextView = (TextView) findViewById(R.id.time_text_view);
        metaTextView = (TextView) findViewById(R.id.meta_text_view);
        resultTextView = (TextView) findViewById(R.id.contents_text_view);
        findViewById(R.id.back).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
        TextView title = (TextView) findViewById(R.id.title);
        title.setText("扫描结果");
    }

    public void backCapture(View view) {
        runBack();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            runBack();
        }
        return false;
    }

    public void runBack() {
        Intent intent = new Intent(ResultActivity.this, CaptureActivity.class);
        startActivity(intent);
        ResultActivity.this.finish();
    }
}

