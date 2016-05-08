package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.List;

/**
 * YFormTag entity. @author MyEclipse Persistence Tools
 */
public class YFormTag extends AbstractYFormTag implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormTag() {
	}
	YFormValue formValue;
	List<YFormControl> listFormControl;
	String str;
	public YFormValue getFormValue() {
		return formValue;
	}
	public void setFormValue(YFormValue formValue) {
		this.formValue = formValue;
	}
	public List<YFormControl> getListFormControl() {
		return listFormControl;
	}
	public void setListFormControl(List<YFormControl> listFormControl) {
		this.listFormControl = listFormControl;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
