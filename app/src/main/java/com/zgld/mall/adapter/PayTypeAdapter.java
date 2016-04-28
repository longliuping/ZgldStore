package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Am on 2016/4/28.
 */
public class PayTypeAdapter  extends BaseAdapter{
    List<String> listInfo = new ArrayList<>();
    Context context;
    public PayTypeAdapter(Context context){
        this.context = context;
        listInfo.add("支付宝");
        listInfo.add("线下支付");
    }
    @Override
    public int getCount() {
        return listInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return listInfo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class ViewHolder{
        TextView item_name;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView == null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_pay_type,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.item_name.setText(listInfo.get(position)+"");
        return convertView;
    }
}
