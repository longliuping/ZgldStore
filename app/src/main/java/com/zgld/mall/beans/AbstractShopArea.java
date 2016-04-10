package com.zgld.mall.beans;

/**
 * AbstractShopArea entity provides the base persistence definition of the
 * ShopArea entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopArea implements java.io.Serializable {

	// Fields

	private Integer shopAreaid;
	private Integer shopId;
	private Integer areaId;

	// Constructors

	/** default constructor */
	public AbstractShopArea() {
	}

	/** full constructor */
	public AbstractShopArea(Integer shopId, Integer areaId) {
		this.shopId = shopId;
		this.areaId = areaId;
	}

	// Property accessors

	public Integer getShopAreaid() {
		return this.shopAreaid;
	}

	public void setShopAreaid(Integer shopAreaid) {
		this.shopAreaid = shopAreaid;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

}