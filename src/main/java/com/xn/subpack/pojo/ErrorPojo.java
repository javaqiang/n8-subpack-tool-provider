package com.xn.subpack.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xn.subpack.pojo.StatusEnum;

public class ErrorPojo extends com.xn.subpack.pojo.BasePojo {
    @JsonIgnore
    private StatusEnum statusEnum;
    private int error_code;
    private int error_message;
    private String error_reason;


    public ErrorPojo() {

    }

    public ErrorPojo(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
        this.error_code = statusEnum.getStatus();
        this.error_reason = statusEnum.getMsg();
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.error_code = statusEnum.getStatus();
        this.error_reason = statusEnum.getMsg();
        this.statusEnum = statusEnum;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public int getError_message() {
        return error_message;
    }

    public void setError_message(int error_message) {
        this.error_message = error_message;
    }

    public String getError_reason() {
        return error_reason;
    }

    public void setError_reason(String error_reason) {
        this.error_reason = error_reason;
    }

    public static ErrorPojo error(StatusEnum statusEnum) {
        return new ErrorPojo(statusEnum);
    }

    public static ErrorPojo error(StatusEnum statusEnum, String error_reason) {
        ErrorPojo errorPojo = new ErrorPojo(statusEnum);
        errorPojo.error_reason = error_reason;
        return errorPojo;
    }
}
