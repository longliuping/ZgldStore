package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYSearchLabel entity provides the base persistence definition of the
 * YSearchLabel entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYSearchLabel implements java.io.Serializable {

	// Fields

	private Integer labelId;
	private Integer accountActId;
	private String labelTitle;
	private Integer labelHits;
	private Integer isShow;
	private String labelTime;

	// Constructors

	/** default constructor */
	public AbstractYSearchLabel() {
	}

	/** minimal constructor */
	public AbstractYSearchLabel(String labelTime) {
		this.labelTime = labelTime;
	}

	/** full constructor */
	public AbstractYSearchLabel(Integer accountActId, String labelTitle, Integer labelHits, Integer isShow, String labelTime) {
		this.accountActId = accountActId;
		this.labelTitle = labelTitle;
		this.labelHits = labelHits;
		this.isShow = isShow;
		this.labelTime = labelTime;
	}

	// Property accessors

	public Integer getLabelId() {
		return this.labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getLabelTitle() {
		return this.labelTitle;
	}

	public void setLabelTitle(String labelTitle) {
		this.labelTitle = labelTitle;
	}

	public Integer getLabelHits() {
		return this.labelHits;
	}

	public void setLabelHits(Integer labelHits) {
		this.labelHits = labelHits;
	}

	public Integer getIsShow() {
		return this.isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public String getLabelTime() {
		return this.labelTime;
	}

	public void setLabelTime(String labelTime) {
		this.labelTime = labelTime;
	}

}