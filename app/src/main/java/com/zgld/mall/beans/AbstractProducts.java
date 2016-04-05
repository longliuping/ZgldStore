package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractProducts entity provides the base persistence definition of the
 * Products entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProducts implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Integer shopId;
	private Integer categoryId;
	private Integer brandId;
	private String productName;
	private String shortDescription;
	private String unit;
	private Double weight;
	private String description;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private String thumbnailsUrl;
	private String inFocusImageUrl;
	private Integer recommended;
	private Integer latest;
	private Integer hotsale;
	private Integer specialOffer;
	private Double costPrice;
	private Double marketPrice;
	private Integer upselling;
	private Double salePrice;
	private Integer stock;
	private Integer quantityLimit;
	private Integer minQuantity;
	private String addedDate;
	private Integer vistiCounts;
	private Integer order;
	private String productionDate;
	private Integer isCustom;
	private Integer customCycle;
	private Integer minCustomQuantity;
	private Integer maxCustomQuantity;
	private String attachment;
	private Integer shipperId;
	private String createdDate;
	private Integer userId;
	private String updatedDate;
	private Integer updatedUserId;
	private String expiryTime;

	// Constructors

	/** default constructor */
	public AbstractProducts() {
	}

	/** full constructor */
	public AbstractProducts(Integer shopId, Integer categoryId, Integer brandId, String productName, String shortDescription, String unit, Double weight, String description, String title, String metaDescription, String metaKeywords, String thumbnailsUrl, String inFocusImageUrl, Integer recommended, Integer latest, Integer hotsale, Integer specialOffer, Double costPrice, Double marketPrice, Integer upselling, Double salePrice, Integer stock, Integer quantityLimit, Integer minQuantity, String addedDate, Integer vistiCounts, Integer order, String productionDate, Integer isCustom, Integer customCycle, Integer minCustomQuantity, Integer maxCustomQuantity, String attachment, Integer shipperId, String createdDate, Integer userId, String updatedDate, Integer updatedUserId,
							String expiryTime) {
		this.shopId = shopId;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.productName = productName;
		this.shortDescription = shortDescription;
		this.unit = unit;
		this.weight = weight;
		this.description = description;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.thumbnailsUrl = thumbnailsUrl;
		this.inFocusImageUrl = inFocusImageUrl;
		this.recommended = recommended;
		this.latest = latest;
		this.hotsale = hotsale;
		this.specialOffer = specialOffer;
		this.costPrice = costPrice;
		this.marketPrice = marketPrice;
		this.upselling = upselling;
		this.salePrice = salePrice;
		this.stock = stock;
		this.quantityLimit = quantityLimit;
		this.minQuantity = minQuantity;
		this.addedDate = addedDate;
		this.vistiCounts = vistiCounts;
		this.order = order;
		this.productionDate = productionDate;
		this.isCustom = isCustom;
		this.customCycle = customCycle;
		this.minCustomQuantity = minCustomQuantity;
		this.maxCustomQuantity = maxCustomQuantity;
		this.attachment = attachment;
		this.shipperId = shipperId;
		this.createdDate = createdDate;
		this.userId = userId;
		this.updatedDate = updatedDate;
		this.updatedUserId = updatedUserId;
		this.expiryTime = expiryTime;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getThumbnailsUrl() {
		return this.thumbnailsUrl;
	}

	public void setThumbnailsUrl(String thumbnailsUrl) {
		this.thumbnailsUrl = thumbnailsUrl;
	}

	public String getInFocusImageUrl() {
		return this.inFocusImageUrl;
	}

	public void setInFocusImageUrl(String inFocusImageUrl) {
		this.inFocusImageUrl = inFocusImageUrl;
	}

	public Integer getRecommended() {
		return this.recommended;
	}

	public void setRecommended(Integer recommended) {
		this.recommended = recommended;
	}

	public Integer getLatest() {
		return this.latest;
	}

	public void setLatest(Integer latest) {
		this.latest = latest;
	}

	public Integer getHotsale() {
		return this.hotsale;
	}

	public void setHotsale(Integer hotsale) {
		this.hotsale = hotsale;
	}

	public Integer getSpecialOffer() {
		return this.specialOffer;
	}

	public void setSpecialOffer(Integer specialOffer) {
		this.specialOffer = specialOffer;
	}

	public Double getCostPrice() {
		return this.costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Integer getUpselling() {
		return this.upselling;
	}

	public void setUpselling(Integer upselling) {
		this.upselling = upselling;
	}

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getQuantityLimit() {
		return this.quantityLimit;
	}

	public void setQuantityLimit(Integer quantityLimit) {
		this.quantityLimit = quantityLimit;
	}

	public Integer getMinQuantity() {
		return this.minQuantity;
	}

	public void setMinQuantity(Integer minQuantity) {
		this.minQuantity = minQuantity;
	}

	public String getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}

	public Integer getVistiCounts() {
		return this.vistiCounts;
	}

	public void setVistiCounts(Integer vistiCounts) {
		this.vistiCounts = vistiCounts;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getProductionDate() {
		return this.productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public Integer getIsCustom() {
		return this.isCustom;
	}

	public void setIsCustom(Integer isCustom) {
		this.isCustom = isCustom;
	}

	public Integer getCustomCycle() {
		return this.customCycle;
	}

	public void setCustomCycle(Integer customCycle) {
		this.customCycle = customCycle;
	}

	public Integer getMinCustomQuantity() {
		return this.minCustomQuantity;
	}

	public void setMinCustomQuantity(Integer minCustomQuantity) {
		this.minCustomQuantity = minCustomQuantity;
	}

	public Integer getMaxCustomQuantity() {
		return this.maxCustomQuantity;
	}

	public void setMaxCustomQuantity(Integer maxCustomQuantity) {
		this.maxCustomQuantity = maxCustomQuantity;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public Integer getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getUpdatedUserId() {
		return this.updatedUserId;
	}

	public void setUpdatedUserId(Integer updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public String getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

}