package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OfcardOrderBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1460976917053151893L;
	
	private String retcode;//操作码
	private String ofcardOrderid;//订单号
	private String cardid;//商品编号
	private String cardnum;//发货数
	private String ordercash;//总金额
	private String cardname;//商品名
	private String sporder_id;//应用单订单号
	private String game_state;//如果成功将为1，澈消(充值失败)为9，充值中为0,只能当状态为9时，商户才可以退款给用户。
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
