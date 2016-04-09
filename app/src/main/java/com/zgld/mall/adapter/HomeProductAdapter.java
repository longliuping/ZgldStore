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
import com.zgld.mall.beans.Products;
import com.zgld.mall.utils.PriceUtil;

import java.util.List;

/**
 * 首页的产品
 * Created by LongLiuPing on 2016/3/21.
 */
public class HomeProductAdapter extends BaseAdapter{
    Context context;
    List<Products> listInfo;
    public HomeProductAdapter(Context context,List<Products> listInfo){
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
        TextView item_name,item_sale_price;
        ImageView item_image;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            vh = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home_product,null);
            vh.item_name = (TextView) convertView.findViewById(R.id.item_name);
            vh.item_image = (ImageView) convertView.findViewById(R.id.item_image);
            vh.item_sale_price = (TextView) convertView.findViewById(R.id.item_sale_price);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        Products info = listInfo.get(position);
        if(info!=null){
            vh.item_name.setText(info.getProductName());
//            if(info.getHishopSkus()!=null) {
                vh.item_sale_price.setVisibility(View.VISIBLE);
                vh.item_sale_price.setText(PriceUtil.priceY(info.getSalePrice() + ""));
//            }else{
//                vh.item_sale_price.setVisibility(View.GONE);
//            }
            SysApplication.DisplayImage(info.getThumbnailsUrl(), vh.item_image);
        }
        return convertView;
    }
}
