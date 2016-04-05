package com.zgld.mall.beans;

/**
 * AbstractPayType entity provides the base persistence definition of the
 * PayType entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPayType implements java.io.Serializable {

	// Fields

	private Integer payTypeId;
	private String payTypeName;
	private String payTypeLogo;

	// Constructors

	/** default constructor */
	public AbstractPayType() {
	}

	/** full constructor */
	public AbstractPayType(String payTypeName, String payTypeLogo) {
		this.payTypeName = payTypeName;
		this.payTypeLogo = payTypeLogo;
	}

	// Property accessors

	public Integer getPayTypeId() {
		return this.payTypeId;
	}

	public void setPayTypeId(Integer payTypeId) {
		this.payTypeId = payTypeId;
	}

	public String getPayTypeName() {
		return this.payTypeName;
	}

	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}

	public String getPayTypeLogo() {
		return this.payTypeLogo;
	}

	public void setPayTypeLogo(String payTypeLogo) {
		this.payTypeLogo = payTypeLogo;
	}

}