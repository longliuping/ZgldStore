package com.zgld.mall.activity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.fragment.BbsFragment;
import com.zgld.mall.fragment.CarFragment;
import com.zgld.mall.fragment.MainHomeFragment;
import com.zgld.mall.fragment.MineFragment;

public class MainActivity extends BaseFragmentActivity {
    private static FragmentManager manager;
    private FragmentTabHost fragmentTabHost;
    private LayoutInflater inflater;
    private Class fragmengArray[] = {MainHomeFragment.class, BbsFragment.class,
            CarFragment.class, MineFragment.class };
    private int mImageViewArray[] = { R.drawable.tab_homepage, R.drawable.tab_bbs, R.drawable.tab_shop,
            R.drawable.tab_mine };
    private String mTextViewArray[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startService(new Intent(this, BackstageService.class));
        manager = getSupportFragmentManager();
        initView();
    }

    @Override
    public void handleMsg(Message msg) {

    }


    private void initView() {
        mTextViewArray = getResources().getStringArray(R.array.title_menu);
        inflater = LayoutInflater.from(this);
        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        int count = fragmengArray.length;
        for (int i = 0; i < count; i++) {
            TabHost.TabSpec tabSpec = fragmentTabHost.newTabSpec(mTextViewArray[i]).setIndicator(getTabItemView(i));
            fragmentTabHost.addTab(tabSpec, fragmengArray[i], null);
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#000000"));
        }
        fragmentTabHost.getTabWidget().setDividerDrawable(null);
    }
    private View getTabItemView(int i) {
        View view = inflater.inflate(R.layout.tab_item_view, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        imageView.setImageResource(mImageViewArray[i]);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(mTextViewArray[i]);
        return view;
    }

    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            PackageManager pm = getPackageManager();
            ResolveInfo homeInfo = pm.resolveActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME),
                    0);
            ActivityInfo ai = homeInfo.activityInfo;
            Intent startIntent = new Intent(Intent.ACTION_MAIN);
            startIntent.addCategory(Intent.CATEGORY_LAUNCHER);
            startIntent.setComponent(new ComponentName(ai.packageName, ai.name));
            startActivitySafely(startIntent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void startActivitySafely(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        } catch (SecurityException e) {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        }
    }

    private static void changeFragment(Fragment f, boolean init) {
        FragmentTransaction ft = manager.beginTransaction();
        // ft.replace(R.id.simple_fragment, f);
        if (!init)
            ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
