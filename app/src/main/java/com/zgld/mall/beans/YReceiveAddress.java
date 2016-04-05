package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YReceiveAddress entity. @author MyEclipse Persistence Tools
 */
public class YReceiveAddress extends AbstractYReceiveAddress implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YReceiveAddress() {
	}

	/** minimal constructor */
	public YReceiveAddress(String addressTime) {
		super(addressTime);
	}

	/** full constructor */
	public YReceiveAddress(Integer accountActId, Integer areaId, String addressDetail, String userName, String userMobile, Integer isDefault, String addressTime) {
		super(accountActId, areaId, addressDetail, userName, userMobile, isDefault, addressTime);
	}

}
