package com.zgld.mall.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.beans.OrderItems;
import com.zgld.mall.beans.Orders;

public class ProductWaitEvaluationAdapter extends BaseExpandableListAdapter {
	public interface BuyersOrdersAdapterListener {
		/**
		 * 确认收货
		 * 
		 * @param groupPosition
		 * @param childPosition
		 */
		void confirmOrder(int groupPosition, int childPosition);

		/**
		 * 取消订单
		 * 
		 * @param groupPosition
		 * @param childPosition
		 */
		void cannerOrder(int groupPosition, int childPosition);

		/**
		 * 产品评论
		 * 
		 * @param groupPosition
		 * @param childPosition
		 */
		void commentProduct(int groupPosition, int childPosition);

		/**
		 * 申请退款
		 * 
		 * @param groupPosition
		 * @param childPosition
		 */
		void applyRefund(int groupPosition, int childPosition);

		/**
		 * 付款
		 * 
		 * @param groupPosition
		 * @param childPosition
		 */
		void payment(int groupPosition, int childPosition);
	}

	List<Orders> listInfo;
	LayoutInflater layoutInflater;
	Context context;

	public ProductWaitEvaluationAdapter(Context context, List<Orders> listInfo) {
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
		return listInfo.size();
	}

	/**
	 * 获取一级标签内容
	 */
	@Override
	public Object getGroup(int groupPosition) {
		return listInfo.get(groupPosition);
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
		return listInfo.get(groupPosition).getListOrderItems().size();
	}

	/**
	 * 获取一级标签下二级标签的内容
	 */
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// return listInfo.get(groupPosition).getProducts().get(childPosition);
		return listInfo.get(groupPosition).getListOrderItems().get(childPosition);
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
		TextView item_name;
		TextView item_status;
	}

	/**
	 * 对一级标签进行设置
	 */
	@Override
	public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		GroupViewHolder holder = null;
		if (convertView == null) {
			holder = new GroupViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_buyers_orderes_group, null);
			holder.item_name = (TextView) convertView.findViewById(R.id.item_name);
			holder.item_status = (TextView) convertView.findViewById(R.id.item_status);
			convertView.setTag(holder);
		} else {
			holder = (GroupViewHolder) convertView.getTag();
		}
		Orders info = listInfo.get(groupPosition);
		if (info != null) {
			holder.item_status.setText("");
		}
		return convertView;
	}

	class ChildViewHolder {
		ImageView item_image;
		TextView item_title, item_detail, item_price, item_market_price, item_number, item_postage, item_list_price,
				item_number_all;
		TextView item_confirm, item_cancel, item_refund, item_evaluation, item_pay;
		View item_base_bottom;
	}

	/**
	 * 对一级标签下的二级标签进行设置
	 */
	@Override
	public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		ChildViewHolder holder = null;
		if (convertView == null) {
			holder = new ChildViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_buyers_orders, null);
			holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_detail = (TextView) convertView.findViewById(R.id.item_detail);
			holder.item_price = (TextView) convertView.findViewById(R.id.item_price);
			holder.item_market_price = (TextView) convertView.findViewById(R.id.item_market_price);
			holder.item_number = (TextView) convertView.findViewById(R.id.item_number);
			// holder.item_send = convertView.findViewById(R.id.item_send);
			holder.item_postage = (TextView) convertView.findViewById(R.id.item_postage);
			holder.item_list_price = (TextView) convertView.findViewById(R.id.item_list_price);
			holder.item_number_all = (TextView) convertView.findViewById(R.id.item_number_all);
			holder.item_confirm = (TextView) convertView.findViewById(R.id.item_confirm);
			holder.item_cancel = (TextView) convertView.findViewById(R.id.item_cancel);
			holder.item_refund = (TextView) convertView.findViewById(R.id.item_refund);
			holder.item_evaluation = (TextView) convertView.findViewById(R.id.item_evaluation);
			holder.item_pay = (TextView) convertView.findViewById(R.id.item_pay);
			holder.item_base_bottom = convertView.findViewById(R.id.item_base_bottom);
			convertView.setTag(holder);
		} else {
			holder = (ChildViewHolder) convertView.getTag();
		}
		holder.item_confirm.setVisibility(View.GONE);
		holder.item_pay.setVisibility(View.GONE);
		holder.item_cancel.setVisibility(View.GONE);
		holder.item_refund.setVisibility(View.GONE);
		holder.item_evaluation.setVisibility(View.GONE);
		holder.item_base_bottom.setVisibility(View.GONE);
		final ChildViewHolder h = holder;
		final OrderItems item = listInfo.get(groupPosition).getListOrderItems().get(childPosition);
		final Orders info = listInfo.get(groupPosition);
		if (info != null) {
//			holder.item_postage.setText(PriceUtil.priceY(info.getAdjustedFreight()));
//			holder.item_title.setText(item.getItemDescription());
//			holder.item_detail.setText(item.getNorms());
//			holder.item_list_price.setText(info.getOrderTotal());
//			holder.item_number.setText("X" + item.getQuantity());
//			holder.item_number_all.setText(item.getQuantity());
//			holder.item_price.setText(PriceUtil.priceY(item.getItemAdjustedPrice()));
//			holder.item_market_price.setText(PriceUtil.priceY(item.getItemAdjustedPrice()));
//			SysApplication.DisplayImage(item.getThumbnailsUrl(), holder.item_image);
			holder.item_image.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
//					Intent intent = new Intent(context, ProductDetailActivity.class);
//					intent.putExtra("ProductId", item.getProductId());
//					context.startActivity(intent);
				}
			});
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
