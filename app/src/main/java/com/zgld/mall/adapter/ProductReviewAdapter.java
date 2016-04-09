package com.zgld.mall.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.beans.ProductReviews;

/*
 * 累计评论适配器
 */
public class ProductReviewAdapter extends BaseAdapter {
	private List<ProductReviews> list;
	private Context context;
	private LayoutInflater layoutInflater;

	public ProductReviewAdapter(List<ProductReviews> list, Context context) {
		super();
		this.list = list;
		this.context = context;
		layoutInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.item_product_review, null);
			viewHolder.ivHead = (ImageView) convertView.findViewById(R.id.review_head);
			viewHolder.tvContent = (TextView) convertView.findViewById(R.id.review_content);
			viewHolder.tvName = (TextView) convertView.findViewById(R.id.review_name);
			viewHolder.tvDate = (TextView) convertView.findViewById(R.id.review_date);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		ProductReviews productReview = list.get(position);
		if (productReview != null) {
			SysApplication.DisplayUserImage(productReview.getUserInfo().getAccountHead(), viewHolder.ivHead);
			viewHolder.tvName.setText(productReview.getUserInfo().getAccountName());
			viewHolder.tvContent.setText(productReview.getReviewText());
			String reviewDate = productReview.getReviewDate();
			long mdate = Long.parseLong(get_StringNum(reviewDate));
			Date date = new Date(mdate);
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
			String str = format.format(date);
			viewHolder.tvDate.setText(str);
		}
		return convertView;
	}

	private String get_StringNum(String s) {

		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(s);

		return m.replaceAll("").trim();

	}

	class ViewHolder {
		ImageView ivHead;
		TextView tvName;
		TextView tvContent;
		TextView tvDate;

	}

}
