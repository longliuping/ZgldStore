package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYThemeConfig entity provides the base persistence definition of the
 * YThemeConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYThemeConfig implements java.io.Serializable {

	// Fields

	private Integer themeId;
	private String themeName;
	private String themeTitle;
	private String themeIntro;
	private Integer isDefault;
	private Integer isDelete;
	private String themeTime;

	// Constructors

	/** default constructor */
	public AbstractYThemeConfig() {
	}

	/** minimal constructor */
	public AbstractYThemeConfig(String themeTime) {
		this.themeTime = themeTime;
	}

	/** full constructor */
	public AbstractYThemeConfig(String themeName, String themeTitle, String themeIntro, Integer isDefault, Integer isDelete, String themeTime) {
		this.themeName = themeName;
		this.themeTitle = themeTitle;
		this.themeIntro = themeIntro;
		this.isDefault = isDefault;
		this.isDelete = isDelete;
		this.themeTime = themeTime;
	}

	// Property accessors

	public Integer getThemeId() {
		return this.themeId;
	}

	public void setThemeId(Integer themeId) {
		this.themeId = themeId;
	}

	public String getThemeName() {
		return this.themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public String getThemeTitle() {
		return this.themeTitle;
	}

	public void setThemeTitle(String themeTitle) {
		this.themeTitle = themeTitle;
	}

	public String getThemeIntro() {
		return this.themeIntro;
	}

	public void setThemeIntro(String themeIntro) {
		this.themeIntro = themeIntro;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getThemeTime() {
		return this.themeTime;
	}

	public void setThemeTime(String themeTime) {
		this.themeTime = themeTime;
	}

}