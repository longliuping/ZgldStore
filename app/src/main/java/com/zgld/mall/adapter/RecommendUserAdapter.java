package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.beans.YRebateRelation;

import java.util.List;

/**
 * Created by Am on 2016/4/28.
 */
public class RecommendUserAdapter extends BaseAdapter {

    Context context;
    List<YRebateRelation> listInfo;
    LayoutInflater layoutInflater;

    public RecommendUserAdapter(Context context, List<YRebateRelation> listInfo) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.listInfo = listInfo;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listInfo.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return listInfo.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    class ViewHolder {
        TextView item_user_name, item_user_address;
        ImageView item_user_head;
        View item_line;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.item_recommetn_user, null);
            holder.item_user_name = (TextView) convertView.findViewById(R.id.item_user_name);
            holder.item_user_address = (TextView) convertView.findViewById(R.id.item_user_address);
            holder.item_user_head = (ImageView) convertView.findViewById(R.id.item_user_head);
            holder.item_line = convertView.findViewById(R.id.item_line);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        YRebateRelation info = listInfo.get(position);
        if (info != null) {
            holder.item_user_name.setText(info.getAccount().getAccountName());
            holder.item_user_address.setText(info.getAccount().getAccountPlace());
            SysApplication.DisplayUserImage(info.getAccount().getAccountHead(),holder.item_user_head);
        }
        if(listInfo.size()-1==position){
            holder.item_line.setVisibility(View.GONE);
        }
        return convertView;
    }

}
