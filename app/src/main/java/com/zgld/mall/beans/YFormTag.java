package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YFormTag entity. @author MyEclipse Persistence Tools
 */
public class YFormTag extends AbstractYFormTag implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormTag() {
	}

	/** minimal constructor */
	public YFormTag(String tagTime) {
		super(tagTime);
	}

	/** full constructor */
	public YFormTag(Integer formId, String tagName, String tagType, Integer isCombine, Integer isDisabled, Integer isNull, Integer isValidate, String validateType, String fieldName, String tagUnit, String tagPlaceholder, Integer isDelete, String tagTime) {
		super(formId, tagName, tagType, isCombine, isDisabled, isNull, isValidate, validateType, fieldName, tagUnit, tagPlaceholder, isDelete, tagTime);
	}

}
