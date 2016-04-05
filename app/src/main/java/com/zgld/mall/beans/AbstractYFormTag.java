package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYFormTag entity provides the base persistence definition of the
 * YFormTag entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormTag implements java.io.Serializable {

	// Fields

	private Integer tagId;
	private Integer formId;
	private String tagName;
	private String tagType;
	private Integer isCombine;
	private Integer isDisabled;
	private Integer isNull;
	private Integer isValidate;
	private String validateType;
	private String fieldName;
	private String tagUnit;
	private String tagPlaceholder;
	private Integer isDelete;
	private String tagTime;

	// Constructors

	/** default constructor */
	public AbstractYFormTag() {
	}

	/** minimal constructor */
	public AbstractYFormTag(String tagTime) {
		this.tagTime = tagTime;
	}

	/** full constructor */
	public AbstractYFormTag(Integer formId, String tagName, String tagType, Integer isCombine, Integer isDisabled, Integer isNull, Integer isValidate, String validateType, String fieldName, String tagUnit, String tagPlaceholder, Integer isDelete, String tagTime) {
		this.formId = formId;
		this.tagName = tagName;
		this.tagType = tagType;
		this.isCombine = isCombine;
		this.isDisabled = isDisabled;
		this.isNull = isNull;
		this.isValidate = isValidate;
		this.validateType = validateType;
		this.fieldName = fieldName;
		this.tagUnit = tagUnit;
		this.tagPlaceholder = tagPlaceholder;
		this.isDelete = isDelete;
		this.tagTime = tagTime;
	}

	// Property accessors

	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public Integer getFormId() {
		return this.formId;
	}

	public void setFormId(Integer formId) {
		this.formId = formId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagType() {
		return this.tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public Integer getIsCombine() {
		return this.isCombine;
	}

	public void setIsCombine(Integer isCombine) {
		this.isCombine = isCombine;
	}

	public Integer getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Integer isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Integer getIsNull() {
		return this.isNull;
	}

	public void setIsNull(Integer isNull) {
		this.isNull = isNull;
	}

	public Integer getIsValidate() {
		return this.isValidate;
	}

	public void setIsValidate(Integer isValidate) {
		this.isValidate = isValidate;
	}

	public String getValidateType() {
		return this.validateType;
	}

	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getTagUnit() {
		return this.tagUnit;
	}

	public void setTagUnit(String tagUnit) {
		this.tagUnit = tagUnit;
	}

	public String getTagPlaceholder() {
		return this.tagPlaceholder;
	}

	public void setTagPlaceholder(String tagPlaceholder) {
		this.tagPlaceholder = tagPlaceholder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getTagTime() {
		return this.tagTime;
	}

	public void setTagTime(String tagTime) {
		this.tagTime = tagTime;
	}

}