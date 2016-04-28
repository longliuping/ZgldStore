package com.zgld.mall.pop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
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
    public PayTypePopupWindow(final Activity context,PayTypePopupWindowListener listener) {
        this.listener = listener;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mMenuView = inflater.inflate(R.layout.product_detail_param, null);

        listview = (ListView) mMenuView.findViewById(R.id.listview);
        infoAdapter = new PayTypeAdapter(context);
        listview.setAdapter(infoAdapter);
        close = mMenuView.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dismiss();
            }
        });
        ok = mMenuView.findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==null){
                    Toast.makeText(context,"请选择支付方式",Toast.LENGTH_LONG).show();
                }else {
                    complete();
                }
            }
        });
    }
    void complete(){
        listener.onComplete(position,infoAdapter.getItem(position).toString());
    }
}
