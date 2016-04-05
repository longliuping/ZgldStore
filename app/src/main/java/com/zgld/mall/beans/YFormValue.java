package com.zgld.mall.beans;

/**
 * YFormValue entity. @author MyEclipse Persistence Tools
 */
public class YFormValue extends AbstractYFormValue implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormValue() {
	}

	/** minimal constructor */
	public YFormValue(String controlValue) {
		super(controlValue);
	}

	/** full constructor */
	public YFormValue(Integer tagId, Integer objId, String tableName, Integer tagType, String fieldName, String controlValue) {
		super(tagId, objId, tableName, tagType, fieldName, controlValue);
	}

}
