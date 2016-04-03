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
import com.zgld.mall.beans.SupperArea;
import com.zgld.mall.beans.SupperHot;
import com.zgld.mall.beans.Supplier;

import java.util.List;

/**
 * Created by Administrator on 2016/3/24.
 */
public class HotSupplierAdapter extends BaseAdapter{
    List<Supplier> listInfo;
    Context context;
    public HotSupplierAdapter(Context context,List<Supplier> listInfo){
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
        TextView item_name,item_detail;
        ImageView item_image;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView==null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_hot_supplier,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            vh.item_detail = (TextView) convertView.findViewById(R.id.item_detail);
            vh.item_image = (ImageView) convertView.findViewById(R.id.item_image);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        Supplier info = listInfo.get(position);
        if(info!=null){
            vh.item_name.setText(info.getSupplierName());
            vh.item_detail.setText(info.getSupplierDescribe());
            SysApplication.DisplayImage(info.getSupplierLogoUrl(),vh.item_image);
        }
        return convertView;
    }
}
