package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GascardDeliveryBean  implements Serializable{
	private static final long serialVersionUID = 19949837581433697L;
	// o.order_id,o.merchant_trans_seq,d.supplier_order_id,d.supplier,od.mdse_name,o.gas_card,od.mdse_num,o.order_date,o.dstatus
	/** ������ */
	private Integer orderId;
	/** ��Ʒ���� */
	private String mdseCode;
	/** ��Ӧ�̴��� */
	private String supplier;
	/** ��Ӧ�̶����� */
	private String supplierOrderId;
	/** ��ֵ״̬(00-��ֵ�ɹ�; 01-��ֵʧ��; 02-��ֵ��; 03-��ֵʧ��(����ʧ��״̬)) */
	private String dstatus;
	/** ͬ������ */
	private Integer synTimes;
	/** �������裨01-�˿�;02-ϵͳ������ */
	private String nstep;
	//������Ϣ=======
	/** ���� */
	private BigDecimal orderCash;
	/** ���� */
	private Integer cardNum;
	/** ��Ӧ����Ʒ���� */
	private String cardId;
	//������Ϣ=======end
	/** ������ID */
	private Integer logisticsId;
	/** ������ʱ�� */
	private String logisticsTime;
	/** ������ʼʱ�� */
	private String startTime;
	/** ��������ʱ�� */
	private String finishTime;
	/** �˵�״̬(00-�˵��ɹ�; 02-�˵���) */
	private String cstatus;
	/** ������Ϣ��ע */
	private String remark;
	/** ���ĵ��� */
	private String merchantTransSeq;

	public String getMerchantTransSeq() {
		return merchantTransSeq;
	}

	public void setMerchantTransSeq(String merchantTransSeq) {
		this.merchantTransSeq = merchantTransSeq;
	}

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getVersion() {
//		return version;
//	}
//
//	public void setVersion(Integer version) {
//		this.version = version;
//	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getMdseCode() {
		return mdseCode;
	}

	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierOrderId() {
		return supplierOrderId;
	}

	public void setSupplierOrderId(String supplierOrderId) {
		this.supplierOrderId = supplierOrderId;
	}

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

	public Integer getSynTimes() {
		return synTimes;
	}

	public void setSynTimes(Integer synTimes) {
		this.synTimes = synTimes;
	}

	public String getNstep() {
		return nstep;
	}

	public void setNstep(String nstep) {
		this.nstep = nstep;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getCstatus() {
		return cstatus;
	}

	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Integer getLogisticsId() {
		return logisticsId;
	}

	public void setLogisticsId(Integer logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getLogisticsTime() {
		return logisticsTime;
	}

	public void setLogisticsTime(String logisticsTime) {
		this.logisticsTime = logisticsTime;
	}

	public Integer getCardNum() {
		return cardNum;
	}

	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}

	public BigDecimal getOrderCash() {
		return orderCash;
	}

	public void setOrderCash(BigDecimal orderCash) {
		this.orderCash = orderCash;
	}

}
