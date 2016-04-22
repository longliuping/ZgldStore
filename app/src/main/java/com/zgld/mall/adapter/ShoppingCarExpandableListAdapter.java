package com.zgld.mall.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.activity.ProductDetailActivity;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.ShoppingCarts;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;

import java.util.List;

public class ShoppingCarExpandableListAdapter extends BaseAdapter {
	public interface ShoppingCarExpandableListAdapterListener {
		/**
		 * 产品选中状态改变
		 *
		 * @param groupPosition
		 * @param childPosition
		 * @param isChecked
		 */
		void childViewOnCheckedChangeListener(int groupPosition, int childPosition, boolean isChecked);

		/**
		 * 分组选中状态改变
		 *
		 * @param groupPosition
		 * @param isChecked
		 */
		void groupViewOnCheckedChangeListener(int groupPosition, boolean isChecked);

		/**
		 * 绘制完成
		 */
		void viewDrawComplete();

		/**
		 * 删除产品
		 *
		 * @param groupPosition
		 * @param childPosition
		 */
		void deleteProduct(int groupPosition, int childPosition);

		/**
		 * 喜欢产品
		 *
		 * @param groupPosition
		 * @param childPosition
		 */
		void loveProduct(int groupPosition, int childPosition);

		/**
		 * 购买产品数量减少
		 *
		 * @param groupPosition
		 * @param childPosition
		 * @param newNumber
		 */
		void reduceNumber(int groupPosition, int childPosition, int newNumber);

		/**
		 * 购买产品数量增加
		 *
		 * @param groupPosition
		 * @param childPosition
		 * @param newNumber
		 */
		void addNumber(int groupPosition, int childPosition, int newNumber);

	}

	List<ShoppingCarts> listInfo;
	LayoutInflater layoutInflater;
	Context context;
	ShoppingCarExpandableListAdapterListener listener;

	public ShoppingCarExpandableListAdapter(Context context, List<ShoppingCarts> listInfo,
											ShoppingCarExpandableListAdapterListener listener) {
		// TODO Auto-generated constructor stub
		this.listInfo = listInfo;
		layoutInflater = LayoutInflater.from(context);
		this.context = context;
		this.listener = listener;
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
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		GroupViewHolder holder = null;
		if (convertView == null) {
			holder = new GroupViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_shopping_group, null);
			holder.item_car_manufactor_name = (TextView) convertView.findViewById(R.id.item_car_manufactor_name);
			holder.item_listview = (ListView) convertView.findViewById(R.id.item_listview);
			convertView.setTag(holder);
		} else {
			holder = (GroupViewHolder) convertView.getTag();
		}
		ShoppingCarts info = listInfo.get(position);
		if (info != null) {
			if(info.getyShop()!=null) {
				holder.item_car_manufactor_name.setText(info.getyShop().getShopName());
			}
			holder.item_listview.setAdapter(new ShoppingCarChildAdapter(position,context,listInfo,listener));
		}
		return convertView;
	}

	class GroupViewHolder {
		TextView item_car_manufactor_name;
		ListView item_listview;
	}
}
