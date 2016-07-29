package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * ���Ϳ�������Ϣ��ѯ��������Bean����
 * @author jczhang
 * @date   2015-10-09
 */
public class GascardCardNoInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3908146682735602426L;
	
	//����������������õ���ȷ���أ��˴���Ϊ��
	private String err_msg;
	//�������ش��룬1�ɹ�,err_msgΪ�գ��������־��������err_msg����
	private String retcode;
	//���Ϳ��ţ���ֵ�˺ţ���ʯ������100011��ͷ��19λ����ʯ�ͣ���9��ͷ��16λ
	private String game_userid;
	//�ֿ�������
	private String username;
	
	public String getErr_msg() {
		return err_msg;
	}
	
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}
	
	public String getRetcode() {
		return retcode;
	}
	
	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	
	public String getGame_userid() {
		return game_userid;
	}
	
	public void setGame_userid(String game_userid) {
		this.game_userid = game_userid;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
