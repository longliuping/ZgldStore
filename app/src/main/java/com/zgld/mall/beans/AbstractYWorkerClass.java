package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYWorkerClass entity provides the base persistence definition of the
 * YWorkerClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYWorkerClass implements java.io.Serializable {

	// Fields

	private Integer workerClassId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer workerParentClassId;
	private Integer workerClassSetId;
	private String workerClassName;
	private Integer workerClassOrder;
	private Integer workerClassTopOrder;
	private Integer isDelete;
	private String workerClassTime;

	// Constructors

	/** default constructor */
	public AbstractYWorkerClass() {
	}

	/** minimal constructor */
	public AbstractYWorkerClass(String workerClassTime) {
		this.workerClassTime = workerClassTime;
	}

	/** full constructor */
	public AbstractYWorkerClass(Integer unitSetId, Integer accountActId, Integer workerParentClassId, Integer workerClassSetId, String workerClassName, Integer workerClassOrder, Integer workerClassTopOrder, Integer isDelete, String workerClassTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.workerParentClassId = workerParentClassId;
		this.workerClassSetId = workerClassSetId;
		this.workerClassName = workerClassName;
		this.workerClassOrder = workerClassOrder;
		this.workerClassTopOrder = workerClassTopOrder;
		this.isDelete = isDelete;
		this.workerClassTime = workerClassTime;
	}

	// Property accessors

	public Integer getWorkerClassId() {
		return this.workerClassId;
	}

	public void setWorkerClassId(Integer workerClassId) {
		this.workerClassId = workerClassId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getWorkerParentClassId() {
		return this.workerParentClassId;
	}

	public void setWorkerParentClassId(Integer workerParentClassId) {
		this.workerParentClassId = workerParentClassId;
	}

	public Integer getWorkerClassSetId() {
		return this.workerClassSetId;
	}

	public void setWorkerClassSetId(Integer workerClassSetId) {
		this.workerClassSetId = workerClassSetId;
	}

	public String getWorkerClassName() {
		return this.workerClassName;
	}

	public void setWorkerClassName(String workerClassName) {
		this.workerClassName = workerClassName;
	}

	public Integer getWorkerClassOrder() {
		return this.workerClassOrder;
	}

	public void setWorkerClassOrder(Integer workerClassOrder) {
		this.workerClassOrder = workerClassOrder;
	}

	public Integer getWorkerClassTopOrder() {
		return this.workerClassTopOrder;
	}

	public void setWorkerClassTopOrder(Integer workerClassTopOrder) {
		this.workerClassTopOrder = workerClassTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getWorkerClassTime() {
		return this.workerClassTime;
	}

	public void setWorkerClassTime(String workerClassTime) {
		this.workerClassTime = workerClassTime;
	}

}