package com.xn.subpack.pojo;

public enum StatusEnum {
    OK(0, "OK");


    private int status;
    private String msg;

    private StatusEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    // 获取Msg
    public static String getMsg(int status) {
        for (StatusEnum c : StatusEnum.values()) {
            if (c.getStatus() == status) {
                return c.msg;
            }
        }
        return null;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
