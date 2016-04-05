package com.zgld.mall.beans;

/**
 * YFormCombineValue entity. @author MyEclipse Persistence Tools
 */
public class YFormCombineValue extends AbstractYFormCombineValue implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormCombineValue() {
	}

	/** minimal constructor */
	public YFormCombineValue(Integer goStore, Double goBidPrice, Double goSalePrice) {
		super(goStore, goBidPrice, goSalePrice);
	}

	/** full constructor */
	public YFormCombineValue(String conbineFieldName, String tableName, Integer objId, Integer goStore, Double goBidPrice, Double goSalePrice) {
		super(conbineFieldName, tableName, objId, goStore, goBidPrice, goSalePrice);
	}

}
