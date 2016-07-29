package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardOrderDeliveryResultBean implements Serializable {

	private static final long serialVersionUID = 19949837581433697L;
	// o.order_id,o.merchant_trans_seq,d.supplier_order_id,d.supplier,od.mdse_name,o.gas_card,od.mdse_num,o.order_date,o.dstatus
	// private Integer rnum;
	/** ������ */
	private Integer orderId;

	/** ���ĵ��� */
	private String merchantTransSeq;

	/** ��Ӧ�̶����� */
	private String supplierOrderId;

	/** ��Ӧ�̴��� */
	private String supplier;

	private String mdseName;
	/** �Ϳ� */
	private String gasCard;

	private Integer mdseNum;
	/** Ӧ�ö���ʱ�� */
	private String orderDate;

	/** ��ֵ״̬(00-��ֵ�ɹ�; 02-��ֵ��; 01-��ֵʧ��) */
	private String dstatus;

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

	public String getSupplierOrderId() {
		return supplierOrderId;
	}

	public void setSupplierOrderId(String supplierOrderId) {
		this.supplierOrderId = supplierOrderId;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getMdseName() {
		return mdseName;
	}

	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}

	public String getGasCard() {
		return gasCard;
	}

	public void setGasCard(String gasCard) {
		this.gasCard = gasCard;
	}

	public Integer getMdseNum() {
		return mdseNum;
	}

	public void setMdseNum(Integer mdseNum) {
		this.mdseNum = mdseNum;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

}
