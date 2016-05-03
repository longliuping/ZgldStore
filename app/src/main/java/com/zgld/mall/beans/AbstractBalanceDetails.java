package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractBalanceDetails entity provides the base persistence definition of the
 * BalanceDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBalanceDetails implements java.io.Serializable {
// Fields
	// Fields

	private Integer balanceId;
	private Integer userId;
	private String tradeDate;
	private String income;
	private Double expenses;
	private Double reduced;
	private Double balance;
	private Integer payer;
	private Integer payee;
	private String remark;
	private Integer payTypeId;// 支付类型
	private String payTradeNo;// 支付交易号
	private String payDateTime;// 交易付款时间
	private Double payTotalFee;//  交易付款金额
	private String buyerId;// 买家用户ID(支付宝ID)
	private String buyerAccount;// 买家账号(支付宝账号)
	// Constructors

	/** default constructor */
	public AbstractBalanceDetails() {
	}


	// Property accessors

	public Integer getBalanceId() {
		return this.balanceId;
	}

	public void setBalanceId(Integer balanceId) {
		this.balanceId = balanceId;
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

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public Double getExpenses() {
		return this.expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public Double getReduced() {
		return this.reduced;
	}

	public void setReduced(Double reduced) {
		this.reduced = reduced;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getPayer() {
		return this.payer;
	}

	public void setPayer(Integer payer) {
		this.payer = payer;
	}

	public Integer getPayee() {
		return this.payee;
	}

	public void setPayee(Integer payee) {
		this.payee = payee;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Integer getPayTypeId() {
		return payTypeId;
	}


	public void setPayTypeId(Integer payTypeId) {
		this.payTypeId = payTypeId;
	}


	public String getPayTradeNo() {
		return payTradeNo;
	}


	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}


	public String getPayDateTime() {
		return payDateTime;
	}


	public void setPayDateTime(String payDateTime) {
		this.payDateTime = payDateTime;
	}


	public Double getPayTotalFee() {
		return payTotalFee;
	}


	public void setPayTotalFee(Double payTotalFee) {
		this.payTotalFee = payTotalFee;
	}


	public String getBuyerId() {
		return buyerId;
	}


	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}


	public String getBuyerAccount() {
		return buyerAccount;
	}


	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

}