package com.zgld.mall.beans;

import java.io.Serializable;

public class ProductImageUpload implements Serializable {
	String uploadType;
	String uploaderId;
	String originalSavePath;
	String thumbnail40SavePath;
	String thumbnail100SavePath;
	String thumbnail220SavePath;
	String imageUrl;

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public String getUploaderId() {
		return uploaderId;
	}

	public void setUploaderId(String uploaderId) {
		this.uploaderId = uploaderId;
	}

	public String getOriginalSavePath() {
		return originalSavePath;
	}

	public void setOriginalSavePath(String originalSavePath) {
		this.originalSavePath = originalSavePath;
	}

	public String getThumbnail40SavePath() {
		return thumbnail40SavePath;
	}

	public void setThumbnail40SavePath(String thumbnail40SavePath) {
		this.thumbnail40SavePath = thumbnail40SavePath;
	}

	public String getThumbnail100SavePath() {
		return thumbnail100SavePath;
	}

	public void setThumbnail100SavePath(String thumbnail100SavePath) {
		this.thumbnail100SavePath = thumbnail100SavePath;
	}

	public String getThumbnail220SavePath() {
		return thumbnail220SavePath;
	}

	public void setThumbnail220SavePath(String thumbnail220SavePath) {
		this.thumbnail220SavePath = thumbnail220SavePath;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
