package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OfcardOrderBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1460976917053151893L;
	
	private String retcode;//������
	private String ofcardOrderid;//������
	private String cardid;//��Ʒ���
	private String cardnum;//������
	private String ordercash;//�ܽ��
	private String cardname;//��Ʒ��
	private String sporder_id;//Ӧ�õ�������
	private String game_state;//����ɹ���Ϊ1������(��ֵʧ��)Ϊ9����ֵ��Ϊ0,ֻ�ܵ�״̬Ϊ9ʱ���̻��ſ����˿���û���
	private String err_msg;
	
	public String getRetcode() {
		return retcode;
	}
	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getOrdercash() {
		return ordercash;
	}
	public void setOrdercash(String ordercash) {
		this.ordercash = ordercash;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getSporder_id() {
		return sporder_id;
	}
	public void setSporder_id(String sporder_id) {
		this.sporder_id = sporder_id;
	}
	public String getGame_state() {
		return game_state;
	}
	public void setGame_state(String game_state) {
		this.game_state = game_state;
	}
	public String getOfcardOrderid() {
		return ofcardOrderid;
	}
	public void setOfcardOrderid(String ofcardOrderid) {
		this.ofcardOrderid = ofcardOrderid;
	}
	public String getErr_msg() {
		return err_msg;
	}
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
