package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.List;

/**
 * Products entity. @author MyEclipse Persistence Tools
 */
public class Products extends AbstractProducts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** full constructor */
	public Products(Integer shopId, Integer categoryId, Integer brandId, String productName, String shortDescription, String unit, Double weight, String description, String title, String metaDescription, String metaKeywords, String thumbnailsUrl, String inFocusImageUrl, Integer recommended, Integer latest, Integer hotsale, Integer specialOffer, Double costPrice, Double marketPrice, Integer upselling, Double salePrice, Integer stock, Integer quantityLimit, Integer minQuantity, String addedDate, Integer vistiCounts, Integer order, String productionDate, Integer isCustom, Integer customCycle, Integer minCustomQuantity, Integer maxCustomQuantity, String attachment, Integer shipperId, String createdDate, Integer userId, String updatedDate, Integer updatedUserId, String expiryTime) {
		super(shopId, categoryId, brandId, productName, shortDescription, unit, weight, description, title, metaDescription, metaKeywords, thumbnailsUrl, inFocusImageUrl, recommended, latest, hotsale, specialOffer, costPrice, marketPrice, upselling, salePrice, stock, quantityLimit, minQuantity, addedDate, vistiCounts, order, productionDate, isCustom, customCycle, minCustomQuantity, maxCustomQuantity, attachment, shipperId, createdDate, userId, updatedDate, updatedUserId, expiryTime);
	}
	boolean checked;
	Sku sku;
	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	List<Skugroup> listSkugroups;
	List<Sku> listSkus;
	List<ProductImages> listProductImages;
	List<YFormTag> listFormTag;
	List<YFormCombine> listFormCombine;
	List<YFormCombineValue> listFormCombineValue;
	YFormCombineValue formCombineValue;
	String selectStr;
	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public List<Skugroup> getListSkugroups() {
		return listSkugroups;
	}

	public void setListSkugroups(List<Skugroup> listSkugroups) {
		this.listSkugroups = listSkugroups;
	}

	public List<Sku> getListSkus() {
		return listSkus;
	}

	public void setListSkus(List<Sku> listSkus) {
		this.listSkus = listSkus;
	}

	public List<ProductImages> getListProductImages() {
		return listProductImages;
	}

	public void setListProductImages(List<ProductImages> listProductImages) {
		this.listProductImages = listProductImages;
	}

	public List<YFormTag> getListFormTag() {
		return listFormTag;
	}

	public void setListFormTag(List<YFormTag> listFormTag) {
		this.listFormTag = listFormTag;
	}

	public List<YFormCombine> getListFormCombine() {
		return listFormCombine;
	}

	public void setListFormCombine(List<YFormCombine> listFormCombine) {
		this.listFormCombine = listFormCombine;
	}

	public List<YFormCombineValue> getListFormCombineValue() {
		return listFormCombineValue;
	}

	public void setListFormCombineValue(List<YFormCombineValue> listFormCombineValue) {
		this.listFormCombineValue = listFormCombineValue;
	}
	public YFormCombineValue getFormCombineValue() {
		return formCombineValue;
	}

	public void setFormCombineValue(YFormCombineValue formCombineValue) {
		this.formCombineValue = formCombineValue;
	}
	public String getSelectStr() {
		return selectStr;
	}

	public void setSelectStr(String selectStr) {
		this.selectStr = selectStr;
	}
}
