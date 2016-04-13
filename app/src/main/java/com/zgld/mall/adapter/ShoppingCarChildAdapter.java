package com.zgld.mall.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.activity.ProductDetailActivity;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.ShoppingCarts;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;

import java.util.List;

/**
 * Created by Am on 2016/4/13.
 */
public class ShoppingCarChildAdapter extends BaseAdapter{
    List<ShoppingCarts> listInfo;
    LayoutInflater layoutInflater;
    Context context;
    static int groupPosition;
    ShoppingCarExpandableListAdapter.ShoppingCarExpandableListAdapterListener listener;

    public ShoppingCarChildAdapter(int groupPosition,Context context, List<ShoppingCarts> listInfo,
                                            ShoppingCarExpandableListAdapter.ShoppingCarExpandableListAdapterListener listener) {
        // TODO Auto-generated constructor stub
        this.groupPosition = groupPosition;
        this.listInfo = listInfo;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.listener = listener;
    }
    @Override
    public int getCount() {
        return listInfo.get(groupPosition).getListProducts().size();
    }

    @Override
    public Object getItem(int position) {
        return listInfo.get(groupPosition).getListProducts().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int childPosition, View convertView, ViewGroup parent) {
        ChildViewHoldeer holder = null;
        if (convertView == null) {
            holder = new ChildViewHoldeer();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_shopping, null);
            holder.item_car_checkbox = (CheckBox) convertView.findViewById(R.id.item_car_checkbox);
            holder.item_delete = (ImageView) convertView.findViewById(R.id.item_delete);
            holder.d_reduce = (TextView) convertView.findViewById(R.id.d_reduce);
            holder.d_add = (TextView) convertView.findViewById(R.id.d_add);
            holder.d_result = (EditText) convertView.findViewById(R.id.d_result);
            holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
            holder.item_detail = (TextView) convertView.findViewById(R.id.item_detail);
            holder.item_price = (TextView) convertView.findViewById(R.id.item_price);
            holder.item_market_price = (TextView) convertView.findViewById(R.id.item_market_price);
            holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
            holder.item_line = convertView.findViewById(R.id.item_line);
            convertView.setTag(holder);
        } else {
            holder = (ChildViewHoldeer) convertView.getTag();
        }
        final ChildViewHoldeer h = holder;
        holder.item_line.setVisibility(View.VISIBLE);
        if (listInfo.get(groupPosition).getListProducts().size()-1 == childPosition) {
            holder.item_line.setVisibility(View.GONE);
        }
        final Products info = listInfo.get(groupPosition).getListProducts().get(childPosition);
        if (info != null) {
            holder.item_title.setText(info.getProductName());
            if(info.getSku()!=null) {
                holder.item_price.setText(PriceUtil.priceY(info.getSku().getPrice() + ""));
            }
            holder.item_market_price.setText(PriceUtil.priceY(info.getMarketPrice()+""));
            holder.d_result.setText(listInfo.get(groupPosition).getQuantity() + "");
            SysApplication.DisplayImage(info.getThumbnailsUrl(), holder.item_image);
            final int number = Integer.parseInt(holder.d_result.getText().toString());
            holder.item_car_checkbox.setChecked(info.isChecked());
            holder.item_detail.setText(info.getShortDescription());
            holder.item_image.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(context, ProductDetailActivity.class);
                    intent.putExtra(Contents.PRODUCTID, info.getProductId());
                    context.startActivity(intent);
                }
            });
            holder.d_add.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    int n = number + 1;
                    listInfo.get(groupPosition).setQuantity(n);
                    h.d_result.setText(n + "");
//                    listener.addNumber(groupPosition, childPosition, n);
                }
            });
            holder.d_reduce.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if (number > 1) {
                        int n = number - 1;
                        listInfo.get(groupPosition).setQuantity(n);
                        h.d_result.setText(n + "");
//                        listener.reduceNumber(groupPosition, childPosition, n);
                    }
                }
            });
            holder.item_delete.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    listener.deleteProduct(groupPosition, childPosition);
                }
            });

            final ChildViewHoldeer finalHolder = holder;
            holder.item_car_checkbox.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    info.setChecked(finalHolder.item_car_checkbox.isChecked());
//                    listener.childViewOnCheckedChangeListener(groupPosition, childPosition,
//                            h.item_car_checkbox.isChecked());
                }
            });
        }
        return convertView;
    }
    class ChildViewHoldeer {
        CheckBox item_car_checkbox;
        ImageView item_delete, item_image;
        TextView d_reduce, d_add;
        EditText d_result;
        TextView item_title, item_detail, item_price, item_market_price;
        View item_line;
    }
}
