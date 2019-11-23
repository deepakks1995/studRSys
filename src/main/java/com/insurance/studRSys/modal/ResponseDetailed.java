package com.insurance.studRSys.modal;

import com.insurance.studRSys.enums.Status;

public class ResponseDetailed<T> {
    private String message;
    private Status code;
    private T data;

    public ResponseDetailed(String message, Status code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status getCode() {
        return code;
    }

    public void setCode(Status code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
