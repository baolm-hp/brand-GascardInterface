package com.handpay.obm.gascard.bean;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;

public class GascardDeliveryMdseBean extends GascardMdseBean{

	private static final long serialVersionUID = 1L;

	/* 实发数量  */
	private int actualNum;
	
	/* 进价 */
	private BigDecimal inPrice;
	
	private List<GascardBean> cardBeans;

	public int getActualNum() {
		return actualNum;
	}

	public void setActualNum(int actualNum) {
		this.actualNum = actualNum;
	}

	public BigDecimal getInPrice() {
		return inPrice;
	}

	public void setInPrice(BigDecimal inPrice) {
		this.inPrice = inPrice;
	}

	public List<GascardBean> getCardBeans() {
		return cardBeans;
	}

	public void setCardBeans(List<GascardBean> cardBeans) {
		this.cardBeans = cardBeans;
	}

	public String caseToModel(){
		return new Gson().toJson(this);
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}
