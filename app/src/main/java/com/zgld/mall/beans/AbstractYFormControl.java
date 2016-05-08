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
	private Integer formId;
	private String controlName;
	private String controlValue;
	private Integer isDelete;
	private Date controlTime;

	// Constructors

	/** default constructor */
	public AbstractYFormControl() {
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

	public Integer getFormId() {
		return this.formId;
	}

	public void setFormId(Integer formId) {
		this.formId = formId;
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

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getControlTime() {
		return this.controlTime;
	}

	public void setControlTime(Date controlTime) {
		this.controlTime = controlTime;
	}

}