package com.handpay.obm.gascard.enums;


public enum SupplierType {
	Arbitrary(1,"任意充类型"),Direct(0,"直充");
	
	private int code;
	private String desc;
	private SupplierType(int code,String desc){
		this.code=code;
		this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static SupplierType valueOfCode(int code) {
		for (SupplierType type : values()) {
			if (type.getCode() == code) {
				return type;
			}
		}
		return null;
	}
}
