package com.handpay.obm.gascard.enums;

import org.apache.commons.lang.StringUtils;

/**
 * Created by liliu on 2016/1/28.
 */

public enum CheckingMethod {
    GEN("00", "我们出对账文件"), GET("01", "对方出对账文件URL");

    private String code;
    private String desc;

    private CheckingMethod(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static CheckingMethod valueOfCode(String code) {
        for (CheckingMethod status : values()) {
            if (StringUtils.equals(code, status.getCode())) {
                return status;
            }
        }
        return null;
    }
}