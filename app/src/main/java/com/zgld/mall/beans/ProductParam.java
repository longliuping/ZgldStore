package com.zgld.mall.beans;

import java.io.Serializable;

public class ProductParam implements Serializable {
	private String ProductId;
	private String AttributeName;
	private String DisplaySequence;
	private String UseAttributeImage;
	private String ImageUrl;
	private String ValueStr;

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getAttributeName() {
		return AttributeName;
	}

	public void setAttributeName(String attributeName) {
		AttributeName = attributeName;
	}

	public String getDisplaySequence() {
		return DisplaySequence;
	}

	public void setDisplaySequence(String displaySequence) {
		DisplaySequence = displaySequence;
	}

	public String getUseAttributeImage() {
		return UseAttributeImage;
	}

	public void setUseAttributeImage(String useAttributeImage) {
		UseAttributeImage = useAttributeImage;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public String getValueStr() {
		return ValueStr;
	}

	public void setValueStr(String valueStr) {
		ValueStr = valueStr;
	}

}