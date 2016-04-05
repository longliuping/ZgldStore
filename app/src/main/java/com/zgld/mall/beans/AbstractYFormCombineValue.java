package com.zgld.mall.beans;

/**
 * AbstractYFormCombineValue entity provides the base persistence definition of
 * the YFormCombineValue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormCombineValue implements java.io.Serializable {

	// Fields

	private Integer combineValueId;
	private String conbineFieldName;
	private String tableName;
	private Integer objId;
	private Integer goStore;
	private Double goBidPrice;
	private Double goSalePrice;

	// Constructors

	/** default constructor */
	public AbstractYFormCombineValue() {
	}

	/** minimal constructor */
	public AbstractYFormCombineValue(Integer goStore, Double goBidPrice, Double goSalePrice) {
		this.goStore = goStore;
		this.goBidPrice = goBidPrice;
		this.goSalePrice = goSalePrice;
	}

	/** full constructor */
	public AbstractYFormCombineValue(String conbineFieldName, String tableName, Integer objId, Integer goStore, Double goBidPrice, Double goSalePrice) {
		this.conbineFieldName = conbineFieldName;
		this.tableName = tableName;
		this.objId = objId;
		this.goStore = goStore;
		this.goBidPrice = goBidPrice;
		this.goSalePrice = goSalePrice;
	}

	// Property accessors

	public Integer getCombineValueId() {
		return this.combineValueId;
	}

	public void setCombineValueId(Integer combineValueId) {
		this.combineValueId = combineValueId;
	}

	public String getConbineFieldName() {
		return this.conbineFieldName;
	}

	public void setConbineFieldName(String conbineFieldName) {
		this.conbineFieldName = conbineFieldName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getObjId() {
		return this.objId;
	}

	public void setObjId(Integer objId) {
		this.objId = objId;
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