package com.zgld.mall.beans;

import java.io.Serializable;

public class OrderPayConfig implements Serializable{
	String orderId;
	String subject;//商品名称
	String body;//商品详情
	Double expenses;//费用
	Double total_fee;//商品金额
	String partner;//签约合作者身份ID
	String seller_id;//签约卖家支付宝账号
	String rsa_private;//商户私钥，pkcs8格式
	String rsa_public;//支付宝公钥
	String notify_url;//服务器异步通知页面路径
	public OrderPayConfig() {
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Double getExpenses() {
		return expenses;
	}
	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}
	public Double getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(Double total_fee) {
		this.total_fee = total_fee;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getRsa_private() {
		return rsa_private;
	}
	public void setRsa_private(String rsa_private) {
		this.rsa_private = rsa_private;
	}
	public String getRsa_public() {
		return rsa_public;
	}
	public void setRsa_public(String rsa_public) {
		this.rsa_public = rsa_public;
	}
	public String getNotify_url() {
		return notify_url;
	}
	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}
	
}
