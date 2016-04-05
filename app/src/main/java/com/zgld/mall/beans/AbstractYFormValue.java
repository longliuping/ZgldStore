package com.zgld.mall.beans;

/**
 * AbstractYFormValue entity provides the base persistence definition of the
 * YFormValue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormValue implements java.io.Serializable {

	// Fields

	private Integer valueId;
	private Integer tagId;
	private Integer objId;
	private String tableName;
	private Integer tagType;
	private String fieldName;
	private String controlValue;

	// Constructors

	/** default constructor */
	public AbstractYFormValue() {
	}

	/** minimal constructor */
	public AbstractYFormValue(String controlValue) {
		this.controlValue = controlValue;
	}

	/** full constructor */
	public AbstractYFormValue(Integer tagId, Integer objId, String tableName, Integer tagType, String fieldName, String controlValue) {
		this.tagId = tagId;
		this.objId = objId;
		this.tableName = tableName;
		this.tagType = tagType;
		this.fieldName = fieldName;
		this.controlValue = controlValue;
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

	public Integer getObjId() {
		return this.objId;
	}

	public void setObjId(Integer objId) {
		this.objId = objId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getTagType() {
		return this.tagType;
	}

	public void setTagType(Integer tagType) {
		this.tagType = tagType;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getControlValue() {
		return this.controlValue;
	}

	public void setControlValue(String controlValue) {
		this.controlValue = controlValue;
	}

}