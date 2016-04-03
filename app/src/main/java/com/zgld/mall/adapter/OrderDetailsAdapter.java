package com.zgld.mall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.HishopOrderItems;
import com.zgld.mall.beans.HishopOrders;

public class OrderDetailsAdapter extends BaseExpandableListAdapter {

	HishopOrders listInfo;
	LayoutInflater layoutInflater;
	Context context;

	public OrderDetailsAdapter(Context context, HishopOrders listInfo) {
		// TODO Auto-generated constructor stub
		this.listInfo = listInfo;
		layoutInflater = LayoutInflater.from(context);
		this.context = context;
	}

	/**
	 * 获取一级标签总数
	 */
	@Override
	public int getGroupCount() {
		return listInfo.getListHishopOrderItems().size();
	}

	/**
	 * 获取一级标签内容
	 */
	@Override
	public Object getGroup(int groupPosition) {
		return listInfo;
	}

	/**
	 * 获取一级标签的ID
	 */
	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	/**
	 * 获取一级标签下二级标签的总数
	 */
	@Override
	public int getChildrenCount(int groupPosition) {
		// return listInfo.get(groupPosition).getProducts().size();
		return listInfo.getListHishopOrderItems().size();
	}

	/**
	 * 获取一级标签下二级标签的内容
	 */
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// return listInfo.get(groupPosition).getProducts().get(childPosition);
		return listInfo.getListHishopOrderItems().get(childPosition);
	}

	/**
	 * 获取二级标签的ID
	 */
	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	/**
	 * 指定位置相应的组视图
	 */
	@Override
	public boolean hasStableIds() {
		return true;
	}

	class GroupViewHolder {
		TextView item_car_manufactor_name;
	}

	/**
	 * 对一级标签进行设置
	 */
	@Override
	public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		GroupViewHolder holder = null;
		if (convertView == null) {
			holder = new GroupViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_order_details_group, null);
			holder.item_car_manufactor_name = (TextView) convertView.findViewById(R.id.item_car_manufactor_name);
			convertView.setTag(holder);
		} else {
			holder = (GroupViewHolder) convertView.getTag();
		}
		HishopOrderItems info = listInfo.getListHishopOrderItems().get(0);
//		if (info != null) {
//			holder.item_car_manufactor_name.setText(info.getUsername() + ">");
//		}
		return convertView;
	}

	class ChildViewHoldeer {
		ImageView item_image;
		TextView item_title, item_detail, item_price, item_market_price, item_number;
		TextView item_number_base, item_postage_base;
		View bottom, item_pre_base, tem_price_base;
		TextView item_cdk_no, item_create_datetime;
		TextView item_list_price, item_start_price, item_end_price;
	}

	/**
	 * 对一级标签下的二级标签进行设置
	 */
	@Override
	public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		ChildViewHoldeer holder = null;
		if (convertView == null) {
			holder = new ChildViewHoldeer();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_order_details_order, null);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_detail = (TextView) convertView.findViewById(R.id.item_detail);
			holder.item_price = (TextView) convertView.findViewById(R.id.item_price);
			holder.item_market_price = (TextView) convertView.findViewById(R.id.item_market_price);
			holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
			holder.item_number = (TextView) convertView.findViewById(R.id.item_number);
			holder.item_number_base = (TextView) convertView.findViewById(R.id.item_number_base);
			holder.item_postage_base = (TextView) convertView.findViewById(R.id.item_postage_base);
			holder.bottom = convertView.findViewById(R.id.bottom);
			holder.item_cdk_no = (TextView) convertView.findViewById(R.id.item_cdk_no);
			holder.item_create_datetime = (TextView) convertView.findViewById(R.id.item_create_datetime);
			holder.item_pre_base = convertView.findViewById(R.id.item_pre_base);
			holder.tem_price_base = convertView.findViewById(R.id.tem_price_base);
			holder.item_list_price = (TextView) convertView.findViewById(R.id.item_list_price);
			holder.item_start_price = (TextView) convertView.findViewById(R.id.item_start_price);
			holder.item_end_price = (TextView) convertView.findViewById(R.id.item_end_price);
			convertView.setTag(holder);
		} else {
			holder = (ChildViewHoldeer) convertView.getTag();
		}
		holder.bottom.setVisibility(View.GONE);
		final HishopOrderItems info = listInfo.getListHishopOrderItems().get(childPosition);
		if (info != null) {
			holder.item_title.setText("");
//			if (info.getNorms() != null) {
//				holder.item_detail.setText(String.valueOf(info.getNorms().trim()));
//			}
//			holder.item_number.setText("X" + info.getQuantity());
//			holder.item_detail.setText("" + info.getNorms());
//			SysApplication.DisplayImage(info.getThumbnailsUrl(), holder.item_image);
//			holder.item_price.setText("" + PriceUtil.priceY(info.getSalePrice()));
//			holder.item_market_price.setText("" + PriceUtil.priceY(info.getSalePrice()));
//			if (isLastChild) {
//				holder.bottom.setVisibility(View.VISIBLE);
//				holder.item_cdk_no.setText("穿戴客订单号:" + listInfo.getOrders().get(groupPosition).getOrderId());
//				holder.item_create_datetime.setText("成交时间:" + info.getDeliveryDay());
//				holder.item_postage_base.setText(PriceUtil.priceY(listInfo.getOrders().get(groupPosition)
//						.getAdjustedFreight()));
//
//				if (!TextUtils.isEmpty(info.getRemaining())) {
//					holder.item_pre_base.setVisibility(View.VISIBLE);
//					holder.item_start_price.setText(PriceUtil.priceY(info.getAdvancePrice()));
//					holder.item_end_price.setText(PriceUtil.priceY(info.getRemaining()));
//					holder.tem_price_base.setVisibility(View.GONE);
//				} else {
//					holder.item_list_price.setText(PriceUtil.priceY(info.getItemAdjustedPrice()));
//					holder.item_pre_base.setVisibility(View.GONE);
//					holder.tem_price_base.setVisibility(View.VISIBLE);
//				}
//				// 就按共几件商品
//				int itemQuantityCount = 0;
//				for (OrderItems itemQuantity : listInfo.getOrderItems()) {
//					itemQuantityCount += Integer.parseInt(itemQuantity.getQuantity());
//				}
//				holder.item_number_base.setText("" + itemQuantityCount);
//			}
		}
		return convertView;
	}

	/**
	 * 当选择子节点的时候，调用该方法
	 */
	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

}
