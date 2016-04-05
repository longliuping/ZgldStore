package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYLeaderClass entity provides the base persistence definition of the
 * YLeaderClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYLeaderClass implements java.io.Serializable {

	// Fields

	private Integer leaderClassId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer leaderParentClassId;
	private Integer leaderClassSetId;
	private String leaderClassName;
	private Integer leaderClassOrder;
	private Integer leaderClassTopOrder;
	private Integer isDelete;
	private String leaderClassTime;

	// Constructors

	/** default constructor */
	public AbstractYLeaderClass() {
	}

	/** minimal constructor */
	public AbstractYLeaderClass(String leaderClassTime) {
		this.leaderClassTime = leaderClassTime;
	}

	/** full constructor */
	public AbstractYLeaderClass(Integer unitSetId, Integer accountActId, Integer leaderParentClassId, Integer leaderClassSetId, String leaderClassName, Integer leaderClassOrder, Integer leaderClassTopOrder, Integer isDelete, String leaderClassTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.leaderParentClassId = leaderParentClassId;
		this.leaderClassSetId = leaderClassSetId;
		this.leaderClassName = leaderClassName;
		this.leaderClassOrder = leaderClassOrder;
		this.leaderClassTopOrder = leaderClassTopOrder;
		this.isDelete = isDelete;
		this.leaderClassTime = leaderClassTime;
	}

	// Property accessors

	public Integer getLeaderClassId() {
		return this.leaderClassId;
	}

	public void setLeaderClassId(Integer leaderClassId) {
		this.leaderClassId = leaderClassId;
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

	public Integer getLeaderParentClassId() {
		return this.leaderParentClassId;
	}

	public void setLeaderParentClassId(Integer leaderParentClassId) {
		this.leaderParentClassId = leaderParentClassId;
	}

	public Integer getLeaderClassSetId() {
		return this.leaderClassSetId;
	}

	public void setLeaderClassSetId(Integer leaderClassSetId) {
		this.leaderClassSetId = leaderClassSetId;
	}

	public String getLeaderClassName() {
		return this.leaderClassName;
	}

	public void setLeaderClassName(String leaderClassName) {
		this.leaderClassName = leaderClassName;
	}

	public Integer getLeaderClassOrder() {
		return this.leaderClassOrder;
	}

	public void setLeaderClassOrder(Integer leaderClassOrder) {
		this.leaderClassOrder = leaderClassOrder;
	}

	public Integer getLeaderClassTopOrder() {
		return this.leaderClassTopOrder;
	}

	public void setLeaderClassTopOrder(Integer leaderClassTopOrder) {
		this.leaderClassTopOrder = leaderClassTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getLeaderClassTime() {
		return this.leaderClassTime;
	}

	public void setLeaderClassTime(String leaderClassTime) {
		this.leaderClassTime = leaderClassTime;
	}

}