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
import com.zgld.mall.beans.ProductComment;

public class ProductCommentAdapter extends BaseAdapter {
	List<ProductComment> listInfo;
	Context context;
	LayoutInflater layoutInflater;

	public ProductCommentAdapter(Context context, List<ProductComment> listInfo) {
		// TODO Auto-generated constructor stub
		this.context = context;
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
		ImageView item_head;
		TextView item_name, item_comment, item_date;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_project_detail_comment, null);
			holder.item_head = (ImageView) convertView.findViewById(R.id.item_head);
			holder.item_name = (TextView) convertView.findViewById(R.id.item_name);
			holder.item_comment = (TextView) convertView.findViewById(R.id.item_comment);
			holder.item_date = (TextView) convertView.findViewById(R.id.item_date);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		return convertView;
	}

}
