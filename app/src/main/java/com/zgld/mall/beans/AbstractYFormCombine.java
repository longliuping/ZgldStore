package com.zgld.mall.beans;

/**
 * AbstractYFormCombine entity provides the base persistence definition of the
 * YFormCombine entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormCombine implements java.io.Serializable {

	// Fields

	private Integer combineId;
	private String combineString;
	private Integer objId;
	private String objTable;
	private String tagFieldName;
	private String controlName;
	private String controlValue;

	// Constructors

	/** default constructor */
	public AbstractYFormCombine() {
	}

	// Property accessors

	public Integer getCombineId() {
		return this.combineId;
	}

	public void setCombineId(Integer combineId) {
		this.combineId = combineId;
	}

	public String getCombineString() {
		return this.combineString;
	}

	public void setCombineString(String combineString) {
		this.combineString = combineString;
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