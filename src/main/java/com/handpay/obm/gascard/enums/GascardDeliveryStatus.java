package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

public enum GascardDeliveryStatus {
	INIT("04","待充值"),
	SUCCESS("00", "充值成功"),
	FAIL("01", "充值失败"),
	PROCESSING("02", "充值中"),
	ERROR("03", "充值异常");

	private String code;
	private String desc;

	private GascardDeliveryStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardDeliveryStatus valueOfCode(String code) {
		for (GascardDeliveryStatus status : values()) {
			if (StringUtils.equals(code, status.getCode())) {
				return status;
			}
		}
		return null;
	}
}
