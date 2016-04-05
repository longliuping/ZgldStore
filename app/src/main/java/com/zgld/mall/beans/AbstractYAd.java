package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAd entity provides the base persistence definition of the YAd
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAd implements java.io.Serializable {

	// Fields

	private Integer adId;
	private String adName;
	private Integer adType;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer adOrder;
	private Integer adTopOrder;
	private Integer isDelete;
	private String adTime;

	// Constructors

	/** default constructor */
	public AbstractYAd() {
	}

	/** minimal constructor */
	public AbstractYAd(String adTime) {
		this.adTime = adTime;
	}

	/** full constructor */
	public AbstractYAd(String adName, Integer adType, Integer unitSetId, Integer accountActId, Integer adOrder, Integer adTopOrder, Integer isDelete, String adTime) {
		this.adName = adName;
		this.adType = adType;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.adOrder = adOrder;
		this.adTopOrder = adTopOrder;
		this.isDelete = isDelete;
		this.adTime = adTime;
	}

	// Property accessors

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public Integer getAdType() {
		return this.adType;
	}

	public void setAdType(Integer adType) {
		this.adType = adType;
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

	public Integer getAdOrder() {
		return this.adOrder;
	}

	public void setAdOrder(Integer adOrder) {
		this.adOrder = adOrder;
	}

	public Integer getAdTopOrder() {
		return this.adTopOrder;
	}

	public void setAdTopOrder(Integer adTopOrder) {
		this.adTopOrder = adTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdTime() {
		return this.adTime;
	}

	public void setAdTime(String adTime) {
		this.adTime = adTime;
	}

}