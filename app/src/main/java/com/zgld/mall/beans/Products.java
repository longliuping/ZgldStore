package com.zgld.mall.beans;

import java.sql.Timestamp;

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

}
