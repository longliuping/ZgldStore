package com.zgld.mall.beans;

/**
 * AbstractYFormValue entity provides the base persistence definition of the
 * YFormValue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormValue implements java.io.Serializable {

	// Fields

	private Integer valueId;
	private Integer tagId;
	private Integer formId;
	private Integer tagType;
	private Integer objId;
	private String objTable;
	private String tagFieldName;
	private String tagValue;

	// Constructors

	/** default constructor */
	public AbstractYFormValue() {
	}

	// Property accessors

	public Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

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

	public Integer getTagType() {
		return this.tagType;
	}

	public void setTagType(Integer tagType) {
		this.tagType = tagType;
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

	public String getTagFieldName() {
		return this.tagFieldName;
	}

	public void setTagFieldName(String tagFieldName) {
		this.tagFieldName = tagFieldName;
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}