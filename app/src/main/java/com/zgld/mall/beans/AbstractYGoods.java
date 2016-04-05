package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoods entity provides the base persistence definition of the YGoods
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoods implements java.io.Serializable {

	// Fields

	private Integer goId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer shipId;
	private Integer goClassSetId;
	private Integer goBrandSetId;
	private String goName;
	private String goKeywords;
	private String goIntro;
	private String goDetail;
	private String goMobileDetail;
	private String goNumber;
	private Integer goSellCount;
	private Integer goCount;
	private Integer goHits;
	private Double goBidPrice;
	private Double goSalePrice;
	private String goThumb;
	private Integer goFreeShipping;
	private Integer goIsNew;
	private Integer goIsHot;
	private Integer goIsState;
	private Integer goIsPromote;
	private Integer goOrder;
	private Integer goTopOrder;
	private Integer isDelete;
	private String goTime;

	// Constructors

	/** default constructor */
	public AbstractYGoods() {
	}

	/** minimal constructor */
	public AbstractYGoods(Double goSalePrice, String goTime) {
		this.goSalePrice = goSalePrice;
		this.goTime = goTime;
	}

	/** full constructor */
	public AbstractYGoods(Integer unitSetId, Integer accountActId, Integer shipId, Integer goClassSetId, Integer goBrandSetId, String goName, String goKeywords, String goIntro, String goDetail, String goMobileDetail, String goNumber, Integer goSellCount, Integer goCount, Integer goHits, Double goBidPrice, Double goSalePrice, String goThumb, Integer goFreeShipping, Integer goIsNew, Integer goIsHot, Integer goIsState, Integer goIsPromote, Integer goOrder, Integer goTopOrder, Integer isDelete, String goTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.shipId = shipId;
		this.goClassSetId = goClassSetId;
		this.goBrandSetId = goBrandSetId;
		this.goName = goName;
		this.goKeywords = goKeywords;
		this.goIntro = goIntro;
		this.goDetail = goDetail;
		this.goMobileDetail = goMobileDetail;
		this.goNumber = goNumber;
		this.goSellCount = goSellCount;
		this.goCount = goCount;
		this.goHits = goHits;
		this.goBidPrice = goBidPrice;
		this.goSalePrice = goSalePrice;
		this.goThumb = goThumb;
		this.goFreeShipping = goFreeShipping;
		this.goIsNew = goIsNew;
		this.goIsHot = goIsHot;
		this.goIsState = goIsState;
		this.goIsPromote = goIsPromote;
		this.goOrder = goOrder;
		this.goTopOrder = goTopOrder;
		this.isDelete = isDelete;
		this.goTime = goTime;
	}

	// Property accessors

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
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

	public Integer getShipId() {
		return this.shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public Integer getGoClassSetId() {
		return this.goClassSetId;
	}

	public void setGoClassSetId(Integer goClassSetId) {
		this.goClassSetId = goClassSetId;
	}

	public Integer getGoBrandSetId() {
		return this.goBrandSetId;
	}

	public void setGoBrandSetId(Integer goBrandSetId) {
		this.goBrandSetId = goBrandSetId;
	}

	public String getGoName() {
		return this.goName;
	}

	public void setGoName(String goName) {
		this.goName = goName;
	}

	public String getGoKeywords() {
		return this.goKeywords;
	}

	public void setGoKeywords(String goKeywords) {
		this.goKeywords = goKeywords;
	}

	public String getGoIntro() {
		return this.goIntro;
	}

	public void setGoIntro(String goIntro) {
		this.goIntro = goIntro;
	}

	public String getGoDetail() {
		return this.goDetail;
	}

	public void setGoDetail(String goDetail) {
		this.goDetail = goDetail;
	}

	public String getGoMobileDetail() {
		return this.goMobileDetail;
	}

	public void setGoMobileDetail(String goMobileDetail) {
		this.goMobileDetail = goMobileDetail;
	}

	public String getGoNumber() {
		return this.goNumber;
	}

	public void setGoNumber(String goNumber) {
		this.goNumber = goNumber;
	}

	public Integer getGoSellCount() {
		return this.goSellCount;
	}

	public void setGoSellCount(Integer goSellCount) {
		this.goSellCount = goSellCount;
	}

	public Integer getGoCount() {
		return this.goCount;
	}

	public void setGoCount(Integer goCount) {
		this.goCount = goCount;
	}

	public Integer getGoHits() {
		return this.goHits;
	}

	public void setGoHits(Integer goHits) {
		this.goHits = goHits;
	}

	public Double getGoBidPrice() {
		return this.goBidPrice;
	}

	public void setGoBidPrice(Double goBidPrice) {
		this.goBidPrice = goBidPrice;
	}

	public Double getGoSalePrice() {
		return this.goSalePrice;
	}

	public void setGoSalePrice(Double goSalePrice) {
		this.goSalePrice = goSalePrice;
	}

	public String getGoThumb() {
		return this.goThumb;
	}

	public void setGoThumb(String goThumb) {
		this.goThumb = goThumb;
	}

	public Integer getGoFreeShipping() {
		return this.goFreeShipping;
	}

	public void setGoFreeShipping(Integer goFreeShipping) {
		this.goFreeShipping = goFreeShipping;
	}

	public Integer getGoIsNew() {
		return this.goIsNew;
	}

	public void setGoIsNew(Integer goIsNew) {
		this.goIsNew = goIsNew;
	}

	public Integer getGoIsHot() {
		return this.goIsHot;
	}

	public void setGoIsHot(Integer goIsHot) {
		this.goIsHot = goIsHot;
	}

	public Integer getGoIsState() {
		return this.goIsState;
	}

	public void setGoIsState(Integer goIsState) {
		this.goIsState = goIsState;
	}

	public Integer getGoIsPromote() {
		return this.goIsPromote;
	}

	public void setGoIsPromote(Integer goIsPromote) {
		this.goIsPromote = goIsPromote;
	}

	public Integer getGoOrder() {
		return this.goOrder;
	}

	public void setGoOrder(Integer goOrder) {
		this.goOrder = goOrder;
	}

	public Integer getGoTopOrder() {
		return this.goTopOrder;
	}

	public void setGoTopOrder(Integer goTopOrder) {
		this.goTopOrder = goTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getGoTime() {
		return this.goTime;
	}

	public void setGoTime(String goTime) {
		this.goTime = goTime;
	}

}