package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYUnitClass entity provides the base persistence definition of the
 * YUnitClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYUnitClass implements java.io.Serializable {

	// Fields

	private Integer unitClassId;
	private Integer unitClassSetId;
	private Integer unitParentClassId;
	private Integer accountActId;
	private String unitClassName;
	private Integer unitClassTotal;
	private Integer unitClassOrder;
	private Integer unitClassTopOrder;
	private Integer isDelete;
	private String unitClassTime;

	// Constructors

	/** default constructor */
	public AbstractYUnitClass() {
	}

	/** minimal constructor */
	public AbstractYUnitClass(String unitClassTime) {
		this.unitClassTime = unitClassTime;
	}

	/** full constructor */
	public AbstractYUnitClass(Integer unitClassSetId, Integer unitParentClassId, Integer accountActId, String unitClassName, Integer unitClassTotal, Integer unitClassOrder, Integer unitClassTopOrder, Integer isDelete, String unitClassTime) {
		this.unitClassSetId = unitClassSetId;
		this.unitParentClassId = unitParentClassId;
		this.accountActId = accountActId;
		this.unitClassName = unitClassName;
		this.unitClassTotal = unitClassTotal;
		this.unitClassOrder = unitClassOrder;
		this.unitClassTopOrder = unitClassTopOrder;
		this.isDelete = isDelete;
		this.unitClassTime = unitClassTime;
	}

	// Property accessors

	public Integer getUnitClassId() {
		return this.unitClassId;
	}

	public void setUnitClassId(Integer unitClassId) {
		this.unitClassId = unitClassId;
	}

	public Integer getUnitClassSetId() {
		return this.unitClassSetId;
	}

	public void setUnitClassSetId(Integer unitClassSetId) {
		this.unitClassSetId = unitClassSetId;
	}

	public Integer getUnitParentClassId() {
		return this.unitParentClassId;
	}

	public void setUnitParentClassId(Integer unitParentClassId) {
		this.unitParentClassId = unitParentClassId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getUnitClassName() {
		return this.unitClassName;
	}

	public void setUnitClassName(String unitClassName) {
		this.unitClassName = unitClassName;
	}

	public Integer getUnitClassTotal() {
		return this.unitClassTotal;
	}

	public void setUnitClassTotal(Integer unitClassTotal) {
		this.unitClassTotal = unitClassTotal;
	}

	public Integer getUnitClassOrder() {
		return this.unitClassOrder;
	}

	public void setUnitClassOrder(Integer unitClassOrder) {
		this.unitClassOrder = unitClassOrder;
	}

	public Integer getUnitClassTopOrder() {
		return this.unitClassTopOrder;
	}

	public void setUnitClassTopOrder(Integer unitClassTopOrder) {
		this.unitClassTopOrder = unitClassTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getUnitClassTime() {
		return this.unitClassTime;
	}

	public void setUnitClassTime(String unitClassTime) {
		this.unitClassTime = unitClassTime;
	}

}