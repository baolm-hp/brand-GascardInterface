package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardMerchBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8327123897827229482L;
	/**
	 * �̻�userid
	 */
	private Integer userId;
	/**
	 * �̻�����
	 */
	private String merchCode;
	/**
	 * �̻���
	 */
	private String merchName;
	/**
	 * �̻���������
	 */
	private String merchPwd;
	/**
	 * �̻�״̬ (00-����,01-ͣ��)
	 */
	private String merchStatus;
	/**
	 * key
	 */
	private String merchKey;
	/**
	 * �µ�ʱ��KEY,�̻��ṩ��key,Ŀǰ�Ƹ�ͨҪ���ֵ�ӿ�ʹ�ô�key
	 */
	private String merchOrderKey;
	/**
	 * �̻�����ʱ��
	 */
	private String createDate;
	/**
	 * ֧����ʽ��1-Ԥ����;2-�󸶷ѣ�
	 */
	private Integer payMode;
	
	private Integer version;

	/** �̻�IP */
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
