package com.zgld.mall.adapter;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.Sku;

public class SelectedInfoAdapter extends BaseAdapter {
	public interface SelectedInfoAdapterCallback{
		void onItemClick(Sku info, int position);
	}
	Context context;
	List<Sku> listInfo;
	LayoutInflater layoutInflater;
	SelectedInfoAdapterCallback callback;
	public SelectedInfoAdapter(Context context, List<Sku> listInfo,SelectedInfoAdapterCallback callback) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.listInfo = listInfo;
		layoutInflater = LayoutInflater.from(context);
		this.callback = callback;
	}
	public List<Sku>  getListInfo(){
		return listInfo;
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
		TextView title;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_selectedinfo, null);
			holder.title = (TextView) convertView.findViewById(R.id.title);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.title.setTextAppearance(context, R.style.item_text_default);
		convertView.setBackgroundResource(R.drawable.item_text_default_shape);
//		final HishopAttributeValues info = listInfo.get(position);
//		if (info != null) {
//			if (info.isSelected()) {
//				holder.title.setTextAppearance(context, R.style.item_text_selected);
//				convertView.setBackgroundResource(R.drawable.item_text_selected_shape);
//			}
//			holder.title.setText(info.getValueStr());
//			convertView.setOnClickListener(new View.OnClickListener() {
//				@Override
//				public void onClick(View v) {
//					for (int i =0;i<listInfo.size();i++){
//						listInfo.get(i).setSelected(false);
//					}
//					info.setSelected(true);
//					SelectedInfoAdapter.this.notifyDataSetChanged();
//					callback.onItemClick(info,position);
//				}
//			});
//		}
		return convertView;
	}

}
