package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractPhotoGallery entity provides the base persistence definition of the
 * PhotoGallery entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPhotoGallery implements java.io.Serializable {

	// Fields

	private Integer photoId;
	private Integer categoryId;
	private String photoName;
	private String photoPath;
	private Integer fileSize;
	private String uploadTime;
	private String lastUpdateTime;

	// Constructors

	/** default constructor */
	public AbstractPhotoGallery() {
	}

	/** full constructor */
	public AbstractPhotoGallery(Integer categoryId, String photoName, String photoPath, Integer fileSize, String uploadTime, String lastUpdateTime) {
		this.categoryId = categoryId;
		this.photoName = photoName;
		this.photoPath = photoPath;
		this.fileSize = fileSize;
		this.uploadTime = uploadTime;
		this.lastUpdateTime = lastUpdateTime;
	}

	// Property accessors

	public Integer getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPhotoName() {
		return this.photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}