package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YImageCut entity. @author MyEclipse Persistence Tools
 */
public class YImageCut extends AbstractYImageCut implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YImageCut() {
	}

	/** minimal constructor */
	public YImageCut(String imgCutTime) {
		super(imgCutTime);
	}

	/** full constructor */
	public YImageCut(Integer fiId, Integer imgCutWidth, Integer imgCutHeight, String imgCutUrl, Integer isDelete, String imgCutTime) {
		super(fiId, imgCutWidth, imgCutHeight, imgCutUrl, isDelete, imgCutTime);
	}

}
