package com.zxb.spring.cloud.vo;

/**
 * @author Mr.zxb
 * @date 2018-11-12 16:18
 */
public class ResponseData {

    private boolean status = true;

    private int code = 200;

    private String message;

    private Object data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
