package com.zgld.mall.beans;

/**
 * AbstractAliPayConfig entity provides the base persistence definition of the
 * AliPayConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAliPayConfig implements java.io.Serializable {

	// Fields

	private Integer payId;
	private Integer payTypeId;

	// Constructors

	/** default constructor */
	public AbstractAliPayConfig() {
	}

	/** full constructor */
	public AbstractAliPayConfig(Integer payTypeId) {
		this.payTypeId = payTypeId;
	}

	// Property accessors

	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public Integer getPayTypeId() {
		return this.payTypeId;
	}

	public void setPayTypeId(Integer payTypeId) {
		this.payTypeId = payTypeId;
	}

}