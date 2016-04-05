package com.zgld.mall.beans;

/**
 * AbstractShipper entity provides the base persistence definition of the
 * Shipper entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShipper implements java.io.Serializable {

	// Fields

	private Integer shipperId;
	private Integer shopId;
	private Integer isDefault;
	private String shipperTag;
	private String shipperName;
	private Integer regionId;
	private String address;
	private String cellPhone;
	private String telPhone;
	private String zipcode;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractShipper() {
	}

	/** full constructor */
	public AbstractShipper(Integer shopId, Integer isDefault, String shipperTag, String shipperName, Integer regionId, String address, String cellPhone, String telPhone, String zipcode, String remark) {
		this.shopId = shopId;
		this.isDefault = isDefault;
		this.shipperTag = shipperTag;
		this.shipperName = shipperName;
		this.regionId = regionId;
		this.address = address;
		this.cellPhone = cellPhone;
		this.telPhone = telPhone;
		this.zipcode = zipcode;
		this.remark = remark;
	}

	// Property accessors

	public Integer getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public String getShipperTag() {
		return this.shipperTag;
	}

	public void setShipperTag(String shipperTag) {
		this.shipperTag = shipperTag;
	}

	public String getShipperName() {
		return this.shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getTelPhone() {
		return this.telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}