package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GascardMdseBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* 券卡业务系统商品代码 */
	private String mdseCode;
	
	/* 券卡业务系统商品名称 */
	private String mdseName;
	
	/* 券卡业务系统SKU库存标识 */
	private String skuStockId;
	
	/* 供应商代码 */
	private String supplierCode;
	
	/* 应发数量 */
	private int num;
	
	/* 面值 */
	private BigDecimal faceValue;
	
	/* 供应商商品代码 */
	private String supplierMdseCode;
	
	public String getMdseCode() {
		return mdseCode;
	}

	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}

	public String getMdseName() {
		return mdseName;
	}

	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}

	public String getSkuStockId() {
		return skuStockId;
	}

	public void setSkuStockId(String skuStockId) {
		this.skuStockId = skuStockId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public BigDecimal getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}

	public String getSupplierMdseCode() {
		return supplierMdseCode;
	}

	public void setSupplierMdseCode(String supplierMdseCode) {
		this.supplierMdseCode = supplierMdseCode;
	}
	
}
