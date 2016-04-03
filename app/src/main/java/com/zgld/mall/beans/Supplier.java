package com.zgld.mall.beans;

/**
 * Supplier entity. @author MyEclipse Persistence Tools
 */
public class Supplier extends AbstractSupplier implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Supplier() {
	}

	/** minimal constructor */
	public Supplier(String supplierName) {
		super(supplierName);
	}

	HishopProducts hishopProducts;

	public HishopProducts getHishopProducts() {
		return hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}
	boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
