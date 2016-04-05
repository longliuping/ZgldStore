package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYNotice entity provides the base persistence definition of the
 * YNotice entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYNotice implements java.io.Serializable {

	// Fields

	private Integer noId;
	private Integer noClassSetId;
	private Integer noType;
	private Integer noState;
	private Integer unitSetId;
	private Integer accountActId;
	private String noTitle;
	private String noContent;
	private Integer noOrder;
	private Integer noTopOrder;
	private Integer isDelete;
	private String noTime;

	// Constructors

	/** default constructor */
	public AbstractYNotice() {
	}

	/** minimal constructor */
	public AbstractYNotice(String noTime) {
		this.noTime = noTime;
	}

	/** full constructor */
	public AbstractYNotice(Integer noClassSetId, Integer noType, Integer noState, Integer unitSetId, Integer accountActId, String noTitle, String noContent, Integer noOrder, Integer noTopOrder, Integer isDelete, String noTime) {
		this.noClassSetId = noClassSetId;
		this.noType = noType;
		this.noState = noState;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.noTitle = noTitle;
		this.noContent = noContent;
		this.noOrder = noOrder;
		this.noTopOrder = noTopOrder;
		this.isDelete = isDelete;
		this.noTime = noTime;
	}

	// Property accessors

	public Integer getNoId() {
		return this.noId;
	}

	public void setNoId(Integer noId) {
		this.noId = noId;
	}

	public Integer getNoClassSetId() {
		return this.noClassSetId;
	}

	public void setNoClassSetId(Integer noClassSetId) {
		this.noClassSetId = noClassSetId;
	}

	public Integer getNoType() {
		return this.noType;
	}

	public void setNoType(Integer noType) {
		this.noType = noType;
	}

	public Integer getNoState() {
		return this.noState;
	}

	public void setNoState(Integer noState) {
		this.noState = noState;
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

	public String getNoTitle() {
		return this.noTitle;
	}

	public void setNoTitle(String noTitle) {
		this.noTitle = noTitle;
	}

	public String getNoContent() {
		return this.noContent;
	}

	public void setNoContent(String noContent) {
		this.noContent = noContent;
	}

	public Integer getNoOrder() {
		return this.noOrder;
	}

	public void setNoOrder(Integer noOrder) {
		this.noOrder = noOrder;
	}

	public Integer getNoTopOrder() {
		return this.noTopOrder;
	}

	public void setNoTopOrder(Integer noTopOrder) {
		this.noTopOrder = noTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getNoTime() {
		return this.noTime;
	}

	public void setNoTime(String noTime) {
		this.noTime = noTime;
	}

}