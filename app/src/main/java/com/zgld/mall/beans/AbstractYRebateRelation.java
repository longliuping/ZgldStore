package com.zgld.mall.beans;

/**
 * AbstractYRebateRelation entity provides the base persistence definition of
 * the YRebateRelation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRebateRelation implements java.io.Serializable {

	// Fields

	private Integer rebateRelationId;
	private Integer parentUserId;
	private Integer currentUserId;

	// Constructors

	/** default constructor */
	public AbstractYRebateRelation() {
	}

	/** full constructor */
	public AbstractYRebateRelation(Integer parentUserId, Integer currentUserId) {
		this.parentUserId = parentUserId;
		this.currentUserId = currentUserId;
	}

	// Property accessors

	public Integer getRebateRelationId() {
		return this.rebateRelationId;
	}

	public void setRebateRelationId(Integer rebateRelationId) {
		this.rebateRelationId = rebateRelationId;
	}

	public Integer getParentUserId() {
		return this.parentUserId;
	}

	public void setParentUserId(Integer parentUserId) {
		this.parentUserId = parentUserId;
	}

	public Integer getCurrentUserId() {
		return this.currentUserId;
	}

	public void setCurrentUserId(Integer currentUserId) {
		this.currentUserId = currentUserId;
	}

}