package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class GascardMerchPriceBean implements Serializable{
	private static final long serialVersionUID = 2394987581433697L;

	
	/**
	 * ÉÌÆ·Ãû³Æ
	 */
	private String mdseName;
	private BigDecimal facePrice;
	
	
	private Integer id;
	
	private String merchCode;
	private String coreMdse;
	private BigDecimal sellPrice;
	private String brandCode;
	public String getMdseName() {
		return mdseName;
	}
	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}
	public BigDecimal getFacePrice() {
		return facePrice;
	}
	public void setFacePrice(BigDecimal facePrice) {
		this.facePrice = facePrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMerchCode() {
		return merchCode;
	}
	public void setMerchCode(String merchCode) {
		this.merchCode = merchCode;
	}
	public String getCoreMdse() {
		return coreMdse;
	}
	public void setCoreMdse(String coreMdse) {
		this.coreMdse = coreMdse;
	}
	public BigDecimal getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	
	
}
