package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYImageSize entity provides the base persistence definition of the
 * YImageSize entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYImageSize implements java.io.Serializable {

	// Fields

	private Integer imgSizeId;
	private Integer imgSizeWidth;
	private Integer imgSizeHeight;
	private Integer isDefault;
	private Integer isDelete;
	private String imgSizeTime;

	// Constructors

	/** default constructor */
	public AbstractYImageSize() {
	}

	/** minimal constructor */
	public AbstractYImageSize(String imgSizeTime) {
		this.imgSizeTime = imgSizeTime;
	}

	/** full constructor */
	public AbstractYImageSize(Integer imgSizeWidth, Integer imgSizeHeight, Integer isDefault, Integer isDelete, String imgSizeTime) {
		this.imgSizeWidth = imgSizeWidth;
		this.imgSizeHeight = imgSizeHeight;
		this.isDefault = isDefault;
		this.isDelete = isDelete;
		this.imgSizeTime = imgSizeTime;
	}

	// Property accessors

	public Integer getImgSizeId() {
		return this.imgSizeId;
	}

	public void setImgSizeId(Integer imgSizeId) {
		this.imgSizeId = imgSizeId;
	}

	public Integer getImgSizeWidth() {
		return this.imgSizeWidth;
	}

	public void setImgSizeWidth(Integer imgSizeWidth) {
		this.imgSizeWidth = imgSizeWidth;
	}

	public Integer getImgSizeHeight() {
		return this.imgSizeHeight;
	}

	public void setImgSizeHeight(Integer imgSizeHeight) {
		this.imgSizeHeight = imgSizeHeight;
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

	public String getImgSizeTime() {
		return this.imgSizeTime;
	}

	public void setImgSizeTime(String imgSizeTime) {
		this.imgSizeTime = imgSizeTime;
	}

}