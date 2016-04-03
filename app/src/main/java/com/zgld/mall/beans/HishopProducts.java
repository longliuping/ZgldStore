package com.zgld.mall.beans;

import java.util.List;

/**
 * HishopProducts entity. @author MyEclipse Persistence Tools
 */
public class HishopProducts extends AbstractHishopProducts implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProducts() {
	}
	List<HishopSkus> listHishopSkus;
	List<HishopAttributes> listHishopAttributes;
	List<HishopAttributeValues> listHishopAttributeValues;
	//产品规格价格
	HishopSkus hishopSkus;
	List<HishopSkuitems> listHishopSkuitems;
	public List<HishopSkus> getListHishopSkus() {
		return listHishopSkus;
	}
	public void setListHishopSkus(List<HishopSkus> listHishopSkus) {
		this.listHishopSkus = listHishopSkus;
	}
	public List<HishopAttributes> getListHishopAttributes() {
		return listHishopAttributes;
	}
	public void setListHishopAttributes(List<HishopAttributes> listHishopAttributes) {
		this.listHishopAttributes = listHishopAttributes;
	}
	public List<HishopAttributeValues> getListHishopAttributeValues() {
		return listHishopAttributeValues;
	}
	public void setListHishopAttributeValues(List<HishopAttributeValues> listHishopAttributeValues) {
		this.listHishopAttributeValues = listHishopAttributeValues;
	}
	public HishopSkus getHishopSkus() {
		return hishopSkus;
	}
	public void setHishopSkus(HishopSkus hishopSkus) {
		this.hishopSkus = hishopSkus;
	}
	public List<HishopSkuitems> getListHishopSkuitems() {
		return listHishopSkuitems;
	}
	public void setListHishopSkuitems(List<HishopSkuitems> listHishopSkuitems) {
		this.listHishopSkuitems = listHishopSkuitems;
	}
	boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
}
