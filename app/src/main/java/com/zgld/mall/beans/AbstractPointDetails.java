package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractPointDetails entity provides the base persistence definition of the
 * PointDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPointDetails implements java.io.Serializable {

	// Fields

	private Integer pointId;
	private Integer orderId;
	private Integer userId;
	private String tradeDate;
	private Integer increased;
	private Integer reduced;
	private Integer points;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractPointDetails() {
	}

	/** full constructor */
	public AbstractPointDetails(Integer orderId, Integer userId, String tradeDate, Integer increased, Integer reduced, Integer points, String remark) {
		this.orderId = orderId;
		this.userId = userId;
		this.tradeDate = tradeDate;
		this.increased = increased;
		this.reduced = reduced;
		this.points = points;
		this.remark = remark;
	}

	// Property accessors

	public Integer getPointId() {
		return this.pointId;
	}

	public void setPointId(Integer pointId) {
		this.pointId = pointId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Integer getIncreased() {
		return this.increased;
	}

	public void setIncreased(Integer increased) {
		this.increased = increased;
	}

	public Integer getReduced() {
		return this.reduced;
	}

	public void setReduced(Integer reduced) {
		this.reduced = reduced;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}