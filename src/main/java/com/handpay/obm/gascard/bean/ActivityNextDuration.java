package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * ��ڼ����
 * 
 * @version 1.0 2015-6-3
 * @author "lmbao"
 * 
 */
public class ActivityNextDuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214279081302639846L;
	/**
	 * �Ƿ��ڼ�
	 */
	private boolean isActDuration;
	/**
	 * ��һ�ڻʱ��
	 */
	private Date nextActTime;

	public boolean isActDuration() {
		return isActDuration;
	}

	public void setActDuration(boolean isActDuration) {
		this.isActDuration = isActDuration;
	}

	public Date getNextActTime() {
		return nextActTime;
	}

	public void setNextActTime(Date nextActTime) {
		this.nextActTime = nextActTime;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
