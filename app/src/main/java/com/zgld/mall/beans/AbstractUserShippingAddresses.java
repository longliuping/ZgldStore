package com.zgld.mall.beans;

/**
 * AbstractUserShippingAddresses entity provides the base persistence definition
 * of the UserShippingAddresses entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserShippingAddresses implements java.io.Serializable {

	// Fields

	private Integer addressId;
	private Integer regionId;
	private Integer userId;
	private String shipTo;
	private String address;
	private String zipcode;
	private String emailAddress;

	// Constructors

	/** default constructor */
	public AbstractUserShippingAddresses() {
	}

	/** full constructor */
	public AbstractUserShippingAddresses(Integer regionId, Integer userId, String shipTo, String address, String zipcode, String emailAddress) {
		this.regionId = regionId;
		this.userId = userId;
		this.shipTo = shipTo;
		this.address = address;
		this.zipcode = zipcode;
		this.emailAddress = emailAddress;
	}

	// Property accessors

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getShipTo() {
		return this.shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}