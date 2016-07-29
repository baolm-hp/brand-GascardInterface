package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardMerchBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8327123897827229482L;
	/**
	 * 商户userid
	 */
	private Integer userId;
	/**
	 * 商户代码
	 */
	private String merchCode;
	/**
	 * 商户名
	 */
	private String merchName;
	/**
	 * 商户接入密码
	 */
	private String merchPwd;
	/**
	 * 商户状态 (00-正常,01-停用)
	 */
	private String merchStatus;
	/**
	 * key
	 */
	private String merchKey;
	/**
	 * 下单时的KEY,商户提供的key,目前财付通要求充值接口使用此key
	 */
	private String merchOrderKey;
	/**
	 * 商户创建时间
	 */
	private String createDate;
	/**
	 * 支付方式（1-预付费;2-后付费）
	 */
	private Integer payMode;
	
	private Integer version;

	/** 商户IP */
	private String merchIp;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMerchCode() {
		return merchCode;
	}

	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}

	public String getMerchPwd() {
		return merchPwd;
	}

	public void setMerchPwd(String merchPwd) {
		this.merchPwd = merchPwd;
	}

	public String getMerchStatus() {
		return merchStatus;
	}

	public void setMerchStatus(String merchStatus) {
		this.merchStatus = merchStatus;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getMerchKey() {
		return merchKey;
	}

	public void setMerchKey(String merchKey) {
		this.merchKey = merchKey;
	}

	public String getMerchName() {
		return merchName;
	}

	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public String getMerchOrderKey() {
		return merchOrderKey;
	}

	public void setMerchOrderKey(String merchOrderKey) {
		this.merchOrderKey = merchOrderKey;
	}

	public Integer getPayMode() {
		return payMode;
	}

	public void setPayMode(Integer payMode) {
		this.payMode = payMode;
	}

	public String getMerchIp() {
		return merchIp;
	}

	public void setMerchIp(String merchIp) {
		this.merchIp = merchIp;
	}
}
