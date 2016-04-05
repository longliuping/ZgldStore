package com.zgld.mall.beans;

/**
 * Shipper entity. @author MyEclipse Persistence Tools
 */
public class Shipper extends AbstractShipper implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Shipper() {
	}

	/** full constructor */
	public Shipper(Integer shopId, Integer isDefault, String shipperTag, String shipperName, Integer regionId, String address, String cellPhone, String telPhone, String zipcode, String remark) {
		super(shopId, isDefault, shipperTag, shipperName, regionId, address, cellPhone, telPhone, zipcode, remark);
	}

}
