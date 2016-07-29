package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OfcardInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2148063070808492148L;
	
	/** ��ֵ��״̬��1����ɹ���9������ */
	private String ret_code;
	/** SP������ */
	private String sporder_id;
	/** ����ʱ�� */
	private String ordersuccesstime;
	/** ʧ��ԭ�� */
	private String err_msg;
	/** �ٷ������� */
	private String gascard_code;
	
	public String getRet_code() {
		return ret_code;
	}
	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}
	public String getSporder_id() {
		return sporder_id;
	}
	public void setSporder_id(String sporder_id) {
		this.sporder_id = sporder_id;
	}
	public String getOrdersuccesstime() {
		return ordersuccesstime;
	}
	public void setOrdersuccesstime(String ordersuccesstime) {
		this.ordersuccesstime = ordersuccesstime;
	}
	public String getErr_msg() {
		return err_msg;
	}
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}
	public String getGascard_code() {
		return gascard_code;
	}
	public void setGascard_code(String gascard_code) {
		this.gascard_code = gascard_code;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
