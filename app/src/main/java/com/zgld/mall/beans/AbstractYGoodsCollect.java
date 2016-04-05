package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoodsCollect entity provides the base persistence definition of the
 * YGoodsCollect entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsCollect implements java.io.Serializable {

	// Fields

	private Integer goCollectId;
	private Integer accountActId;
	private Integer goId;
	private String goCollectTime;

	// Constructors

	/** default constructor */
	public AbstractYGoodsCollect() {
	}

	/** minimal constructor */
	public AbstractYGoodsCollect(String goCollectTime) {
		this.goCollectTime = goCollectTime;
	}

	/** full constructor */
	public AbstractYGoodsCollect(Integer accountActId, Integer goId, String goCollectTime) {
		this.accountActId = accountActId;
		this.goId = goId;
		this.goCollectTime = goCollectTime;
	}

	// Property accessors

	public Integer getGoCollectId() {
		return this.goCollectId;
	}

	public void setGoCollectId(Integer goCollectId) {
		this.goCollectId = goCollectId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public String getGoCollectTime() {
		return this.goCollectTime;
	}

	public void setGoCollectTime(String goCollectTime) {
		this.goCollectTime = goCollectTime;
	}

}