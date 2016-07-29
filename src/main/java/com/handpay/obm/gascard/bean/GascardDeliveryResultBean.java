package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GascardDeliveryResultBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer orderId;
	
	private String orderTime;
	
	private Integer logisticsId;
	
	private String logisticsTime;
	
	private Integer coreOrderId;
	
	private String coreOrderTime;
	
	/*供货商订单ID*/
	private String supplierOrderId;
	
	private Date supplierOrderTime;
	
	/**
	 * 供应商充值状态
	 */
	private String supplierState;
	
	private String supplierCode;
	
	/*总进价*/
	private BigDecimal totalInprice;
	
	private String remark;
	
	private GascardDeliveryMdseBean deliveryMdseBean;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
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

	public Integer getCoreOrderId() {
		return coreOrderId;
	}

	public void setCoreOrderId(Integer coreOrderId) {
		this.coreOrderId = coreOrderId;
	}

	public String getCoreOrderTime() {
		return coreOrderTime;
	}

	public void setCoreOrderTime(String coreOrderTime) {
		this.coreOrderTime = coreOrderTime;
	}

	public String getSupplierOrderId() {
		return supplierOrderId;
	}

	public void setSupplierOrderId(String supplierOrderId) {
		this.supplierOrderId = supplierOrderId;
	}

	public Date getSupplierOrderTime() {
		return supplierOrderTime;
	}

	public void setSupplierOrderTime(Date supplierOrderTime) {
		this.supplierOrderTime = supplierOrderTime;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public BigDecimal getTotalInprice() {
		return totalInprice;
	}

	public void setTotalInprice(BigDecimal totalInprice) {
		this.totalInprice = totalInprice;
	}

	public GascardDeliveryMdseBean getDeliveryMdseBean() {
		return deliveryMdseBean;
	}

	public void setDeliveryMdseBean(GascardDeliveryMdseBean deliveryMdseBean) {
		this.deliveryMdseBean = deliveryMdseBean;
	}

	public String getSupplierState() {
		return supplierState;
	}

	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
