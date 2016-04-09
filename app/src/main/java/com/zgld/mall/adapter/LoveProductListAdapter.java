package com.zgld.mall.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.Products;

public class LoveProductListAdapter extends BaseAdapter {
	List<Products> listInfo;
	LayoutInflater layoutInflater;

	public LoveProductListAdapter(Context context, List<Products> listInfo) {
		// TODO Auto-generated constructor stub
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
		ImageView item_image;
		TextView item_love_num, item_title, item_sales_volume;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_product_detail_love, null);
			holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
			holder.item_love_num = (TextView) convertView.findViewById(R.id.item_love_num);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_sales_volume = (TextView) convertView.findViewById(R.id.item_sales_volume);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Products info = listInfo.get(position);
		if (info != null) {
			// imageLoader.DisplayImage(info.getImageUrl1(), holder.item_image,
			// false);
//			SysApplicationlication.DisplayImage(info.getImageUrl1(), holder.item_image);
//			holder.item_title.setText(info.getProductName());
//			holder.item_love_num.setText(info.getLikeCounts());
//			holder.item_sales_volume.setText(PriceUtil.priceY(info.getMarketPrice()));
		}
		return convertView;
	}

}
