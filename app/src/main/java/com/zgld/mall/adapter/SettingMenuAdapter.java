package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.SettingMenu;
import com.zgld.mall.utils.Contents;

import java.util.List;

/**
 * Created by LongLiuPing on 2016/3/21.
 */
public class SettingMenuAdapter extends BaseAdapter{
    Context context;
    List<SettingMenu> listInfo;
    public SettingMenuAdapter(Context context,List<SettingMenu> listInfo){
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
        TextView item_name;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView == null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_setting_menu,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        SettingMenu info = listInfo.get(position);
        if(info!=null){
            vh.item_name.setText(info.getName());
        }
        return convertView;
    }
}
