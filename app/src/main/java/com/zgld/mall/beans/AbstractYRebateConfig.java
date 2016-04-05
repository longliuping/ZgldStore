package com.zgld.mall.beans;

/**
 * AbstractYRebateConfig entity provides the base persistence definition of the
 * YRebateConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRebateConfig implements java.io.Serializable {

	// Fields

	private Integer rebateConfigId;
	private Double rebateOrderPercent;
	private Double rebatePlatPercent;

	// Constructors

	/** default constructor */
	public AbstractYRebateConfig() {
	}

	/** full constructor */
	public AbstractYRebateConfig(Double rebateOrderPercent, Double rebatePlatPercent) {
		this.rebateOrderPercent = rebateOrderPercent;
		this.rebatePlatPercent = rebatePlatPercent;
	}

	// Property accessors

	public Integer getRebateConfigId() {
		return this.rebateConfigId;
	}

	public void setRebateConfigId(Integer rebateConfigId) {
		this.rebateConfigId = rebateConfigId;
	}

	public Double getRebateOrderPercent() {
		return this.rebateOrderPercent;
	}

	public void setRebateOrderPercent(Double rebateOrderPercent) {
		this.rebateOrderPercent = rebateOrderPercent;
	}

	public Double getRebatePlatPercent() {
		return this.rebatePlatPercent;
	}

	public void setRebatePlatPercent(Double rebatePlatPercent) {
		this.rebatePlatPercent = rebatePlatPercent;
	}

}