package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoodsBrand entity provides the base persistence definition of the
 * YGoodsBrand entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsBrand implements java.io.Serializable {

	// Fields

	private Integer goBrandId;
	private Integer goParentBrandId;
	private Integer goBrandSetId;
	private String goBrandName;
	private String goBrandIntro;
	private Integer goBrandTotal;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer goBrandOrder;
	private Integer goBrandTopOrder;
	private String goBrandDefaultImg;
	private String goBrandHoverImg;
	private String goBrandVisitedImg;
	private Integer isDelete;
	private String goBrandTime;

	// Constructors

	/** default constructor */
	public AbstractYGoodsBrand() {
	}

	/** minimal constructor */
	public AbstractYGoodsBrand(String goBrandTime) {
		this.goBrandTime = goBrandTime;
	}

	/** full constructor */
	public AbstractYGoodsBrand(Integer goParentBrandId, Integer goBrandSetId, String goBrandName, String goBrandIntro, Integer goBrandTotal, Integer unitSetId, Integer accountActId, Integer goBrandOrder, Integer goBrandTopOrder, String goBrandDefaultImg, String goBrandHoverImg, String goBrandVisitedImg, Integer isDelete, String goBrandTime) {
		this.goParentBrandId = goParentBrandId;
		this.goBrandSetId = goBrandSetId;
		this.goBrandName = goBrandName;
		this.goBrandIntro = goBrandIntro;
		this.goBrandTotal = goBrandTotal;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.goBrandOrder = goBrandOrder;
		this.goBrandTopOrder = goBrandTopOrder;
		this.goBrandDefaultImg = goBrandDefaultImg;
		this.goBrandHoverImg = goBrandHoverImg;
		this.goBrandVisitedImg = goBrandVisitedImg;
		this.isDelete = isDelete;
		this.goBrandTime = goBrandTime;
	}

	// Property accessors

	public Integer getGoBrandId() {
		return this.goBrandId;
	}

	public void setGoBrandId(Integer goBrandId) {
		this.goBrandId = goBrandId;
	}

	public Integer getGoParentBrandId() {
		return this.goParentBrandId;
	}

	public void setGoParentBrandId(Integer goParentBrandId) {
		this.goParentBrandId = goParentBrandId;
	}

	public Integer getGoBrandSetId() {
		return this.goBrandSetId;
	}

	public void setGoBrandSetId(Integer goBrandSetId) {
		this.goBrandSetId = goBrandSetId;
	}

	public String getGoBrandName() {
		return this.goBrandName;
	}

	public void setGoBrandName(String goBrandName) {
		this.goBrandName = goBrandName;
	}

	public String getGoBrandIntro() {
		return this.goBrandIntro;
	}

	public void setGoBrandIntro(String goBrandIntro) {
		this.goBrandIntro = goBrandIntro;
	}

	public Integer getGoBrandTotal() {
		return this.goBrandTotal;
	}

	public void setGoBrandTotal(Integer goBrandTotal) {
		this.goBrandTotal = goBrandTotal;
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

	public Integer getGoBrandOrder() {
		return this.goBrandOrder;
	}

	public void setGoBrandOrder(Integer goBrandOrder) {
		this.goBrandOrder = goBrandOrder;
	}

	public Integer getGoBrandTopOrder() {
		return this.goBrandTopOrder;
	}

	public void setGoBrandTopOrder(Integer goBrandTopOrder) {
		this.goBrandTopOrder = goBrandTopOrder;
	}

	public String getGoBrandDefaultImg() {
		return this.goBrandDefaultImg;
	}

	public void setGoBrandDefaultImg(String goBrandDefaultImg) {
		this.goBrandDefaultImg = goBrandDefaultImg;
	}

	public String getGoBrandHoverImg() {
		return this.goBrandHoverImg;
	}

	public void setGoBrandHoverImg(String goBrandHoverImg) {
		this.goBrandHoverImg = goBrandHoverImg;
	}

	public String getGoBrandVisitedImg() {
		return this.goBrandVisitedImg;
	}

	public void setGoBrandVisitedImg(String goBrandVisitedImg) {
		this.goBrandVisitedImg = goBrandVisitedImg;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getGoBrandTime() {
		return this.goBrandTime;
	}

	public void setGoBrandTime(String goBrandTime) {
		this.goBrandTime = goBrandTime;
	}

}