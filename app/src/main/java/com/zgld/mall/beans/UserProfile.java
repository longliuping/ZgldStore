package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * UserProfile entity. @author MyEclipse Persistence Tools
 */
public class UserProfile extends AbstractUserProfile implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserProfile() {
	}

	/** full constructor */
	public UserProfile(Integer userId, Integer enablePrivateMessages, Integer enableOnlineStatus, Integer enableEmail, Integer enableHtmlEmail, String publicToken, Double expenditure, Integer enableTradePassword, String tradePassword, String realName, Integer points, Integer regionId, String address, String qq, String msn, String telPhone, String cellPhone, Integer userRank, String birthDate, Integer gender, Double balance, Double deductMoney) {
		super(userId, enablePrivateMessages, enableOnlineStatus, enableEmail, enableHtmlEmail, publicToken, expenditure, enableTradePassword, tradePassword, realName, points, regionId, address, qq, msn, telPhone, cellPhone, userRank, birthDate, gender, balance, deductMoney);
	}

}
