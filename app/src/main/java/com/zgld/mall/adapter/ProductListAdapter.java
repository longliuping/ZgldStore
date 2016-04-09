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
import com.zgld.mall.utils.PriceUtil;

public class ProductListAdapter extends BaseAdapter {
	List<Products> listInfo;
	LayoutInflater layoutInflater;

	public ProductListAdapter(Context context, List<Products> listInfo) {
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
		TextView item_original_price, item_love_num, item_title, item_discount_price, item_sales_volume,
				item_price_text;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_product, null);
			holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
			holder.item_original_price = (TextView) convertView.findViewById(R.id.item_original_price);
			holder.item_discount_price = (TextView) convertView.findViewById(R.id.item_discount_price);
			holder.item_love_num = (TextView) convertView.findViewById(R.id.item_love_num);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_sales_volume = (TextView) convertView.findViewById(R.id.item_sales_volume);
			holder.item_price_text = (TextView) convertView.findViewById(R.id.item_price_text);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Products info = listInfo.get(position);
		if (info != null) {
//			SysApplication.DisplayImage(info.getImageUrl1(), holder.item_image);
//			holder.item_title.setText(info.getProductName());
			String price = "";
			String text = "";
//			if ("2".equals(info.getProductPutawayType())) {
//				text = "特价:";
//				price = info.getSpecialPrice();
//			} else if ("3".equals(info.getProductPutawayType())) {
//				text = "预购价:";
//				price = info.getPurchasePrice();
//			} else {
//				text = "销售价:";
//				price = info.getSalePrice();
//			}
			holder.item_discount_price.setText(PriceUtil.priceY(price));
			holder.item_original_price.setText(PriceUtil.priceY(price));
			holder.item_price_text.setText(text);
//			holder.item_love_num.setText("" + info.getLikeCounts());
//			holder.item_sales_volume.setText(sales_volume + info.getSaleCounts());
		}
		return convertView;
	}

}
