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
	private Integer tagType;
	private Integer isCombine;
	private Integer isDisabled;
	private Integer isNull;
	private String validateRegEx;
	private String tagFieldName;
	private String tagUnit;
	private String tagPlaceholder;
	private String tagIntro;
	private Integer isDelete;
	private String tagTime;

	// Constructors

	/** default constructor */
	public AbstractYFormTag() {
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

	public Integer getTagType() {
		return this.tagType;
	}

	public void setTagType(Integer tagType) {
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

	public String getValidateRegEx() {
		return this.validateRegEx;
	}

	public void setValidateRegEx(String validateRegEx) {
		this.validateRegEx = validateRegEx;
	}

	public String getTagFieldName() {
		return this.tagFieldName;
	}

	public void setTagFieldName(String tagFieldName) {
		this.tagFieldName = tagFieldName;
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

	public String getTagIntro() {
		return this.tagIntro;
	}

	public void setTagIntro(String tagIntro) {
		this.tagIntro = tagIntro;
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