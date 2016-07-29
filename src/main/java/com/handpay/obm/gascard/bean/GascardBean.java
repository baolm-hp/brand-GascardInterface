package com.handpay.obm.gascard.bean;

import java.io.Serializable;
import java.util.Date;

public class GascardBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/* ���� */
	private String cardNo;

	/* ���� */
	private String cardPwd;

	/* ����ʱ�� */
	private Date expiredTime;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPwd() {
		return cardPwd;
	}

	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	@Override
	public String toString() {
		/* ��Ҫ������toString������ */
		// String str = "cardno=" + this.cardNo + ", cardpws=" + this.cardPwd;
		// if(this.expiredTime!=null)str+=", expiretime=" +
		// this.expiredTime.getTime();
		// return str;
		return cardNo + "," + cardPwd;
	}

}
