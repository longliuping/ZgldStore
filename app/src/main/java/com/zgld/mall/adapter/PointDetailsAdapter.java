package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.BalanceFreezeDetails;
import com.zgld.mall.beans.PointDetails;
import com.zgld.mall.utils.PriceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Am on 2016/4/15.
 */
public class PointDetailsAdapter extends BaseAdapter {
    List<PointDetails> listInfo = new ArrayList<>();
    Context context;
    public PointDetailsAdapter(Context context, List<PointDetails> listInfo){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_point_details,null);
            vh.item_datetime = (TextView) convertView.findViewById(R.id.item_datetime);
            vh.item_money = (TextView) convertView.findViewById(R.id.item_money);
            vh.item_status = (TextView) convertView.findViewById(R.id.item_status);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        PointDetails info = listInfo.get(position);
        if(info!=null){
            vh.item_datetime.setText(info.getTradeDate());
            vh.item_money.setText(PriceUtil.priceY(info.getPoints() + ""));
            String status = "";
            if(info.getIncreased()!=null && info.getIncreased()>0){
                status = "+";
            }
            if(info.getReduced()!=null && info.getReduced()>0){
                status = "-";
            }
            vh.item_status.setText(status);
        }
        return convertView;
    }
}
