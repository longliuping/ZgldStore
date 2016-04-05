package com.zgld.mall.beans;

/**
 * UserShippingAddresses entity. @author MyEclipse Persistence Tools
 */
public class UserShippingAddresses extends AbstractUserShippingAddresses implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserShippingAddresses() {
	}

	/** full constructor */
	public UserShippingAddresses(Integer regionId, Integer userId, String shipTo, String address, String zipcode, String emailAddress) {
		super(regionId, userId, shipTo, address, zipcode, emailAddress);
	}

}
