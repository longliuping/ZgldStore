package com.zgld.mall.pop;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.adapter.PayTypeAdapter;
/**
 * Created by Am on 2016/4/28.
 */
public class PayTypePopupWindow extends PopupWindow {
    public interface PayTypePopupWindowListener{
        public void onComplete(Integer position,String str);
    }
    private View mMenuView;
    ListView listview;
    View close, ok;
    Integer position = null;
    PayTypePopupWindowListener listener;
    PayTypeAdapter infoAdapter = null;
    public PayTypePopupWindow(final Activity context, final PayTypePopupWindowListener listener) {
        this.listener = listener;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mMenuView = inflater.inflate(R.layout.pay_type, null);

        listview = (ListView) mMenuView.findViewById(R.id.listview);
        infoAdapter = new PayTypeAdapter(context);
        listview.setAdapter(infoAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onComplete(position,infoAdapter.getItem(position).toString());
                dismiss();
            }
        });
        // 设置按钮监听
        // 设置SelectPicPopupWindow的View
        this.setContentView(mMenuView);
        // 设置SelectPicPopupWindow弹出窗体的宽
        this.setWidth(LinearLayout.LayoutParams.FILL_PARENT);
        // 设置SelectPicPopupWindow弹出窗体的高
        this.setHeight(LinearLayout.LayoutParams.WRAP_CONTENT);
        // 设置SelectPicPopupWindow弹出窗体可点击
        this.setFocusable(true);
        // 设置SelectPicPopupWindow弹出窗体动画效果
        this.setAnimationStyle(R.style.AnimBottom);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0xb0000000);// #BFBFBF 0xb0000000
        // 设置SelectPicPopupWindow弹出窗体的背景
        this.setBackgroundDrawable(dw);
        // mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
        mMenuView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                int height = mMenuView.findViewById(R.id.pop_layout).getTop();
                int y = (int) event.getY();
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (y < height) {
                        dismiss();
                    }
                }
                return true;
            }
        });
    }
    void complete(){
        listener.onComplete(position,infoAdapter.getItem(position).toString());
    }
}
