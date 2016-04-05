package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoodsScan entity provides the base persistence definition of the
 * YGoodsScan entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsScan implements java.io.Serializable {

	// Fields

	private Integer goScanId;
	private Integer goId;
	private Integer accountActId;
	private String goScanTime;

	// Constructors

	/** default constructor */
	public AbstractYGoodsScan() {
	}

	/** minimal constructor */
	public AbstractYGoodsScan(String goScanTime) {
		this.goScanTime = goScanTime;
	}

	/** full constructor */
	public AbstractYGoodsScan(Integer goId, Integer accountActId, String goScanTime) {
		this.goId = goId;
		this.accountActId = accountActId;
		this.goScanTime = goScanTime;
	}

	// Property accessors

	public Integer getGoScanId() {
		return this.goScanId;
	}

	public void setGoScanId(Integer goScanId) {
		this.goScanId = goScanId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getGoScanTime() {
		return this.goScanTime;
	}

	public void setGoScanTime(String goScanTime) {
		this.goScanTime = goScanTime;
	}

}