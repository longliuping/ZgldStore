package com.zgld.mall.beans;

/**
 * AbstractBrandCategories entity provides the base persistence definition of
 * the BrandCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBrandCategories implements java.io.Serializable {

	// Fields

	private Integer brandId;
	private String brandName;
	private String logo;
	private String companyUrl;
	private Integer displaySequence;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractBrandCategories() {
	}

	/** full constructor */
	public AbstractBrandCategories(String brandName, String logo, String companyUrl, Integer displaySequence, String description) {
		this.brandName = brandName;
		this.logo = logo;
		this.companyUrl = companyUrl;
		this.displaySequence = displaySequence;
		this.description = description;
	}

	// Property accessors

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCompanyUrl() {
		return this.companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}