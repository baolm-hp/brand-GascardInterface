package com.handpay.obm.gascard.bean;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * 加油卡卡号信息查询——返回Bean对象
 * @author jczhang
 * @date   2015-10-09
 */
public class GascardCardNoInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3908146682735602426L;
	
	//错误描述，如请求得到正确返回，此处将为空
	private String err_msg;
	//操作返回代码，1成功,err_msg为空，其它数字具体错误在err_msg返回
	private String retcode;
	//加油卡号（充值账号）中石化：以100011开头共19位、中石油：以9开头共16位
	private String game_userid;
	//持卡人姓名
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
