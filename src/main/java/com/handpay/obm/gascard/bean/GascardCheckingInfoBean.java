package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardCheckingInfoBean   implements Serializable{
	private static final long serialVersionUID = 239949837581433697L;
	private Integer id;
	private String checkingTime;
	private String checkingStatus;
	private String merchCode;
	private String merchName;
	private String createTime;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCheckingTime() {
		return checkingTime;
	}
	public void setCheckingTime(String checkingTime) {
		this.checkingTime = checkingTime;
	}
	public String getCheckingStatus() {
		return checkingStatus;
	}
	public void setCheckingStatus(String checkingStatus) {
		this.checkingStatus = checkingStatus;
	}
	public String getMerchCode() {
		return merchCode;
	}
	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMerchName() {
		return merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}
	
	
	
	
	
}
