package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYDns entity provides the base persistence definition of the YDns
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYDns implements java.io.Serializable {

	// Fields

	private Integer dnsId;
	private Integer accountActId;
	private Integer unitSetId;
	private Integer dnsType;
	private String dnsName;
	private Integer isState;
	private Integer isDelete;
	private String dnsTime;

	// Constructors

	/** default constructor */
	public AbstractYDns() {
	}

	/** minimal constructor */
	public AbstractYDns(String dnsTime) {
		this.dnsTime = dnsTime;
	}

	/** full constructor */
	public AbstractYDns(Integer accountActId, Integer unitSetId, Integer dnsType, String dnsName, Integer isState, Integer isDelete, String dnsTime) {
		this.accountActId = accountActId;
		this.unitSetId = unitSetId;
		this.dnsType = dnsType;
		this.dnsName = dnsName;
		this.isState = isState;
		this.isDelete = isDelete;
		this.dnsTime = dnsTime;
	}

	// Property accessors

	public Integer getDnsId() {
		return this.dnsId;
	}

	public void setDnsId(Integer dnsId) {
		this.dnsId = dnsId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getDnsType() {
		return this.dnsType;
	}

	public void setDnsType(Integer dnsType) {
		this.dnsType = dnsType;
	}

	public String getDnsName() {
		return this.dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}

	public Integer getIsState() {
		return this.isState;
	}

	public void setIsState(Integer isState) {
		this.isState = isState;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getDnsTime() {
		return this.dnsTime;
	}

	public void setDnsTime(String dnsTime) {
		this.dnsTime = dnsTime;
	}

}