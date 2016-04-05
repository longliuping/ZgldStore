package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractOrderLeaveWords entity provides the base persistence definition of
 * the OrderLeaveWords entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderLeaveWords implements java.io.Serializable {

	// Fields

	private Integer leaveId;
	private Integer orderId;
	private String publishContent;
	private Integer userId;
	private String publishDate;
	private Integer isAgentVisited;
	private Integer isMemberVisited;
	private Integer isadminVisited;

	// Constructors

	/** default constructor */
	public AbstractOrderLeaveWords() {
	}

	/** full constructor */
	public AbstractOrderLeaveWords(Integer orderId, String publishContent, Integer userId, String publishDate, Integer isAgentVisited, Integer isMemberVisited, Integer isadminVisited) {
		this.orderId = orderId;
		this.publishContent = publishContent;
		this.userId = userId;
		this.publishDate = publishDate;
		this.isAgentVisited = isAgentVisited;
		this.isMemberVisited = isMemberVisited;
		this.isadminVisited = isadminVisited;
	}

	// Property accessors

	public Integer getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getPublishContent() {
		return this.publishContent;
	}

	public void setPublishContent(String publishContent) {
		this.publishContent = publishContent;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getIsAgentVisited() {
		return this.isAgentVisited;
	}

	public void setIsAgentVisited(Integer isAgentVisited) {
		this.isAgentVisited = isAgentVisited;
	}

	public Integer getIsMemberVisited() {
		return this.isMemberVisited;
	}

	public void setIsMemberVisited(Integer isMemberVisited) {
		this.isMemberVisited = isMemberVisited;
	}

	public Integer getIsadminVisited() {
		return this.isadminVisited;
	}

	public void setIsadminVisited(Integer isadminVisited) {
		this.isadminVisited = isadminVisited;
	}

}