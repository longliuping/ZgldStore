package com.zgld.mall.beans;

/**
 * AbstractGifts entity provides the base persistence definition of the Gifts
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGifts implements java.io.Serializable {

	// Fields

	private Integer giftId;
	private Integer shopId;
	private String name;
	private String shortDescription;
	private String unit;
	private Integer weight;
	private String longDescription;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private String thumbnailsUrl;
	private String inFocusImageUrl;
	private Double costPrice;
	private Double marketPrice;
	private Integer enabled;
	private Double salePrice;
	private Integer stock;
	private Integer needPoint;

	// Constructors

	/** default constructor */
	public AbstractGifts() {
	}

	/** full constructor */
	public AbstractGifts(Integer shopId, String name, String shortDescription, String unit, Integer weight, String longDescription, String title, String metaDescription, String metaKeywords, String thumbnailsUrl, String inFocusImageUrl, Double costPrice, Double marketPrice, Integer enabled, Double salePrice, Integer stock, Integer needPoint) {
		this.shopId = shopId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.unit = unit;
		this.weight = weight;
		this.longDescription = longDescription;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.thumbnailsUrl = thumbnailsUrl;
		this.inFocusImageUrl = inFocusImageUrl;
		this.costPrice = costPrice;
		this.marketPrice = marketPrice;
		this.enabled = enabled;
		this.salePrice = salePrice;
		this.stock = stock;
		this.needPoint = needPoint;
	}

	// Property accessors

	public Integer getGiftId() {
		return this.giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
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

	public Integer getNeedPoint() {
		return this.needPoint;
	}

	public void setNeedPoint(Integer needPoint) {
		this.needPoint = needPoint;
	}

}