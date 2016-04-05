package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYReceiveAddress entity provides the base persistence definition of
 * the YReceiveAddress entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYReceiveAddress implements java.io.Serializable {

	// Fields

	private Integer addressId;
	private Integer accountActId;
	private Integer areaId;
	private String addressDetail;
	private String userName;
	private String userMobile;
	private Integer isDefault;
	private String addressTime;

	// Constructors

	/** default constructor */
	public AbstractYReceiveAddress() {
	}

	/** minimal constructor */
	public AbstractYReceiveAddress(String addressTime) {
		this.addressTime = addressTime;
	}

	/** full constructor */
	public AbstractYReceiveAddress(Integer accountActId, Integer areaId, String addressDetail, String userName, String userMobile, Integer isDefault, String addressTime) {
		this.accountActId = accountActId;
		this.areaId = areaId;
		this.addressDetail = addressDetail;
		this.userName = userName;
		this.userMobile = userMobile;
		this.isDefault = isDefault;
		this.addressTime = addressTime;
	}

	// Property accessors

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public String getAddressTime() {
		return this.addressTime;
	}

	public void setAddressTime(String addressTime) {
		this.addressTime = addressTime;
	}

}