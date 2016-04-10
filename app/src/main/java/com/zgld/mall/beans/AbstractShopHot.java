package com.zgld.mall.beans;

/**
 * AbstractShopHot entity provides the base persistence definition of the
 * ShopHot entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopHot implements java.io.Serializable {

	// Fields

	private Integer shopHotid;
	private Integer hotid;
	private Integer shopId;

	// Constructors

	/** default constructor */
	public AbstractShopHot() {
	}

	/** full constructor */
	public AbstractShopHot(Integer hotid, Integer shopId) {
		this.hotid = hotid;
		this.shopId = shopId;
	}

	// Property accessors

	public Integer getShopHotid() {
		return this.shopHotid;
	}

	public void setShopHotid(Integer shopHotid) {
		this.shopHotid = shopHotid;
	}

	public Integer getHotid() {
		return this.hotid;
	}

	public void setHotid(Integer hotid) {
		this.hotid = hotid;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

}