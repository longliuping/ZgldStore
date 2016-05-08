package com.zgld.mall.beans;

/**
 * AbstractYFormCombineValue entity provides the base persistence definition of
 * the YFormCombineValue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormCombineValue implements java.io.Serializable {
// Fields

	private Integer combineValueId;
	private String combineString;
	private Integer objId;
	private String objTable;
	private Integer goStore;
	private Double goBidPrice;
	private Double goSalePrice;

	// Constructors

	/** default constructor */
	public AbstractYFormCombineValue() {
	}

	// Property accessors

	public Integer getCombineValueId() {
		return this.combineValueId;
	}

	public void setCombineValueId(Integer combineValueId) {
		this.combineValueId = combineValueId;
	}

	public String getCombineString() {
		return this.combineString;
	}

	public void setCombineString(String combineString) {
		this.combineString = combineString;
	}

	public Integer getObjId() {
		return this.objId;
	}

	public void setObjId(Integer objId) {
		this.objId = objId;
	}

	public String getObjTable() {
		return this.objTable;
	}

	public void setObjTable(String objTable) {
		this.objTable = objTable;
	}

	public Integer getGoStore() {
		return this.goStore;
	}

	public void setGoStore(Integer goStore) {
		this.goStore = goStore;
	}

	public Double getGoBidPrice() {
		return this.goBidPrice;
	}

	public void setGoBidPrice(Double goBidPrice) {
		this.goBidPrice = goBidPrice;
	}

	public Double getGoSalePrice() {
		return this.goSalePrice;
	}

	public void setGoSalePrice(Double goSalePrice) {
		this.goSalePrice = goSalePrice;
	}

}