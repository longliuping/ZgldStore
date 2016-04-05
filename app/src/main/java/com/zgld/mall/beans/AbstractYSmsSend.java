package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYSmsSend entity provides the base persistence definition of the
 * YSmsSend entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYSmsSend implements java.io.Serializable {

	// Fields

	private Integer smsSendId;
	private Integer accountActId;
	private Integer unitSetId;
	private Integer smsSendType;
	private String smsSendTitle;
	private String smsSendContent;
	private Integer smsOrder;
	private Integer smsTopOrder;
	private Integer isDelete;
	private String smsSendTime;

	// Constructors

	/** default constructor */
	public AbstractYSmsSend() {
	}

	/** minimal constructor */
	public AbstractYSmsSend(String smsSendTime) {
		this.smsSendTime = smsSendTime;
	}

	/** full constructor */
	public AbstractYSmsSend(Integer accountActId, Integer unitSetId, Integer smsSendType, String smsSendTitle, String smsSendContent, Integer smsOrder, Integer smsTopOrder, Integer isDelete, String smsSendTime) {
		this.accountActId = accountActId;
		this.unitSetId = unitSetId;
		this.smsSendType = smsSendType;
		this.smsSendTitle = smsSendTitle;
		this.smsSendContent = smsSendContent;
		this.smsOrder = smsOrder;
		this.smsTopOrder = smsTopOrder;
		this.isDelete = isDelete;
		this.smsSendTime = smsSendTime;
	}

	// Property accessors

	public Integer getSmsSendId() {
		return this.smsSendId;
	}

	public void setSmsSendId(Integer smsSendId) {
		this.smsSendId = smsSendId;
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

	public Integer getSmsSendType() {
		return this.smsSendType;
	}

	public void setSmsSendType(Integer smsSendType) {
		this.smsSendType = smsSendType;
	}

	public String getSmsSendTitle() {
		return this.smsSendTitle;
	}

	public void setSmsSendTitle(String smsSendTitle) {
		this.smsSendTitle = smsSendTitle;
	}

	public String getSmsSendContent() {
		return this.smsSendContent;
	}

	public void setSmsSendContent(String smsSendContent) {
		this.smsSendContent = smsSendContent;
	}

	public Integer getSmsOrder() {
		return this.smsOrder;
	}

	public void setSmsOrder(Integer smsOrder) {
		this.smsOrder = smsOrder;
	}

	public Integer getSmsTopOrder() {
		return this.smsTopOrder;
	}

	public void setSmsTopOrder(Integer smsTopOrder) {
		this.smsTopOrder = smsTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getSmsSendTime() {
		return this.smsSendTime;
	}

	public void setSmsSendTime(String smsSendTime) {
		this.smsSendTime = smsSendTime;
	}

}