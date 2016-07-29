package com.handpay.obm.gascard.enums;

public enum GascardMdseStatus {
	Useable(1,"∆Ù”√"),Unuseable(0,"Õ£”√");
	private int code;
	private String desc;
	private GascardMdseStatus(int code,String desc){
		this.code=code;
		this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardMdseStatus valueOfCode(int code) {
		for (GascardMdseStatus type : values()) {
			if (type.getCode() == code) {
				return type;
			}
		}
		return null;
	}
}
