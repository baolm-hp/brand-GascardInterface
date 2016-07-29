package com.handpay.obm.gascard.enums;

public enum GascardSupplierStatus {
	//供应商状态(1-启用；0-停用)
	Useable(1,"启用"),Unuseable(0,"停用");
	
	private int code;
	private String desc;
	private GascardSupplierStatus(int code,String desc){
		this.code=code;
		this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GascardSupplierStatus valueOfCode(int code) {
		for (GascardSupplierStatus type : values()) {
			if (type.getCode() == code) {
				return type;
			}
		}
		return null;
	}
}
