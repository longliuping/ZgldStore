package com.zgld.mall.beans;

/**
 * YRebateRelation entity. @author MyEclipse Persistence Tools
 */
public class YRebateRelation extends AbstractYRebateRelation implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YRebateRelation() {
	}

	/** full constructor */
	public YRebateRelation(Integer parentUserId, Integer currentUserId) {
		super(parentUserId, currentUserId);
	}
	YAccount account;
	public YAccount getAccount() {
		return account;
	}

	public void setAccount(YAccount account) {
		this.account = account;
	}
}
