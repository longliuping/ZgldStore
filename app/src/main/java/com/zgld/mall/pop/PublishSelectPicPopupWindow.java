package com.zgld.mall.pop;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.adapter.SelectedBaseInfoAdapter;
import com.zgld.mall.adapter.SelectedInfoAdapter;
import com.zgld.mall.beans.HishopAttributeValues;
import com.zgld.mall.beans.HishopAttributes;
import com.zgld.mall.beans.HishopSkuitems;
import com.zgld.mall.beans.HishopSkus;
import com.zgld.mall.beans.Supplier;
import com.zgld.mall.utils.PriceUtil;

public class
		PublishSelectPicPopupWindow extends PopupWindow implements SelectedInfoAdapter.SelectedInfoAdapterCallback {
	private Integer valueId;
	private Integer attributeId;

	@Override
	public void onItemClick(HishopAttributeValues info, int position) {
		valueId = info.getValueId();
		attributeId = info.getAttributeId();
		setDetail(getSkus(getSkuId()));
	}

	public interface PublishSelectPicPopupWindowListener {
		void confirm(int number, String strNorms,HishopSkus hishopSkus, Integer valueId,Integer attributeId);
	}
	private View mMenuView;
	View close, ok, d_add, d_reduce;
	ImageView image;
	TextView title, sale_price,market_price,sale_model;
	EditText d_result;
	PublishSelectPicPopupWindowListener callBack;
	TextView style;
	ListView listview;
	List<HishopSkuitems> listHishopSkuitems = new ArrayList<>();
	List<HishopSkus> listHishopSkus = new ArrayList<>();
	@SuppressWarnings("deprecation")
	public PublishSelectPicPopupWindow(final Activity context, Supplier info,
			final PublishSelectPicPopupWindowListener callBack) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.callBack = callBack;
		mMenuView = inflater.inflate(R.layout.product_detail_param, null);

		listHishopSkus = info.getHishopProducts().getListHishopSkus();
		listHishopSkuitems = info.getHishopProducts().getListHishopSkuitems();
		final List<HishopAttributes> listHishopAttributes = info.getHishopProducts().getListHishopAttributes();
		List<HishopAttributeValues> listHishopAttributeValues = info.getHishopProducts().getListHishopAttributeValues();
		if(listHishopSkus!=null && listHishopAttributes!=null && listHishopAttributeValues!=null){
			for (int i = 0;i<listHishopAttributes.size();i++){
				HishopAttributes hishopAttributes = listHishopAttributes.get(i);
				List<HishopAttributeValues> lv = new ArrayList<>();
				for (int j=0;j<listHishopAttributeValues.size();j++){
					HishopAttributeValues hishopAttributeValues = listHishopAttributeValues.get(j);
					if(hishopAttributeValues.getAttributeId().equals(hishopAttributes.getAttributeId())){
						lv.add(hishopAttributeValues);
					}
				}
				hishopAttributes.setListHishopAttributeValues(lv);
				listHishopAttributes.set(i, hishopAttributes);
			}
		}
		listview = (ListView) mMenuView.findViewById(R.id.listview);
		listview.setAdapter(new SelectedBaseInfoAdapter(context,listHishopAttributes,this));

		d_result = (EditText) mMenuView.findViewById(R.id.d_result);
		style = (TextView) mMenuView.findViewById(R.id.style);
		close = mMenuView.findViewById(R.id.close);
		close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dismiss();
			}
		});
		ok = mMenuView.findViewById(R.id.ok);
		d_add = mMenuView.findViewById(R.id.d_add);

		d_reduce = mMenuView.findViewById(R.id.d_reduce);
		image = (ImageView) mMenuView.findViewById(R.id.image);
		title = (TextView) mMenuView.findViewById(R.id.title);
		sale_price = (TextView) mMenuView.findViewById(R.id.sale_price);
		title.setText(info.getHishopProducts().getProductName());
		sale_price.setText("销售价："+PriceUtil.priceY(info.getHishopProducts().getListHishopSkus().get(0).getSalePrice() + ""));
		market_price = (TextView) mMenuView.findViewById(R.id.market_price);
		market_price.setText("市场价：" + PriceUtil.priceY(info.getHishopProducts().getMarketPrice() + ""));
		sale_model =  (TextView)mMenuView.findViewById(R.id.sale_model);
		sale_model.setText("商品货号："+info.getHishopProducts().getListHishopSkus().get(0).getSku());
		SysApplication.DisplayImage(info.getHishopProducts().getImageUrl1(), image);
		ok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String seleStr = "";
				String message = "";
				boolean havb = true;
				if(listHishopAttributes!=null && listHishopAttributes.size()>0) {
					for (int i=0;i<listHishopAttributes.size();i++){
						HishopAttributes ha = listHishopAttributes.get(i);
						havb = false;
						for (int j=0;j<ha.getListHishopAttributeValues().size();j++){
							seleStr += ha.getAttributeName()+":";
							HishopAttributeValues hav = ha.getListHishopAttributeValues().get(j);
							if(hav.isSelected()){
								havb = true;
								seleStr += hav.getValueStr()+";";
							}
						}
						if(!havb){
							message = "请选择:"+ha.getAttributeName();
							break;
						}

					}
				}
				if (!havb) {
					Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
					return;
				}
				int number = Integer.parseInt(d_result.getText().toString());
				dismiss();
				callBack.confirm(number, seleStr, getSkus(getSkuId()), valueId, attributeId);
			}
		});
		d_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int number = Integer.parseInt(d_result.getText().toString());
				number = number + 1;
				d_result.setText(number + "");
			}
		});

		d_reduce.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int number = Integer.parseInt(d_result.getText().toString());
				if (number > 1) {
					number = number - 1;
					d_result.setText(number + "");
				}
			}
		});

		// 设置按钮监听
		// 设置SelectPicPopupWindow的View
		this.setContentView(mMenuView);
		// 设置SelectPicPopupWindow弹出窗体的宽
		this.setWidth(LayoutParams.FILL_PARENT);
		// 设置SelectPicPopupWindow弹出窗体的高
		this.setHeight(LayoutParams.WRAP_CONTENT);
		// 设置SelectPicPopupWindow弹出窗体可点击
		this.setFocusable(true);
		// 设置SelectPicPopupWindow弹出窗体动画效果
		this.setAnimationStyle(R.style.AnimBottom);
		// 实例化一个ColorDrawable颜色为半透明
		ColorDrawable dw = new ColorDrawable(0xb0000000);// #BFBFBF 0xb0000000
		// 设置SelectPicPopupWindow弹出窗体的背景
		this.setBackgroundDrawable(dw);
		// mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
		mMenuView.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {

				int height = mMenuView.findViewById(R.id.pop_layout).getTop();
				int y = (int) event.getY();
				if (event.getAction() == MotionEvent.ACTION_UP) {
					if (y < height) {
						dismiss();
					}
				}
				return true;
			}
		});

	}
	public void setDetail(HishopSkus hishopSkus){
		if(hishopSkus!=null) {
			sale_model.setText("商品货号：" + hishopSkus.getSku());
			sale_price.setText("销售价："+ PriceUtil.priceY(hishopSkus.getSalePrice() + ""));
		}
	}
	public String getSkuId(){
		String skuId = null;
		for (int i=0;i<listHishopSkuitems.size();i++){
			HishopSkuitems items = listHishopSkuitems.get(i);
			if(items.getAttributeId().equals(attributeId) && items.getValueId().equals(valueId)) {
				skuId =  items.getSkuId();
			}
		}
		return skuId;
	}
	public HishopSkus getSkus(String skuId){
		HishopSkus skus = null;
		for (int i=0;i<listHishopSkus.size();i++){
			if(listHishopSkus.get(i).getSkuId().equals(skuId)){
				skus = listHishopSkus.get(i);
			}
		}
		if(skus==null && listHishopSkus!=null){
			skus = listHishopSkus.get(0);
		}
		return skus;
	}
}
