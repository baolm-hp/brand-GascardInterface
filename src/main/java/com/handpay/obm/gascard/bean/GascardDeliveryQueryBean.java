package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardDeliveryQueryBean implements Serializable {

	private static final long serialVersionUID = 19949837581433697L;

	/** �Ϳ� */
	private String gasCard;
	/** ���պ��� */
	private String iphone;
	/** �̻��� ����Ѷ */
	private String merchantCode;
	/** ��Ӧ�̴��� */
	private String supplier;

	/** ������ */
	private Integer orderId;
	/** ���ĵ��� */
	private String merchantTransSeq;
	/** ��ֵ״̬(00-��ֵ�ɹ�; 02-��ֵ��; 01-��ֵʧ��) */
	private String dstatus;
	/** ��������ʱ�� �� */
	private String orderTimeFrom;
	/** ��������ʱ�� �� */
	private String orderTimeTo;

	public String getGasCard() {
		return gasCard;
	}

	public void setGasCard(String gasCard) {
		this.gasCard = gasCard;
	}

	public String getIphone() {
		return iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getMerchantTransSeq() {
		return merchantTransSeq;
	}

	public void setMerchantTransSeq(String merchantTransSeq) {
		this.merchantTransSeq = merchantTransSeq;
	}

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

	public String getOrderTimeFrom() {
		return orderTimeFrom;
	}

	public void setOrderTimeFrom(String orderTimeFrom) {
		this.orderTimeFrom = orderTimeFrom;
	}

	public String getOrderTimeTo() {
		return orderTimeTo;
	}

	public void setOrderTimeTo(String orderTimeTo) {
		this.orderTimeTo = orderTimeTo;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}
