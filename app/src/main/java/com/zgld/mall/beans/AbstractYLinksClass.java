package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYLinksClass entity provides the base persistence definition of the
 * YLinksClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYLinksClass implements java.io.Serializable {

	// Fields

	private Integer liClassId;
	private Integer liParentClassId;
	private Integer liClassSetId;
	private String liClassName;
	private Integer liClassTotal;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer liClassOrder;
	private Integer liClassTopOrder;
	private Integer isDelete;
	private String liClassTime;

	// Constructors

	/** default constructor */
	public AbstractYLinksClass() {
	}

	/** minimal constructor */
	public AbstractYLinksClass(String liClassTime) {
		this.liClassTime = liClassTime;
	}

	/** full constructor */
	public AbstractYLinksClass(Integer liParentClassId, Integer liClassSetId, String liClassName, Integer liClassTotal, Integer unitSetId, Integer accountActId, Integer liClassOrder, Integer liClassTopOrder, Integer isDelete, String liClassTime) {
		this.liParentClassId = liParentClassId;
		this.liClassSetId = liClassSetId;
		this.liClassName = liClassName;
		this.liClassTotal = liClassTotal;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.liClassOrder = liClassOrder;
		this.liClassTopOrder = liClassTopOrder;
		this.isDelete = isDelete;
		this.liClassTime = liClassTime;
	}

	// Property accessors

	public Integer getLiClassId() {
		return this.liClassId;
	}

	public void setLiClassId(Integer liClassId) {
		this.liClassId = liClassId;
	}

	public Integer getLiParentClassId() {
		return this.liParentClassId;
	}

	public void setLiParentClassId(Integer liParentClassId) {
		this.liParentClassId = liParentClassId;
	}

	public Integer getLiClassSetId() {
		return this.liClassSetId;
	}

	public void setLiClassSetId(Integer liClassSetId) {
		this.liClassSetId = liClassSetId;
	}

	public String getLiClassName() {
		return this.liClassName;
	}

	public void setLiClassName(String liClassName) {
		this.liClassName = liClassName;
	}

	public Integer getLiClassTotal() {
		return this.liClassTotal;
	}

	public void setLiClassTotal(Integer liClassTotal) {
		this.liClassTotal = liClassTotal;
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

	public Integer getLiClassOrder() {
		return this.liClassOrder;
	}

	public void setLiClassOrder(Integer liClassOrder) {
		this.liClassOrder = liClassOrder;
	}

	public Integer getLiClassTopOrder() {
		return this.liClassTopOrder;
	}

	public void setLiClassTopOrder(Integer liClassTopOrder) {
		this.liClassTopOrder = liClassTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getLiClassTime() {
		return this.liClassTime;
	}

	public void setLiClassTime(String liClassTime) {
		this.liClassTime = liClassTime;
	}

}