package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYFormControl entity provides the base persistence definition of the
 * YFormControl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFormControl implements java.io.Serializable {

	// Fields

	private Integer controlId;
	private Integer tagId;
	private String controlName;
	private String fieldName;
	private String controlValue;
	private String controlTime;

	// Constructors

	/** default constructor */
	public AbstractYFormControl() {
	}

	/** minimal constructor */
	public AbstractYFormControl(String controlTime) {
		this.controlTime = controlTime;
	}

	/** full constructor */
	public AbstractYFormControl(Integer tagId, String controlName, String fieldName, String controlValue, String controlTime) {
		this.tagId = tagId;
		this.controlName = controlName;
		this.fieldName = fieldName;
		this.controlValue = controlValue;
		this.controlTime = controlTime;
	}

	// Property accessors

	public Integer getControlId() {
		return this.controlId;
	}

	public void setControlId(Integer controlId) {
		this.controlId = controlId;
	}

	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getControlName() {
		return this.controlName;
	}

	public void setControlName(String controlName) {
		this.controlName = controlName;
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

	public String getControlTime() {
		return this.controlTime;
	}

	public void setControlTime(String controlTime) {
		this.controlTime = controlTime;
	}

}