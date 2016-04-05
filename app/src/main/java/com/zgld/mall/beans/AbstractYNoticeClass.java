package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYNoticeClass entity provides the base persistence definition of the
 * YNoticeClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYNoticeClass implements java.io.Serializable {

	// Fields

	private Integer noClassId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer noClassSetId;
	private Integer noParentClassId;
	private String noClassName;
	private Integer noClassTotal;
	private Integer noClassOrder;
	private Integer noClassTopOrder;
	private String noClassDefaultImg;
	private String noClassHoverImg;
	private String noClassVisitedImg;
	private String noClassIntro;
	private Integer isDelete;
	private String noClassTime;

	// Constructors

	/** default constructor */
	public AbstractYNoticeClass() {
	}

	/** minimal constructor */
	public AbstractYNoticeClass(String noClassTime) {
		this.noClassTime = noClassTime;
	}

	/** full constructor */
	public AbstractYNoticeClass(Integer unitSetId, Integer accountActId, Integer noClassSetId, Integer noParentClassId, String noClassName, Integer noClassTotal, Integer noClassOrder, Integer noClassTopOrder, String noClassDefaultImg, String noClassHoverImg, String noClassVisitedImg, String noClassIntro, Integer isDelete, String noClassTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.noClassSetId = noClassSetId;
		this.noParentClassId = noParentClassId;
		this.noClassName = noClassName;
		this.noClassTotal = noClassTotal;
		this.noClassOrder = noClassOrder;
		this.noClassTopOrder = noClassTopOrder;
		this.noClassDefaultImg = noClassDefaultImg;
		this.noClassHoverImg = noClassHoverImg;
		this.noClassVisitedImg = noClassVisitedImg;
		this.noClassIntro = noClassIntro;
		this.isDelete = isDelete;
		this.noClassTime = noClassTime;
	}

	// Property accessors

	public Integer getNoClassId() {
		return this.noClassId;
	}

	public void setNoClassId(Integer noClassId) {
		this.noClassId = noClassId;
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

	public Integer getNoClassSetId() {
		return this.noClassSetId;
	}

	public void setNoClassSetId(Integer noClassSetId) {
		this.noClassSetId = noClassSetId;
	}

	public Integer getNoParentClassId() {
		return this.noParentClassId;
	}

	public void setNoParentClassId(Integer noParentClassId) {
		this.noParentClassId = noParentClassId;
	}

	public String getNoClassName() {
		return this.noClassName;
	}

	public void setNoClassName(String noClassName) {
		this.noClassName = noClassName;
	}

	public Integer getNoClassTotal() {
		return this.noClassTotal;
	}

	public void setNoClassTotal(Integer noClassTotal) {
		this.noClassTotal = noClassTotal;
	}

	public Integer getNoClassOrder() {
		return this.noClassOrder;
	}

	public void setNoClassOrder(Integer noClassOrder) {
		this.noClassOrder = noClassOrder;
	}

	public Integer getNoClassTopOrder() {
		return this.noClassTopOrder;
	}

	public void setNoClassTopOrder(Integer noClassTopOrder) {
		this.noClassTopOrder = noClassTopOrder;
	}

	public String getNoClassDefaultImg() {
		return this.noClassDefaultImg;
	}

	public void setNoClassDefaultImg(String noClassDefaultImg) {
		this.noClassDefaultImg = noClassDefaultImg;
	}

	public String getNoClassHoverImg() {
		return this.noClassHoverImg;
	}

	public void setNoClassHoverImg(String noClassHoverImg) {
		this.noClassHoverImg = noClassHoverImg;
	}

	public String getNoClassVisitedImg() {
		return this.noClassVisitedImg;
	}

	public void setNoClassVisitedImg(String noClassVisitedImg) {
		this.noClassVisitedImg = noClassVisitedImg;
	}

	public String getNoClassIntro() {
		return this.noClassIntro;
	}

	public void setNoClassIntro(String noClassIntro) {
		this.noClassIntro = noClassIntro;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getNoClassTime() {
		return this.noClassTime;
	}

	public void setNoClassTime(String noClassTime) {
		this.noClassTime = noClassTime;
	}

}