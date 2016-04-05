package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractBalanceDetails entity provides the base persistence definition of the
 * BalanceDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBalanceDetails implements java.io.Serializable {

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

	// Constructors

	/** default constructor */
	public AbstractBalanceDetails() {
	}

	/** full constructor */
	public AbstractBalanceDetails(Integer userId, String tradeDate, String income, Double expenses, Double reduced, Double balance, Integer payer, Integer payee, String remark) {
		this.userId = userId;
		this.tradeDate = tradeDate;
		this.income = income;
		this.expenses = expenses;
		this.reduced = reduced;
		this.balance = balance;
		this.payer = payer;
		this.payee = payee;
		this.remark = remark;
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

}