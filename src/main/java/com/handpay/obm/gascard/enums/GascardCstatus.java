package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

//һ�κ˵�״̬
public enum GascardCstatus {
	DOING("02", "�˵���"), //һ�κ˵����ڽ���
	FINISH("00", "�˵��ɹ�"); //�������ں˵�

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
