package com.handpay.obm.gascard.bean;

import java.io.Serializable;

public class GascardDeliveryQueryBean implements Serializable {

	private static final long serialVersionUID = 19949837581433697L;

	/** 油卡 */
	private String gasCard;
	/** 接收号码 */
	private String iphone;
	/** 商户号 如腾讯 */
	private String merchantCode;
	/** 供应商代码 */
	private String supplier;

	/** 订单号 */
	private Integer orderId;
	/** 核心单号 */
	private String merchantTransSeq;
	/** 充值状态(00-充值成功; 02-充值中; 01-充值失败) */
	private String dstatus;
	/** 订单创建时间 从 */
	private String orderTimeFrom;
	/** 订单创建时间 到 */
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
