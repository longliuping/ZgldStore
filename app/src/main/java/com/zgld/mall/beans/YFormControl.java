package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YFormControl entity. @author MyEclipse Persistence Tools
 */
public class YFormControl extends AbstractYFormControl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFormControl() {
	}
	boolean selected;

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
