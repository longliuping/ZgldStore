package com.zgld.mall.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.ProductParam;

/*
 * 产品参数页-产品参数适配器
 */
public class ProductParamAdapter extends BaseAdapter {
	Context context;
	List<ProductParam> list;
	LayoutInflater layoutInflater;

	public ProductParamAdapter(Context context, List<ProductParam> list) {
		super();
		this.context = context;
		this.list = list;
		layoutInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_product_detail_param, null);
			viewHolder.key = (TextView) convertView.findViewById(R.id.tv_key);
			viewHolder.value = (TextView) convertView.findViewById(R.id.tv_value);
			convertView.setTag(viewHolder);

		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		ProductParam param = list.get(position);
		viewHolder.key.setText(param.getAttributeName().toString());
		viewHolder.value.setText(param.getValueStr().toString());

		return convertView;
	}

	class ViewHolder {
		TextView key;
		TextView value;
	}

}
