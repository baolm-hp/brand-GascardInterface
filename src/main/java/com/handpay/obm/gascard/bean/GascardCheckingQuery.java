package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardCheckingQuery implements Serializable{
	private static final long serialVersionUID = 139949837581433697L;
	private String fromDay;
	private String toDay;
	private String merchCode;
	public String getFromDay() {
		return fromDay;
	}
	public void setFromDay(String fromDay) {
		this.fromDay = fromDay;
	}
	public String getToDay() {
		return toDay;
	}
	public void setToDay(String toDay) {
		this.toDay = toDay;
	}
	public String getMerchCode() {
		return merchCode;
	}
	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}
	
	
	
	
	
	
}
