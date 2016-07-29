package com.handpay.obm.gascard.enums;


public enum MdseStatus {
	Sellable(1, "可售"), Unsellable(0, "不可售");

	private Integer code;
	private String desc;

	private MdseStatus(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static MdseStatus valueOfCode(Integer code) {
		for (MdseStatus status : values()) {
			if (code==status.getCode()) {
				return status;
			}
		}
		return null;
	}
}
