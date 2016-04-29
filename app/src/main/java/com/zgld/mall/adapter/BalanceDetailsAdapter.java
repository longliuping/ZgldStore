package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.BalanceDetails;
import com.zgld.mall.utils.PriceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Am on 2016/4/29.
 */
public class BalanceDetailsAdapter extends BaseAdapter {
    List<BalanceDetails> listInfo = new ArrayList<>();
    Context context;
    public BalanceDetailsAdapter(Context context,List<BalanceDetails> listInfo){
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
        TextView item_datetime,item_money,item_status;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView==null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_balance_details,null);
            vh.item_datetime = (TextView) convertView.findViewById(R.id.item_datetime);
            vh.item_money = (TextView) convertView.findViewById(R.id.item_money);
            vh.item_status = (TextView) convertView.findViewById(R.id.item_status);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        BalanceDetails info = listInfo.get(position);
        if(info!=null){
            vh.item_datetime.setText(info.getTradeDate());
            vh.item_money.setText(PriceUtil.priceY(info.getBalance() + ""));
            String status = "";
            if (info.getPayTradeNo()!=null && info.getPayTradeNo().length()>1)
            {
                status = "成功";
            }else{
                status = "失败";
            }
            vh.item_status.setText(status);
        }
        return convertView;
    }
}
