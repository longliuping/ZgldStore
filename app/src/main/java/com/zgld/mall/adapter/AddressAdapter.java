package com.zgld.mall.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.HishopUserShippingAddresses;
import com.zgld.mall.beans.UserShippingAddresses;

/**
 * 地址
 */
public class AddressAdapter extends BaseAdapter {
	public interface AddressAdapterListener {
		void selectedChecked(int position);

		void updateAddress(int position);

		void deleteAddress(int position);
	}

	Context context;
	List<UserShippingAddresses> listInfo;
	LayoutInflater layoutInflater;
	AddressAdapterListener listener;

	public AddressAdapter(Context context, List<UserShippingAddresses> listInfo, AddressAdapterListener listener) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.listInfo = listInfo;
		layoutInflater = LayoutInflater.from(context);
		this.listener = listener;
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
		CheckBox item_car_checkbox;
		TextView name, address;
		ImageView item_delete, item_edit;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_address_manager, null);
			holder.item_car_checkbox = (CheckBox) convertView.findViewById(R.id.item_car_checkbox);
			holder.address = (TextView) convertView.findViewById(R.id.address);
			holder.name = (TextView) convertView.findViewById(R.id.name);
			holder.item_delete = (ImageView) convertView.findViewById(R.id.item_delete);
			holder.item_edit = (ImageView) convertView.findViewById(R.id.item_edit);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		UserShippingAddresses info = listInfo.get(position);
		if (info != null) {
			convertView.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					listener.selectedChecked(position);
				}
			});
			holder.name.setText("收货人:" + info.getShipTo() + "  ");
			holder.address.setText("收货地址:" + info.getAddress());
			holder.item_car_checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					if (isChecked) {
						listener.selectedChecked(position);
					}
				}
			});
			holder.item_delete.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					listener.deleteAddress(position);
				}
			});
			holder.item_edit.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					listener.updateAddress(position);
				}
			});
		}
		return convertView;
	}

}
