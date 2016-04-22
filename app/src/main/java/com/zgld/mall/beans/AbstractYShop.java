package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYShop entity provides the base persistence definition of the YShop
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYShop implements java.io.Serializable {

// Fields

	private Integer shopId;
	private String shopName;
	private String shopTags;
	private String shopTitle;
	private String shopDescribe;
	private String shopKeyWords;
	private String shopX;
	private String shopY;
	private Integer areaId;
	private String shopAddress;
	private String shopContact;
	private String shopMobile;
	private String shopCell;
	private String shopIdCard;
	private String shopIdCardImg;
	private String shopLicenseImg;
	private String shopImg;
	private String shopIntroduction;
	private Integer userId;
	private Integer shopIsOpen;
	private Integer shopIsVerify;
	private String shopTime;

	// Constructors

	/** default constructor */
	public AbstractYShop() {
	}
	// Property accessors

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopTags() {
		return this.shopTags;
	}

	public void setShopTags(String shopTags) {
		this.shopTags = shopTags;
	}

	public String getShopTitle() {
		return this.shopTitle;
	}

	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}

	public String getShopDescribe() {
		return this.shopDescribe;
	}

	public void setShopDescribe(String shopDescribe) {
		this.shopDescribe = shopDescribe;
	}

	public String getShopKeyWords() {
		return this.shopKeyWords;
	}

	public void setShopKeyWords(String shopKeyWords) {
		this.shopKeyWords = shopKeyWords;
	}

	public String getShopX() {
		return this.shopX;
	}

	public void setShopX(String shopX) {
		this.shopX = shopX;
	}

	public String getShopY() {
		return this.shopY;
	}

	public void setShopY(String shopY) {
		this.shopY = shopY;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopContact() {
		return this.shopContact;
	}

	public void setShopContact(String shopContact) {
		this.shopContact = shopContact;
	}

	public String getShopMobile() {
		return this.shopMobile;
	}

	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public String getShopCell() {
		return this.shopCell;
	}

	public void setShopCell(String shopCell) {
		this.shopCell = shopCell;
	}

	public String getShopIdCard() {
		return this.shopIdCard;
	}

	public void setShopIdCard(String shopIdCard) {
		this.shopIdCard = shopIdCard;
	}

	public String getShopIdCardImg() {
		return this.shopIdCardImg;
	}

	public void setShopIdCardImg(String shopIdCardImg) {
		this.shopIdCardImg = shopIdCardImg;
	}

	public String getShopLicenseImg() {
		return this.shopLicenseImg;
	}

	public void setShopLicenseImg(String shopLicenseImg) {
		this.shopLicenseImg = shopLicenseImg;
	}

	public String getShopImg() {
		return this.shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}

	public String getShopIntroduction() {
		return this.shopIntroduction;
	}

	public void setShopIntroduction(String shopIntroduction) {
		this.shopIntroduction = shopIntroduction;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopIsOpen() {
		return this.shopIsOpen;
	}

	public void setShopIsOpen(Integer shopIsOpen) {
		this.shopIsOpen = shopIsOpen;
	}

	public Integer getShopIsVerify() {
		return this.shopIsVerify;
	}

	public void setShopIsVerify(Integer shopIsVerify) {
		this.shopIsVerify = shopIsVerify;
	}

	public String getShopTime() {
		return this.shopTime;
	}

	public void setShopTime(String shopTime) {
		this.shopTime = shopTime;
	}

}