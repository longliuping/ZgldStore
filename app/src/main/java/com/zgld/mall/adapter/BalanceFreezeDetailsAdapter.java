package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.BalanceFreezeDetails;
import com.zgld.mall.beans.InpourRequest;
import com.zgld.mall.utils.PriceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Am on 2016/4/15.
 */
public class BalanceFreezeDetailsAdapter extends BaseAdapter {
    List<BalanceFreezeDetails> listInfo = new ArrayList<>();
    Context context;
    public BalanceFreezeDetailsAdapter(Context context, List<BalanceFreezeDetails> listInfo){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_balance_freeze_details,null);
            vh.item_datetime = (TextView) convertView.findViewById(R.id.item_datetime);
            vh.item_money = (TextView) convertView.findViewById(R.id.item_money);
            vh.item_status = (TextView) convertView.findViewById(R.id.item_status);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        BalanceFreezeDetails info = listInfo.get(position);
        if(info!=null){
            vh.item_datetime.setText(info.getFreezeTime());
            vh.item_money.setText(PriceUtil.priceY(info.getAmount() + ""));
//            String status = "";
//            switch (info.getRequestStatus())
//            {
//                case 1:
//                    status = "已通过";
//                    break;
//                default:
//                    status = "审核中";
//                    break;
//            }
//            vh.item_status.setText(status);
        }
        return convertView;
    }
}
