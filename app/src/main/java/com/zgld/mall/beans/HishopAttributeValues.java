package com.zgld.mall.beans;

/**
 * HishopAttributeValues entity. @author MyEclipse Persistence Tools
 */
public class HishopAttributeValues extends AbstractHishopAttributeValues
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopAttributeValues() {
	}
	Integer attributeId;
	public Integer getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}
	boolean selected;

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
