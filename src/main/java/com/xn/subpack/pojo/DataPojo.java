package com.xn.subpack.pojo;

public class DataPojo extends BasePojo {

    private int code;
    private int message;
    private String reason;


    public DataPojo() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
