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
import com.zgld.mall.beans.Personal;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by LongLiuPing on 2016/3/20.
 */
public class PersonalDataAdapter extends BaseAdapter{
    Context context;
    List<Personal> listInfo;
    public PersonalDataAdapter(Context context,List<Personal> listInfo){
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
        TextView item_name,item_value;
        ImageView item_head;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView==null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_personal_data,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            vh.item_value = (TextView) convertView.findViewById(R.id.item_value);
            vh.item_head = (ImageView) convertView.findViewById(R.id.item_head);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        Personal info = listInfo.get(position);
        if(info!=null){
            vh.item_name.setText(info.getName());
            vh.item_head.setVisibility(View.GONE);
            vh.item_value.setVisibility(View.GONE);
            if(info.getType()==1)
            {
                vh.item_value.setVisibility(View.VISIBLE);
                vh.item_value.setText(info.getValue());
            }else if(info.getType()==2){
                vh.item_head.setVisibility(View.VISIBLE);
                SysApplication.DisplayUserImage(info.getValue(),vh.item_head);
            }
        }
        return convertView;
    }
}
