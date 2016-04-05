package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAdImg entity provides the base persistence definition of the YAdImg
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAdImg implements java.io.Serializable {

	// Fields

	private Integer adImgId;
	private Integer adId;
	private String adImgUrl;
	private String adImgSrc;
	private String adImgTitle;
	private String adImgIntro;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer adImgOrder;
	private Integer adImgTopOrder;
	private Integer isDelete;
	private String adImgTime;

	// Constructors

	/** default constructor */
	public AbstractYAdImg() {
	}

	/** minimal constructor */
	public AbstractYAdImg(String adImgTime) {
		this.adImgTime = adImgTime;
	}

	/** full constructor */
	public AbstractYAdImg(Integer adId, String adImgUrl, String adImgSrc, String adImgTitle, String adImgIntro, Integer unitSetId, Integer accountActId, Integer adImgOrder, Integer adImgTopOrder, Integer isDelete, String adImgTime) {
		this.adId = adId;
		this.adImgUrl = adImgUrl;
		this.adImgSrc = adImgSrc;
		this.adImgTitle = adImgTitle;
		this.adImgIntro = adImgIntro;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.adImgOrder = adImgOrder;
		this.adImgTopOrder = adImgTopOrder;
		this.isDelete = isDelete;
		this.adImgTime = adImgTime;
	}

	// Property accessors

	public Integer getAdImgId() {
		return this.adImgId;
	}

	public void setAdImgId(Integer adImgId) {
		this.adImgId = adImgId;
	}

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getAdImgUrl() {
		return this.adImgUrl;
	}

	public void setAdImgUrl(String adImgUrl) {
		this.adImgUrl = adImgUrl;
	}

	public String getAdImgSrc() {
		return this.adImgSrc;
	}

	public void setAdImgSrc(String adImgSrc) {
		this.adImgSrc = adImgSrc;
	}

	public String getAdImgTitle() {
		return this.adImgTitle;
	}

	public void setAdImgTitle(String adImgTitle) {
		this.adImgTitle = adImgTitle;
	}

	public String getAdImgIntro() {
		return this.adImgIntro;
	}

	public void setAdImgIntro(String adImgIntro) {
		this.adImgIntro = adImgIntro;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getAdImgOrder() {
		return this.adImgOrder;
	}

	public void setAdImgOrder(Integer adImgOrder) {
		this.adImgOrder = adImgOrder;
	}

	public Integer getAdImgTopOrder() {
		return this.adImgTopOrder;
	}

	public void setAdImgTopOrder(Integer adImgTopOrder) {
		this.adImgTopOrder = adImgTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdImgTime() {
		return this.adImgTime;
	}

	public void setAdImgTime(String adImgTime) {
		this.adImgTime = adImgTime;
	}

}