package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYUnit entity provides the base persistence definition of the YUnit
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYUnit implements java.io.Serializable {

	// Fields

	private Integer unitId;
	private Integer areaId;
	private Integer unitSetId;
	private Integer unitClassSetId;
	private Integer accountActId;
	private Integer unitParentId;
	private String unitTitle;
	private String unitTel;
	private String unitContact;
	private String unitMobile;
	private String unitEmail;
	private String unitQq;
	private String unitAddress;
	private String unitImg;
	private String unitY;
	private String unitX;
	private String unitIntro;
	private Integer unitOrder;
	private Integer unitTopOrder;
	private Integer isDelete;
	private Integer unitState;
	private String unitTime;

	// Constructors

	/** default constructor */
	public AbstractYUnit() {
	}

	/** minimal constructor */
	public AbstractYUnit(String unitTime) {
		this.unitTime = unitTime;
	}

	/** full constructor */
	public AbstractYUnit(Integer areaId, Integer unitSetId, Integer unitClassSetId, Integer accountActId, Integer unitParentId, String unitTitle, String unitTel, String unitContact, String unitMobile, String unitEmail, String unitQq, String unitAddress, String unitImg, String unitY, String unitX, String unitIntro, Integer unitOrder, Integer unitTopOrder, Integer isDelete, Integer unitState, String unitTime) {
		this.areaId = areaId;
		this.unitSetId = unitSetId;
		this.unitClassSetId = unitClassSetId;
		this.accountActId = accountActId;
		this.unitParentId = unitParentId;
		this.unitTitle = unitTitle;
		this.unitTel = unitTel;
		this.unitContact = unitContact;
		this.unitMobile = unitMobile;
		this.unitEmail = unitEmail;
		this.unitQq = unitQq;
		this.unitAddress = unitAddress;
		this.unitImg = unitImg;
		this.unitY = unitY;
		this.unitX = unitX;
		this.unitIntro = unitIntro;
		this.unitOrder = unitOrder;
		this.unitTopOrder = unitTopOrder;
		this.isDelete = isDelete;
		this.unitState = unitState;
		this.unitTime = unitTime;
	}

	// Property accessors

	public Integer getUnitId() {
		return this.unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getUnitClassSetId() {
		return this.unitClassSetId;
	}

	public void setUnitClassSetId(Integer unitClassSetId) {
		this.unitClassSetId = unitClassSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getUnitParentId() {
		return this.unitParentId;
	}

	public void setUnitParentId(Integer unitParentId) {
		this.unitParentId = unitParentId;
	}

	public String getUnitTitle() {
		return this.unitTitle;
	}

	public void setUnitTitle(String unitTitle) {
		this.unitTitle = unitTitle;
	}

	public String getUnitTel() {
		return this.unitTel;
	}

	public void setUnitTel(String unitTel) {
		this.unitTel = unitTel;
	}

	public String getUnitContact() {
		return this.unitContact;
	}

	public void setUnitContact(String unitContact) {
		this.unitContact = unitContact;
	}

	public String getUnitMobile() {
		return this.unitMobile;
	}

	public void setUnitMobile(String unitMobile) {
		this.unitMobile = unitMobile;
	}

	public String getUnitEmail() {
		return this.unitEmail;
	}

	public void setUnitEmail(String unitEmail) {
		this.unitEmail = unitEmail;
	}

	public String getUnitQq() {
		return this.unitQq;
	}

	public void setUnitQq(String unitQq) {
		this.unitQq = unitQq;
	}

	public String getUnitAddress() {
		return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	public String getUnitImg() {
		return this.unitImg;
	}

	public void setUnitImg(String unitImg) {
		this.unitImg = unitImg;
	}

	public String getUnitY() {
		return this.unitY;
	}

	public void setUnitY(String unitY) {
		this.unitY = unitY;
	}

	public String getUnitX() {
		return this.unitX;
	}

	public void setUnitX(String unitX) {
		this.unitX = unitX;
	}

	public String getUnitIntro() {
		return this.unitIntro;
	}

	public void setUnitIntro(String unitIntro) {
		this.unitIntro = unitIntro;
	}

	public Integer getUnitOrder() {
		return this.unitOrder;
	}

	public void setUnitOrder(Integer unitOrder) {
		this.unitOrder = unitOrder;
	}

	public Integer getUnitTopOrder() {
		return this.unitTopOrder;
	}

	public void setUnitTopOrder(Integer unitTopOrder) {
		this.unitTopOrder = unitTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getUnitState() {
		return this.unitState;
	}

	public void setUnitState(Integer unitState) {
		this.unitState = unitState;
	}

	public String getUnitTime() {
		return this.unitTime;
	}

	public void setUnitTime(String unitTime) {
		this.unitTime = unitTime;
	}

}