package com.zgld.mall.beans;

import java.util.Date;

/**
 * AbstractYMenuClass entity provides the base persistence definition of the
 * YMenuClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMenuClass implements java.io.Serializable {

	// Fields

	private Integer meClassId;
	private Integer meParentClassId;
	private Integer meClassSetId;
	private Integer accountActId;
	private String meClassName;
	private Integer isDelete;
	private String meClassTime;

	// Constructors

	/** default constructor */
	public AbstractYMenuClass() {
	}

	/** minimal constructor */
	public AbstractYMenuClass(String meClassTime) {
		this.meClassTime = meClassTime;
	}

	/** full constructor */
	public AbstractYMenuClass(Integer meParentClassId, Integer meClassSetId, Integer accountActId, String meClassName, Integer isDelete, String meClassTime) {
		this.meParentClassId = meParentClassId;
		this.meClassSetId = meClassSetId;
		this.accountActId = accountActId;
		this.meClassName = meClassName;
		this.isDelete = isDelete;
		this.meClassTime = meClassTime;
	}

	// Property accessors

	public Integer getMeClassId() {
		return this.meClassId;
	}

	public void setMeClassId(Integer meClassId) {
		this.meClassId = meClassId;
	}

	public Integer getMeParentClassId() {
		return this.meParentClassId;
	}

	public void setMeParentClassId(Integer meParentClassId) {
		this.meParentClassId = meParentClassId;
	}

	public Integer getMeClassSetId() {
		return this.meClassSetId;
	}

	public void setMeClassSetId(Integer meClassSetId) {
		this.meClassSetId = meClassSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getMeClassName() {
		return this.meClassName;
	}

	public void setMeClassName(String meClassName) {
		this.meClassName = meClassName;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMeClassTime() {
		return this.meClassTime;
	}

	public void setMeClassTime(String meClassTime) {
		this.meClassTime = meClassTime;
	}

}