package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.Sku;
import com.zgld.mall.beans.Skugroup;

import java.util.List;

public class SelectedBaseInfoAdapter extends BaseAdapter {
	Context context;
	List<Skugroup> listInfo;
	LayoutInflater layoutInflater;
	SelectedInfoAdapter.SelectedInfoAdapterCallback callback;
	public SelectedBaseInfoAdapter(Context context, List<Skugroup> listInfo,SelectedInfoAdapter.SelectedInfoAdapterCallback callback) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.listInfo = listInfo;
		layoutInflater = LayoutInflater.from(context);
		this.callback = callback;
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
		TextView item_name;
		GridView item_gridview;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_selected_base_info, null);
			holder.item_name = (TextView) convertView.findViewById(R.id.item_name);
			holder.item_gridview = (GridView) convertView.findViewById(R.id.item_gridview);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Skugroup info = listInfo.get(position);
		if (info != null) {
			holder.item_name.setText(info.getSkugroupName());
			holder.item_gridview.setAdapter(new SelectedInfoAdapter(context,info.getListSkus(),callback));
		}
		return convertView;
	}

}
