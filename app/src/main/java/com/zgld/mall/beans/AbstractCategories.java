package com.zgld.mall.beans;

/**
 * AbstractCategories entity provides the base persistence definition of the
 * Categories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private Integer parentCategoryId;
	private String name;
	private Integer displaysequence;
	private String iconUrl;
	private String indexChar;
	private String title;
	private String metaDescription;
	private String metaKeywords;
	private String description;
	private Integer depth;

	// Constructors

	/** default constructor */
	public AbstractCategories() {
	}

	/** full constructor */
	public AbstractCategories(Integer parentCategoryId, String name, Integer displaysequence, String iconUrl, String indexChar, String title, String metaDescription, String metaKeywords, String description, Integer depth) {
		this.parentCategoryId = parentCategoryId;
		this.name = name;
		this.displaysequence = displaysequence;
		this.iconUrl = iconUrl;
		this.indexChar = indexChar;
		this.title = title;
		this.metaDescription = metaDescription;
		this.metaKeywords = metaKeywords;
		this.description = description;
		this.depth = depth;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDisplaysequence() {
		return this.displaysequence;
	}

	public void setDisplaysequence(Integer displaysequence) {
		this.displaysequence = displaysequence;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getIndexChar() {
		return this.indexChar;
	}

	public void setIndexChar(String indexChar) {
		this.indexChar = indexChar;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDepth() {
		return this.depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

}