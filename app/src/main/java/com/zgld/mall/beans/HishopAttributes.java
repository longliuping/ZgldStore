package com.zgld.mall.beans;

import java.util.List;
import java.util.Set;

/**
 * HishopAttributes entity. @author MyEclipse Persistence Tools
 */
public class HishopAttributes extends AbstractHishopAttributes implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopAttributes() {
	}
	List<HishopAttributeValues> listHishopAttributeValues;

	public List<HishopAttributeValues> getListHishopAttributeValues() {
		return listHishopAttributeValues;
	}

	public void setListHishopAttributeValues(List<HishopAttributeValues> listHishopAttributeValues) {
		this.listHishopAttributeValues = listHishopAttributeValues;
	}
}
