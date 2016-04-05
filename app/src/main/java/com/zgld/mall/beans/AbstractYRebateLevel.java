package com.zgld.mall.beans;

/**
 * AbstractYRebateLevel entity provides the base persistence definition of the
 * YRebateLevel entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRebateLevel implements java.io.Serializable {

	// Fields

	private Integer rebateLevelId;
	private Integer rebateLevel;
	private Double rebatePercent;

	// Constructors

	/** default constructor */
	public AbstractYRebateLevel() {
	}

	/** full constructor */
	public AbstractYRebateLevel(Integer rebateLevel, Double rebatePercent) {
		this.rebateLevel = rebateLevel;
		this.rebatePercent = rebatePercent;
	}

	// Property accessors

	public Integer getRebateLevelId() {
		return this.rebateLevelId;
	}

	public void setRebateLevelId(Integer rebateLevelId) {
		this.rebateLevelId = rebateLevelId;
	}

	public Integer getRebateLevel() {
		return this.rebateLevel;
	}

	public void setRebateLevel(Integer rebateLevel) {
		this.rebateLevel = rebateLevel;
	}

	public Double getRebatePercent() {
		return this.rebatePercent;
	}

	public void setRebatePercent(Double rebatePercent) {
		this.rebatePercent = rebatePercent;
	}

}