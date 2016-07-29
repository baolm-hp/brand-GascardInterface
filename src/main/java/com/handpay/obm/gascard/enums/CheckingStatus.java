package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

public enum CheckingStatus {
	SUCCESS("00", "���˳ɹ�"), FAIL("01", "����ʧ��"),DOING("02", "������");

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
