package com.zgld.mall.beans;

/**
 * YFormCombine entity. @author MyEclipse Persistence Tools
 */
public class YFormCombine extends AbstractYFormCombine implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormCombine() {
	}

	/** full constructor */
	public YFormCombine(String conbineFieldName, String tableName, Integer objId, String fieldName, String controlName, String controlValue) {
		super(conbineFieldName, tableName, objId, fieldName, controlName, controlValue);
	}

}
