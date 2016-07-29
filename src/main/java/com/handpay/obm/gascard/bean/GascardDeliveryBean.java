package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GascardDeliveryBean  implements Serializable{
	private static final long serialVersionUID = 19949837581433697L;
	// o.order_id,o.merchant_trans_seq,d.supplier_order_id,d.supplier,od.mdse_name,o.gas_card,od.mdse_num,o.order_date,o.dstatus
	/** 订单号 */
	private Integer orderId;
	/** 商品代码 */
	private String mdseCode;
	/** 供应商代码 */
	private String supplier;
	/** 供应商订单号 */
	private String supplierOrderId;
	/** 充值状态(00-充值成功; 01-充值失败; 02-充值中; 03-充值失败(最终失败状态)) */
	private String dstatus;
	/** 同步次数 */
	private Integer synTimes;
	/** 后续步骤（01-退款;02-系统补发） */
	private String nstep;
	//返回信息=======
	/** 进价 */
	private BigDecimal orderCash;
	/** 数量 */
	private Integer cardNum;
	/** 供应商商品代码 */
	private String cardId;
	//返回信息=======end
	/** 物流单ID */
	private Integer logisticsId;
	/** 物流单时间 */
	private String logisticsTime;
	/** 发货开始时间 */
	private String startTime;
	/** 发货结束时间 */
	private String finishTime;
	/** 核单状态(00-核单成功; 02-核单中) */
	private String cstatus;
	/** 发货信息备注 */
	private String remark;
	/** 核心单号 */
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
