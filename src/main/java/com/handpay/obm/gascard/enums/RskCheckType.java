package com.handpay.obm.gascard.enums;

import org.apache.commons.lang3.StringUtils;

public enum RskCheckType {
	TIME_CHECK	("01", "ʵʱ��֤"),
	CHECK_FAIL	("02", "��֤ʧ��");
	
	private String code;
    private String desc;
    
    private RskCheckType (String code, String desc) {
    	this.code = code;
    	this.desc = desc;
    }

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
    public static RskCheckType valueOfCode(String code) {
    	for(RskCheckType rskCheckType : values()){
    		if(StringUtils.equals(code, rskCheckType.getCode())){
    			return rskCheckType;
    		}
    	}
    	return null;
    }
}
