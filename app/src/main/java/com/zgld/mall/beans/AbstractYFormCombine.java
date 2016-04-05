package com.zgld.mall.beans;

/**
 * AbstractYFormCombine entity provides the base persistence definition of the
 * YFormCombine entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormCombine implements java.io.Serializable {

	// Fields

	private Integer combineId;
	private String conbineFieldName;
	private String tableName;
	private Integer objId;
	private String fieldName;
	private String controlName;
	private String controlValue;

	// Constructors

	/** default constructor */
	public AbstractYFormCombine() {
	}

	/** full constructor */
	public AbstractYFormCombine(String conbineFieldName, String tableName, Integer objId, String fieldName, String controlName, String controlValue) {
		this.conbineFieldName = conbineFieldName;
		this.tableName = tableName;
		this.objId = objId;
		this.fieldName = fieldName;
		this.controlName = controlName;
		this.controlValue = controlValue;
	}

	// Property accessors

	public Integer getCombineId() {
		return this.combineId;
	}

	public void setCombineId(Integer combineId) {
		this.combineId = combineId;
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

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getControlName() {
		return this.controlName;
	}

	public void setControlName(String controlName) {
		this.controlName = controlName;
	}

	public String getControlValue() {
		return this.controlValue;
	}

	public void setControlValue(String controlValue) {
		this.controlValue = controlValue;
	}

}