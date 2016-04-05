package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * PhotoGallery entity. @author MyEclipse Persistence Tools
 */
public class PhotoGallery extends AbstractPhotoGallery implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PhotoGallery() {
	}

	/** full constructor */
	public PhotoGallery(Integer categoryId, String photoName, String photoPath, Integer fileSize, String uploadTime, String lastUpdateTime) {
		super(categoryId, photoName, photoPath, fileSize, uploadTime, lastUpdateTime);
	}

}
