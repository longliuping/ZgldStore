package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YImageSize entity. @author MyEclipse Persistence Tools
 */
public class YImageSize extends AbstractYImageSize implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YImageSize() {
	}

	/** minimal constructor */
	public YImageSize(String imgSizeTime) {
		super(imgSizeTime);
	}

	/** full constructor */
	public YImageSize(Integer imgSizeWidth, Integer imgSizeHeight, Integer isDefault, Integer isDelete, String imgSizeTime) {
		super(imgSizeWidth, imgSizeHeight, isDefault, isDelete, imgSizeTime);
	}

}
