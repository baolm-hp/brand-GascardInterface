package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

public enum CheckingStatus {
	SUCCESS("00", "对账成功"), FAIL("01", "对账失败"),DOING("02", "对账中");

	private String code;
	private String desc;

	private CheckingStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static CheckingStatus valueOfCode(String code) {
		for (CheckingStatus status : values()) {
			if (StringUtils.equals(code, status.getCode())) {
				return status;
			}
		}
		return null;
	}
}
