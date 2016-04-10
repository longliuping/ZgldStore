package com.zgld.mall.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.activity.ProductDetailActivity;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.ShoppingCarts;
import com.zgld.mall.utils.Contents;
import com.zgld.mall.utils.PriceUtil;

import java.util.List;

public class ShoppingCarExpandableListAdapter extends BaseExpandableListAdapter {
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
		return listInfo.get(groupPosition).getListProducts().size();
	}

	/**
	 * 获取一级标签下二级标签的内容
	 */
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// return listInfo.get(groupPosition).getProducts().get(childPosition);
		return listInfo.get(groupPosition).getListProducts().get(childPosition);
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
		CheckBox item_car_manufactor;
		TextView item_car_manufactor_name, item_car_manufactor_detail;
	}

	/**
	 * 对一级标签进行设置
	 */
	@Override
	public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		GroupViewHolder holder = null;
		if (convertView == null) {
			holder = new GroupViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.item_shopping_group, null);
			holder.item_car_manufactor = (CheckBox) convertView.findViewById(R.id.item_car_manufactor);
			holder.item_car_manufactor_name = (TextView) convertView.findViewById(R.id.item_car_manufactor_name);
			holder.item_car_manufactor_detail = (TextView) convertView.findViewById(R.id.item_car_manufactor_detail);
			convertView.setTag(holder);
		} else {
			holder = (GroupViewHolder) convertView.getTag();
		}
		ShoppingCarts info = listInfo.get(groupPosition);
		if (info != null) {
			holder.item_car_manufactor_name.setText(info.getyShop().getUserId()+"");
			holder.item_car_manufactor_detail.setText(info.getyShop().getShopAddress());
			holder.item_car_manufactor.setChecked(info.isChecked());
			final GroupViewHolder h = holder;
			holder.item_car_manufactor.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					listener.groupViewOnCheckedChangeListener(groupPosition, h.item_car_manufactor.isChecked());
				}
			});
		}
		return convertView;
	}

	class ChildViewHoldeer {
		CheckBox item_car_checkbox;
		ImageView item_delete, item_image;
		TextView d_reduce, d_add;
		EditText d_result;
		TextView item_title, item_detail, item_price, item_market_price;
		View item_line;
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
			convertView = LayoutInflater.from(context).inflate(R.layout.item_shopping, null);
			holder.item_car_checkbox = (CheckBox) convertView.findViewById(R.id.item_car_checkbox);
			holder.item_delete = (ImageView) convertView.findViewById(R.id.item_delete);
			holder.d_reduce = (TextView) convertView.findViewById(R.id.d_reduce);
			holder.d_add = (TextView) convertView.findViewById(R.id.d_add);
			holder.d_result = (EditText) convertView.findViewById(R.id.d_result);
			holder.item_title = (TextView) convertView.findViewById(R.id.item_title);
			holder.item_detail = (TextView) convertView.findViewById(R.id.item_detail);
			holder.item_price = (TextView) convertView.findViewById(R.id.item_price);
			holder.item_market_price = (TextView) convertView.findViewById(R.id.item_market_price);
			holder.item_image = (ImageView) convertView.findViewById(R.id.item_image);
			holder.item_line = convertView.findViewById(R.id.item_line);
			convertView.setTag(holder);
		} else {
			holder = (ChildViewHoldeer) convertView.getTag();
		}
		final ChildViewHoldeer h = holder;
		holder.item_line.setVisibility(View.VISIBLE);
		if (isLastChild) {
			holder.item_line.setVisibility(View.GONE);
		}
		final Products info = listInfo.get(groupPosition).getListProducts().get(childPosition);
		if (info != null) {
			holder.item_title.setText(info.getProductName());
			holder.item_price.setText(PriceUtil.priceY(info.getSalePrice()+""));
			holder.item_market_price.setText(PriceUtil.priceY(info.getMarketPrice()+""));
			holder.d_result.setText(listInfo.get(groupPosition).getQuantity() + "");
			SysApplication.DisplayImage(info.getThumbnailsUrl(), holder.item_image);
			final int number = Integer.parseInt(holder.d_result.getText().toString());
			holder.item_car_checkbox.setChecked(info.isChecked());
			holder.item_image.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(context, ProductDetailActivity.class);
					intent.putExtra(Contents.PRODUCTID, info.getProductId());
					context.startActivity(intent);
				}
			});
			holder.d_add.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					int n = number + 1;
					h.d_result.setText(n + "");
					listener.addNumber(groupPosition, childPosition, n);
				}
			});
			holder.d_reduce.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if (number > 1) {
						int n = number - 1;
						h.d_result.setText(n + "");
						listener.reduceNumber(groupPosition, childPosition, n);
					}
				}
			});
			holder.item_delete.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					listener.deleteProduct(groupPosition, childPosition);
				}
			});

			holder.item_car_checkbox.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					listener.childViewOnCheckedChangeListener(groupPosition, childPosition,
							h.item_car_checkbox.isChecked());
				}
			});
//			List<HishopSkuitems> listHishopSkuitems = info.getListHishopSkuitems();
//			if(listHishopSkuitems!=null){
//				StringBuffer str = new StringBuffer("");
//				for (int i =0;i<listHishopSkuitems.size();i++){
//						HishopSkuitems item = listHishopSkuitems.get(i);
//						str.append(item.getHishopAttributes().getAttributeName()+":");
//						str.append(item.getHishopAttributeValues().getValueStr()+";");
//				}
//				holder.item_detail.setText(str.toString()+"商品货号:"+info.getHishopSkus().getSku());
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
