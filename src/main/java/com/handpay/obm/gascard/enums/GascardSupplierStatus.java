package com.handpay.obm.gascard.enums;

public enum GascardSupplierStatus {
	//��Ӧ��״̬(1-���ã�0-ͣ��)
	Useable(1,"����"),Unuseable(0,"ͣ��");
	
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
