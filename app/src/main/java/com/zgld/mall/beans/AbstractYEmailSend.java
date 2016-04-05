package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYEmailSend entity provides the base persistence definition of the
 * YEmailSend entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYEmailSend implements java.io.Serializable {

	// Fields

	private Integer emailSendId;
	private Integer accountActId;
	private Integer unitSetId;
	private Integer emailSendType;
	private String emailSendTitle;
	private String emailSendContent;
	private Integer emailOrder;
	private Integer emailTopOrder;
	private Integer isDelete;
	private String emailSendTime;

	// Constructors

	/** default constructor */
	public AbstractYEmailSend() {
	}

	/** minimal constructor */
	public AbstractYEmailSend(String emailSendTime) {
		this.emailSendTime = emailSendTime;
	}

	/** full constructor */
	public AbstractYEmailSend(Integer accountActId, Integer unitSetId, Integer emailSendType, String emailSendTitle, String emailSendContent, Integer emailOrder, Integer emailTopOrder, Integer isDelete, String emailSendTime) {
		this.accountActId = accountActId;
		this.unitSetId = unitSetId;
		this.emailSendType = emailSendType;
		this.emailSendTitle = emailSendTitle;
		this.emailSendContent = emailSendContent;
		this.emailOrder = emailOrder;
		this.emailTopOrder = emailTopOrder;
		this.isDelete = isDelete;
		this.emailSendTime = emailSendTime;
	}

	// Property accessors

	public Integer getEmailSendId() {
		return this.emailSendId;
	}

	public void setEmailSendId(Integer emailSendId) {
		this.emailSendId = emailSendId;
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

	public Integer getEmailSendType() {
		return this.emailSendType;
	}

	public void setEmailSendType(Integer emailSendType) {
		this.emailSendType = emailSendType;
	}

	public String getEmailSendTitle() {
		return this.emailSendTitle;
	}

	public void setEmailSendTitle(String emailSendTitle) {
		this.emailSendTitle = emailSendTitle;
	}

	public String getEmailSendContent() {
		return this.emailSendContent;
	}

	public void setEmailSendContent(String emailSendContent) {
		this.emailSendContent = emailSendContent;
	}

	public Integer getEmailOrder() {
		return this.emailOrder;
	}

	public void setEmailOrder(Integer emailOrder) {
		this.emailOrder = emailOrder;
	}

	public Integer getEmailTopOrder() {
		return this.emailTopOrder;
	}

	public void setEmailTopOrder(Integer emailTopOrder) {
		this.emailTopOrder = emailTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getEmailSendTime() {
		return this.emailSendTime;
	}

	public void setEmailSendTime(String emailSendTime) {
		this.emailSendTime = emailSendTime;
	}

}