package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GascardMdseBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* ȯ��ҵ��ϵͳ��Ʒ���� */
	private String mdseCode;
	
	/* ȯ��ҵ��ϵͳ��Ʒ���� */
	private String mdseName;
	
	/* ȯ��ҵ��ϵͳSKU����ʶ */
	private String skuStockId;
	
	/* ��Ӧ�̴��� */
	private String supplierCode;
	
	/* Ӧ������ */
	private int num;
	
	/* ��ֵ */
	private BigDecimal faceValue;
	
	/* ��Ӧ����Ʒ���� */
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
