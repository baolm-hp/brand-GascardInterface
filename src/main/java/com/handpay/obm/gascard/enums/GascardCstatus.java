package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

//一次核单状态
public enum GascardCstatus {
	DOING("02", "核单中"), //一次核单正在进行
	FINISH("00", "核单成功"); //不是正在核单

	private String code;
	private String desc;

	private GascardCstatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardCstatus valueOfCode(String code) {
		for (GascardCstatus status : values()) {
			if (StringUtils.equals(code, status.getCode())) {
				return status;
			}
		}
		return null;
	}
}
