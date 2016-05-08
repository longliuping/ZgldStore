package com.zgld.mall.pop;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.zgld.mall.R;
import com.zgld.mall.SysApplication;
import com.zgld.mall.adapter.SelectedBaseInfoAdapter;
import com.zgld.mall.adapter.SelectedInfoAdapter;
import com.zgld.mall.beans.Products;
import com.zgld.mall.beans.Sku;
import com.zgld.mall.beans.Skugroup;
import com.zgld.mall.beans.YFormCombine;
import com.zgld.mall.beans.YFormCombineValue;
import com.zgld.mall.beans.YFormControl;
import com.zgld.mall.beans.YFormTag;
import com.zgld.mall.beans.YShop;
import com.zgld.mall.utils.PriceUtil;

public class PublishSelectPicPopupWindow extends PopupWindow implements SelectedInfoAdapter.SelectedInfoAdapterCallback {
	private Integer valueId;
	private Integer attributeId;
	YFormControl formControl = null;
	YFormCombineValue formCombineValue;
	@Override
	public void onItemClick(YFormControl info,YFormTag formTag,int basePosition, int position) {
		formControl = info;
		String message = "";
		String seleStr = "";
		formTag.setStr("_-"+formTag.getTagFieldName()+"-"+info.getControlValue());
		listFormTag.set(basePosition,formTag);
		selectedBaseInfoAdapter.notifyDataSetChanged();
		boolean havb = true;
		Products product = shop.getProducts();
		if(product.getListFormTag()!=null && product.getListFormTag().size()>0) {
			for (int i=0;i<product.getListFormTag().size();i++){
				YFormTag ha = product.getListFormTag().get(i);
				havb = false;
				for (int j=0;j<ha.getListFormControl().size();j++){
					seleStr += ha.getTagName()+":";
					YFormControl hav = ha.getListFormControl().get(j);
					if(hav.isSelected()){
						havb = true;
						seleStr += hav.getControlName()+";";
					}
				}
				if(!havb){
					message = "请选择:"+ha.getTagName();
					break;
				}

			}
		}
		if (message.length()>5) {

		}else {
			String tag = "";
			for (int c = 0;c<shop.getProducts().getListFormTag().size();c++){
				tag =  shop.getProducts().getListFormTag().get(c).getStr()+tag;
			}
			tag = tag+"_";
			for (int j = 0; j < shop.getProducts().getListFormCombineValue().size(); j++) {
				YFormCombineValue v  = shop.getProducts().getListFormCombineValue().get(j);
				if(v.getCombineString().equals(tag)){
					formCombineValue = v;
					setDetail(formCombineValue);
					return;
				}
			}
		}
	}

	public interface PublishSelectPicPopupWindowListener {
		void confirm(int number, String strNorms,YFormCombineValue formCombineValue, Integer valueId,Integer attributeId);
	}
	private View mMenuView;
	View close, ok, d_add, d_reduce;
	ImageView image;
	TextView title, sale_price,market_price,sale_model;
	EditText d_result;
	PublishSelectPicPopupWindowListener callBack;
	TextView style;
	ListView listview;
	List<Sku> listHishopSkus = new ArrayList<>();
	YShop shop = null;
	SelectedBaseInfoAdapter selectedBaseInfoAdapter;
	List<YFormTag> listFormTag = new ArrayList<>();
	@SuppressWarnings("deprecation")
	public PublishSelectPicPopupWindow(final Activity context, final YShop info,
			final PublishSelectPicPopupWindowListener callBack) {
		super(context);
		shop = info;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.callBack = callBack;
		mMenuView = inflater.inflate(R.layout.product_detail_param, null);

		listview = (ListView) mMenuView.findViewById(R.id.listview);
		listFormTag = info.getProducts().getListFormTag();
		selectedBaseInfoAdapter = new SelectedBaseInfoAdapter(context,listFormTag,this);
		listview.setAdapter(selectedBaseInfoAdapter);

		d_result = (EditText) mMenuView.findViewById(R.id.d_result);
		style = (TextView) mMenuView.findViewById(R.id.style);
		close = mMenuView.findViewById(R.id.close);
		close.setOnClickListener(new View.OnClickListener() {

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
		title.setText(info.getProducts().getProductName());
		market_price = (TextView) mMenuView.findViewById(R.id.market_price);
		sale_model =  (TextView)mMenuView.findViewById(R.id.sale_model);
		sale_price.setText("抢购价："+PriceUtil.priceY(info.getProducts().getSalePrice() + ""));
		sale_model.setText("库存：" + info.getProducts().getStock()+"");
//		market_price.setText("店面价：" + PriceUtil.priceY(info.getProducts().getMarketPrice() + ""));
//		market_price.setVisibility(View.GONE);
		SysApplication.DisplayImage(info.getProducts().getThumbnailsUrl(), image);
		ok.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String seleStr = "";
				String message = "";
				boolean havb = true;
				Products product = info.getProducts();
				if(product.getListFormTag()!=null && product.getListFormTag().size()>0) {
					for (int i=0;i<product.getListFormTag().size();i++){
						YFormTag ha = product.getListFormTag().get(i);
						havb = false;
						for (int j=0;j<ha.getListFormControl().size();j++){
							seleStr += ha.getTagName()+":";
							YFormControl hav = ha.getListFormControl().get(j);
							if(hav.isSelected()){
								havb = true;
								seleStr += hav.getControlName()+";";
							}
						}
						if(!havb){
							message = "请选择:"+ha.getTagName();
							break;
						}

					}
				}
				if (!havb) {
					Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
					return;
				}
				int number = Integer.parseInt(d_result.getText().toString());
				if(formCombineValue!=null && number>formCombineValue.getGoStore()){
					Toast.makeText(context, "购买数量不能大于库存数量:"+formCombineValue.getGoStore(), Toast.LENGTH_SHORT).show();
					return;
				}
				dismiss();
				callBack.confirm(number, seleStr, formCombineValue, valueId, attributeId);
			}
		});
		d_add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int number = Integer.parseInt(d_result.getText().toString());
				number = number + 1;
				d_result.setText(number + "");
			}
		});

		d_reduce.setOnClickListener(new View.OnClickListener() {

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
		this.setWidth(LinearLayout.LayoutParams.FILL_PARENT);
		// 设置SelectPicPopupWindow弹出窗体的高
		this.setHeight(LinearLayout.LayoutParams.WRAP_CONTENT);
		// 设置SelectPicPopupWindow弹出窗体可点击
		this.setFocusable(true);
		// 设置SelectPicPopupWindow弹出窗体动画效果
		this.setAnimationStyle(R.style.AnimBottom);
		// 实例化一个ColorDrawable颜色为半透明
		ColorDrawable dw = new ColorDrawable(0xb0000000);// #BFBFBF 0xb0000000
		// 设置SelectPicPopupWindow弹出窗体的背景
		this.setBackgroundDrawable(dw);
		// mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
		mMenuView.setOnTouchListener(new View.OnTouchListener() {
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
	public void setDetail(YFormCombineValue hishopSkus){
		if(hishopSkus!=null) {
			sale_model.setText("库存：" + hishopSkus.getGoStore()+"");
			sale_price.setText("抢购价："+ PriceUtil.priceY(hishopSkus.getGoSalePrice() + ""));
			market_price.setText("规格："+hishopSkus.getCombineString());
		}
	}
}
