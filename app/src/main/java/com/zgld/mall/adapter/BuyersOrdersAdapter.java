package com.zgld.mall.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.activity.OrderDetailsActivity;
import com.zgld.mall.activity.ProductDetailActivity;
import com.zgld.mall.alipay.OrderPay;
import com.zgld.mall.beans.GsonObject;
import com.zgld.mall.beans.OrderItems;
import com.zgld.mall.beans.Orders;
import com.zgld.mall.beans.YAccount;
import com.zgld.mall.pop.PayTypePopupWindow;
import com.zgld.mall.pop.PublishSelectPicPopupWindow;
import com.zgld.mall.sync.OrderAsync;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.dialog.CustomDialog;
import com.zgld.mall.utils.PriceUtil;

import org.json.JSONObject;

public class BuyersOrdersAdapter extends BaseExpandableListAdapter {
public interface BuyersOrdersAdapterListener{
	public void update(int tag,final int groupPosition, final int childPosition,Bundle bundle);
}

	List<Orders> listInfo;
	LayoutInflater layoutInflater;
	Context context;
	CustomDialog dialog;
	boolean display = false;// 处理完成后，是否显示当前item
	BuyersOrdersAdapterListener listener;
	Activity activity;
	public BuyersOrdersAdapter(Activity activity,Context context, List<Orders> listInfo,BuyersOrdersAdapterListener listener) {
		this.listInfo = listInfo;
		this.layoutInflater = LayoutInflater.from(context);
		this.context = context;
		this.listener = listener;
		this.activity = activity;
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
			convertView.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent(context, OrderDetailsActivity.class);
					Bundle bundle = new Bundle();
					bundle.putSerializable(Contents.INFO,listInfo.get(groupPosition));
					intent.putExtras(bundle);
					context.startActivity(intent);
				}
			});
			holder.item_name.setText("订单号：" + info.getOrderId() + "  时间：" + info.getOrderDate());
			String str = "";
			switch (info.getPaymentStatus()) {
			case 1:
				str = "待使用";
				break;
			case 0:
				str = "待付款";
				break;
			}
			switch (listInfo.get(groupPosition).getRefundStatus()){
				case 1:
					str += "(已申请退款)";
					break;
				case 2:
					str += "(已退款)";
					break;
			}
			holder.item_status.setText(str);
		}
		return convertView;
	}

	class ChildViewHolder {
		ImageView item_image;
		TextView item_title, item_detail, item_price, item_number, item_postage, item_list_price,
				item_number_all;
		TextView item_confirm, item_cancel, item_refund, item_evaluation, item_pay,item_view_logistics;
		View item_base_bottom, tem_price_base;
		TextView item_date;
		View top;
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
			holder.item_date = (TextView) convertView.findViewById(R.id.item_date);
			holder.tem_price_base = convertView.findViewById(R.id.tem_price_base);
			holder.item_view_logistics = (TextView) convertView.findViewById(R.id.item_view_logistics);
			holder.top = convertView.findViewById(R.id.top);
			convertView.setTag(holder);
		} else {
			holder = (ChildViewHolder) convertView.getTag();
		}
		final OrderItems info = listInfo.get(groupPosition).getListOrderItems().get(childPosition);
		holder.item_base_bottom.setVisibility(View.GONE);
		holder.item_pay.setVisibility(View.GONE);
		holder.item_cancel.setVisibility(View.GONE);
		holder.item_refund.setVisibility(View.GONE);
		holder.item_view_logistics.setVisibility(View.GONE);
		if(info!=null){
			holder.top.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(context, ProductDetailActivity.class);
					intent.putExtra(Contents.PRODUCTID, info.getProductId());
					context.startActivity(intent);
				}
			});
			convertView.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(context, OrderDetailsActivity.class);
					Bundle bundle = new Bundle();
					bundle.putSerializable(Contents.INFO,listInfo.get(groupPosition));
					intent.putExtras(bundle);
					context.startActivity(intent);
				}
			});
			SysApplication.DisplayImage(info.getProducts().getThumbnailsUrl(),holder.item_image);
			holder.item_title.setText(info.getProducts().getProductName());
			holder.item_detail.setText(info.getProducts().getShortDescription());
			holder.item_price.setText(PriceUtil.priceY(info.getListPrice() + ""));
			holder.item_number.setText("X"+info.getQuantity());
			if(isLastChild){
				holder.item_base_bottom.setVisibility(View.VISIBLE);
				int num = 0;
				for (int i =0;i<listInfo.get(groupPosition).getListOrderItems().size();i++){
					OrderItems item = listInfo.get(groupPosition).getListOrderItems().get(i);
					num+=item.getQuantity();
				}
				holder.item_number_all.setText(num+"");
				holder.item_postage.setText(PriceUtil.priceY(listInfo.get(groupPosition).getFreight()+""));
				holder.item_list_price.setText(PriceUtil.priceY(listInfo.get(groupPosition).getOrderTotalPrice()+""));
				final View v = convertView;
				switch (listInfo.get(groupPosition).getPaymentStatus()) {
					case 0:
						holder.item_pay.setVisibility(View.VISIBLE);
						holder.item_pay.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								payOrder(v, groupPosition, childPosition);
							}
						});
						holder.item_cancel.setVisibility(View.VISIBLE);
						holder.item_cancel.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								cancelOrder(groupPosition,childPosition);
							}
						});
						break;
					case 1:
						holder.item_pay.setVisibility(View.GONE);
						holder.item_cancel.setVisibility(View.GONE);
						switch (listInfo.get(groupPosition).getRefundStatus()){
							case 0:
								holder.item_refund.setVisibility(View.VISIBLE);
								holder.item_refund.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View v) {
										applyRefund(groupPosition,childPosition);
									}
								});
								break;
						}
						break;
				}
				switch (listInfo.get(groupPosition).getRefundStatus()){
					case 0:

						break;
					case 1:

						break;
				}
			}
		}
		return convertView;
	}

	/**
	 * 确认收货
	 * 
	 * @param groupPosition
	 * @param childPosition
	 */
	public void confirmOrder(final int groupPosition, final int childPosition) {
//		String url = "Orders/OrderStatusUpdate?orderId=" + listInfo.get(groupPosition).getOrderId()
//				+ "&orderStatus=5&token" + Contents.getUser(context).getToken() + "&userId="
//				+ Contents.getUser(context).getUserId() + "";
//		new OrderAsync(context, Method.GET, 307, url, null, null, 1, new OrderAsyncListener() {
//
//			@Override
//			public void complete(int tag, String json) {
//				if (tag == 307 && json.trim().equals("1")) {
//					Toast.makeText(context, context.getString(R.string.confirm_sign_success), Toast.LENGTH_SHORT)
//							.show();
//					listInfo.get(groupPosition).setOrderStatus(5);
//					if (!display) {
//						listInfo.remove(groupPosition);
//					}
//					notifyDataSetChangedAdapter();
//				} else {
//					Toast.makeText(context, context.getString(R.string.confirm_sign_failed), Toast.LENGTH_SHORT).show();
//				}
//			}
//		});
	}

	/**
	 * 申请退款
	 * @param groupPosition
	 * @param childPosition
	 */
	public void applyRefund(final int groupPosition, final int childPosition) {
		Map<String,String> m = new HashMap<>();
		m.put("orderid",listInfo.get(groupPosition).getOrderId()+"");
		new OrderAsync(context, Request.Method.POST, 306, "order/user_order_apply_refound.html", m, null, 1, new OrderAsync.OrderAsyncListener() {

			@Override
			public void complete(Message msg) {
				try
				{
					GsonObject gsonObject = (GsonObject)msg.getData().getSerializable(Contents.GSON_OBJECT);
					if (gsonObject.getTag() == 306 && gsonObject.getStatus()==200) {
						listInfo.get(groupPosition).setRefundStatus(1);
						listener.update(108,groupPosition,childPosition,null);
					}
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 支付订单
	 * @param groupPosition
	 * @param childPosition    
	 */
	PayTypePopupWindow menuWindow;
	public void payOrder(View view,final int groupPosition, final int childPosition) {
		final Orders orderInfo = listInfo.get(groupPosition);

		final WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
		lp.alpha = 0.5F; // 0.0-1.0
		activity.getWindow().setAttributes(lp);
		// 实例化SelectPicPopupWindow
		menuWindow = new PayTypePopupWindow(activity, new PayTypePopupWindow.PayTypePopupWindowListener() {
			@Override
			public void onComplete(Integer position, String str) {
				switch (position){
					case 0:
						new OrderPay().pay(orderInfo.getOrderId(), context, new OrderPay.OrderPayListener() {
							@Override
							public void onCompelete(Message msg) {
								listener.update(2,groupPosition,childPosition, null);
							}
						});
						break;
					case 1:
						Map m = new HashMap<>();
						m.put("orderid",orderInfo.getOrderId()+"");
						new OrderAsync(context, Request.Method.POST, 202, "supplier/order_offinle_alipay.html", m, null, 1, new OrderAsync.OrderAsyncListener() {
							@Override
							public void complete(Message msg) {

							}
						});
						break;
				}
			}
		});
		// 显示窗口
		menuWindow.showAtLocation(view,
				Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
		menuWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

			@Override
			public void onDismiss() {
				// TODO Auto-generated com.android.volley.Request.Method
				// stub
				lp.alpha = 1.0F; // 0.0-1.0
				activity.getWindow().setAttributes(lp);
			}
		});
	}
	/**
	 * 取消订单
	 * @param groupPosition
	 * @param childPosition
	 */
	public void cancelOrder(final int groupPosition, final int childPosition) {
		dialog = new CustomDialog(context, R.style.mystyle, R.layout.customdialog, R.array.title_cancel_order,
				new CustomDialog.CustomDialogListener() {

					@Override
					public void customDialogClickRight() {
						dialog.dismiss();
						Map<String,String> m = new HashMap<>();
							m.put("orderid",listInfo.get(groupPosition).getOrderId()+"");
							new OrderAsync(context, Request.Method.POST, 306, "order/user_delete_order.html", m, null, 1, new OrderAsync.OrderAsyncListener() {

								@Override
								public void complete(Message msg) {
								try
								{
									GsonObject gsonObject = (GsonObject)msg.getData().getSerializable(Contents.GSON_OBJECT);
									if (gsonObject.getTag() == 306 && gsonObject.getStatus()==200) {
										listener.update(109,groupPosition,childPosition,null);
									}
								}catch (Exception e){
									e.printStackTrace();
								}
								}
							});
					}
					@Override
					public void customDialogClickLeft() {
						dialog.dismiss();
					}
				});
		dialog.show();
	}

	public void notifyDataSetChangedAdapter() {
		this.notifyDataSetChanged();
	}

	/**
	 * 当选择子节点的时候，调用该方法
	 */
	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

}
