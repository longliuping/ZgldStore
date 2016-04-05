package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYArticleComment entity provides the base persistence definition of
 * the YArticleComment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArticleComment implements java.io.Serializable {

	// Fields

	private Integer arCommentId;
	private Integer arId;
	private Integer unitSetId;
	private Integer accountActId;
	private String arCommentContent;
	private Integer arCommentOrder;
	private Integer arCommentTopOrder;
	private Integer isDelete;
	private String arCommentTime;

	// Constructors

	/** default constructor */
	public AbstractYArticleComment() {
	}

	/** minimal constructor */
	public AbstractYArticleComment(String arCommentTime) {
		this.arCommentTime = arCommentTime;
	}

	/** full constructor */
	public AbstractYArticleComment(Integer arId, Integer unitSetId, Integer accountActId, String arCommentContent, Integer arCommentOrder, Integer arCommentTopOrder, Integer isDelete, String arCommentTime) {
		this.arId = arId;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.arCommentContent = arCommentContent;
		this.arCommentOrder = arCommentOrder;
		this.arCommentTopOrder = arCommentTopOrder;
		this.isDelete = isDelete;
		this.arCommentTime = arCommentTime;
	}

	// Property accessors

	public Integer getArCommentId() {
		return this.arCommentId;
	}

	public void setArCommentId(Integer arCommentId) {
		this.arCommentId = arCommentId;
	}

	public Integer getArId() {
		return this.arId;
	}

	public void setArId(Integer arId) {
		this.arId = arId;
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

	public String getArCommentContent() {
		return this.arCommentContent;
	}

	public void setArCommentContent(String arCommentContent) {
		this.arCommentContent = arCommentContent;
	}

	public Integer getArCommentOrder() {
		return this.arCommentOrder;
	}

	public void setArCommentOrder(Integer arCommentOrder) {
		this.arCommentOrder = arCommentOrder;
	}

	public Integer getArCommentTopOrder() {
		return this.arCommentTopOrder;
	}

	public void setArCommentTopOrder(Integer arCommentTopOrder) {
		this.arCommentTopOrder = arCommentTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getArCommentTime() {
		return this.arCommentTime;
	}

	public void setArCommentTime(String arCommentTime) {
		this.arCommentTime = arCommentTime;
	}

}