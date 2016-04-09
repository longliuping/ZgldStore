package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractTaobaoProducts entity provides the base persistence definition of the
 * TaobaoProducts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaobaoProducts implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Long cid;
	private String stuffStatus;
	private String proTitle;
	private Long num;
	private String locationState;
	private String locationCity;
	private String freightPayer;
	private Double postFee;
	private Double expressFee;
	private Double emsfee;
	private Boolean hasInvoice;
	private Boolean hasWarranty;
	private Boolean hasDiscount;
	private Long validThru;
	private Date listTime;
	private String propertyAlias;
	private String inputPids;
	private String inputStr;
	private String skuProperties;
	private String skuQuantities;
	private String skuPrices;
	private String skuOuterIds;

	// Constructors

	/** default constructor */
	public AbstractTaobaoProducts() {
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}

	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public String getProTitle() {
		return this.proTitle;
	}

	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getLocationState() {
		return this.locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationCity() {
		return this.locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}

	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Double getPostFee() {
		return this.postFee;
	}

	public void setPostFee(Double postFee) {
		this.postFee = postFee;
	}

	public Double getExpressFee() {
		return this.expressFee;
	}

	public void setExpressFee(Double expressFee) {
		this.expressFee = expressFee;
	}

	public Double getEmsfee() {
		return this.emsfee;
	}

	public void setEmsfee(Double emsfee) {
		this.emsfee = emsfee;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}

	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}

	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}

	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Long getValidThru() {
		return this.validThru;
	}

	public void setValidThru(Long validThru) {
		this.validThru = validThru;
	}

	public Date getListTime() {
		return this.listTime;
	}

	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}

	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getInputPids() {
		return this.inputPids;
	}

	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public String getInputStr() {
		return this.inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}

	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

	public String getSkuQuantities() {
		return this.skuQuantities;
	}

	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}

	public String getSkuPrices() {
		return this.skuPrices;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}

	public String getSkuOuterIds() {
		return this.skuOuterIds;
	}

	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}

}