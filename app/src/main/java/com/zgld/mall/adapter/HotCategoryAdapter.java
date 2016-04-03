package com.zgld.mall.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.beans.HotCategory;

import java.util.List;

/**
 * 热门标签
 * Created by Administrator on 2016/3/23.
 */
public class HotCategoryAdapter extends BaseAdapter{
    Context context;
    List<HotCategory> listInfo = null;
    public HotCategoryAdapter(Context context,List<HotCategory> listInfo){
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
        ImageView item_image;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView==null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_hot_category,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            vh.item_image = (ImageView) convertView.findViewById(R.id.item_image);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        HotCategory info = listInfo.get(position);
        if(info!=null){
            vh.item_name.setText(info.getHotname());

            if(info.getHotimg()!=null && !info.getHotimg().isEmpty()) {
                SysApplication.DisplayImage(info.getHotimg(), vh.item_image);
            }
//            if(info.getHotid()!=null && info.getHotid()>0){
//                vh.item_image.setImageResource(info.getResId());
//            }
        }
        return convertView;
    }
}
