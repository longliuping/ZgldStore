package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYMenu entity provides the base persistence definition of the YMenu
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMenu implements java.io.Serializable {

	// Fields

	private Integer meId;
	private Integer meParentId;
	private Integer meClassSetId;
	private Integer accountActId;
	private String meName;
	private String meEnName;
	private String meUrl;
	private Integer meTarget;
	private Integer meOrder;
	private String meDefaultCname;
	private String meOverCname;
	private String meDefaultImg;
	private String meOverImg;
	private String meVisitedImg;
	private Integer isDelete;
	private String meTime;

	// Constructors

	/** default constructor */
	public AbstractYMenu() {
	}

	/** minimal constructor */
	public AbstractYMenu(String meTime) {
		this.meTime = meTime;
	}

	/** full constructor */
	public AbstractYMenu(Integer meParentId, Integer meClassSetId, Integer accountActId, String meName, String meEnName, String meUrl, Integer meTarget, Integer meOrder, String meDefaultCname, String meOverCname, String meDefaultImg, String meOverImg, String meVisitedImg, Integer isDelete, String meTime) {
		this.meParentId = meParentId;
		this.meClassSetId = meClassSetId;
		this.accountActId = accountActId;
		this.meName = meName;
		this.meEnName = meEnName;
		this.meUrl = meUrl;
		this.meTarget = meTarget;
		this.meOrder = meOrder;
		this.meDefaultCname = meDefaultCname;
		this.meOverCname = meOverCname;
		this.meDefaultImg = meDefaultImg;
		this.meOverImg = meOverImg;
		this.meVisitedImg = meVisitedImg;
		this.isDelete = isDelete;
		this.meTime = meTime;
	}

	// Property accessors

	public Integer getMeId() {
		return this.meId;
	}

	public void setMeId(Integer meId) {
		this.meId = meId;
	}

	public Integer getMeParentId() {
		return this.meParentId;
	}

	public void setMeParentId(Integer meParentId) {
		this.meParentId = meParentId;
	}

	public Integer getMeClassSetId() {
		return this.meClassSetId;
	}

	public void setMeClassSetId(Integer meClassSetId) {
		this.meClassSetId = meClassSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getMeName() {
		return this.meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	public String getMeEnName() {
		return this.meEnName;
	}

	public void setMeEnName(String meEnName) {
		this.meEnName = meEnName;
	}

	public String getMeUrl() {
		return this.meUrl;
	}

	public void setMeUrl(String meUrl) {
		this.meUrl = meUrl;
	}

	public Integer getMeTarget() {
		return this.meTarget;
	}

	public void setMeTarget(Integer meTarget) {
		this.meTarget = meTarget;
	}

	public Integer getMeOrder() {
		return this.meOrder;
	}

	public void setMeOrder(Integer meOrder) {
		this.meOrder = meOrder;
	}

	public String getMeDefaultCname() {
		return this.meDefaultCname;
	}

	public void setMeDefaultCname(String meDefaultCname) {
		this.meDefaultCname = meDefaultCname;
	}

	public String getMeOverCname() {
		return this.meOverCname;
	}

	public void setMeOverCname(String meOverCname) {
		this.meOverCname = meOverCname;
	}

	public String getMeDefaultImg() {
		return this.meDefaultImg;
	}

	public void setMeDefaultImg(String meDefaultImg) {
		this.meDefaultImg = meDefaultImg;
	}

	public String getMeOverImg() {
		return this.meOverImg;
	}

	public void setMeOverImg(String meOverImg) {
		this.meOverImg = meOverImg;
	}

	public String getMeVisitedImg() {
		return this.meVisitedImg;
	}

	public void setMeVisitedImg(String meVisitedImg) {
		this.meVisitedImg = meVisitedImg;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMeTime() {
		return this.meTime;
	}

	public void setMeTime(String meTime) {
		this.meTime = meTime;
	}

}