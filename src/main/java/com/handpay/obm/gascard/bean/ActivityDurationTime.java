package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ActivityDurationTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2011759627205861501L;
	/**
	 * ���ڻ��ʼʱ��
	 */
	private String startDate;
	/**
	 * ���ڻ����ʱ��
	 */
	private String endDate;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
