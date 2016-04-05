package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractPromoteSales entity provides the base persistence definition of the
 * PromoteSales entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSales implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer shopId;
	private String name;
	private Integer promoteType;
	private String description;
	private String startTime;
	private String closingTime;

	// Constructors

	/** default constructor */
	public AbstractPromoteSales() {
	}

	/** full constructor */
	public AbstractPromoteSales(Integer shopId, String name, Integer promoteType, String description, String startTime, String closingTime) {
		this.shopId = shopId;
		this.name = name;
		this.promoteType = promoteType;
		this.description = description;
		this.startTime = startTime;
		this.closingTime = closingTime;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPromoteType() {
		return this.promoteType;
	}

	public void setPromoteType(Integer promoteType) {
		this.promoteType = promoteType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getClosingTime() {
		return this.closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

}