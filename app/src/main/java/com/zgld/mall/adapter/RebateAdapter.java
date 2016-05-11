package com.zgld.mall.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.OrdersRebate;
import com.zgld.mall.utils.PriceUtil;

import java.util.List;

/**
 * Created by Am on 2016/5/11.
 */
public class RebateAdapter extends BaseAdapter{
    Context context;
    List<OrdersRebate> listInfo;
    public RebateAdapter(Context context,List<OrdersRebate> listInfo){
        this.context = context;
        this.listInfo = listInfo;
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
        TextView item_datetime;
        TextView item_money;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView == null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_rebate,null);
            vh.item_datetime = (TextView) convertView.findViewById(R.id.item_datetime);
            vh.item_money = (TextView) convertView.findViewById(R.id.item_money);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        OrdersRebate info = listInfo.get(position);
        if(info!=null){
            vh.item_datetime.setText(info.getRebateDate());
            vh.item_money.setText(PriceUtil.price(info.getIncome()+""));
        }
        return convertView;
    }
}
