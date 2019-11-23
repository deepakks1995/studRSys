package com.insurance.studRSys.modal;

import com.insurance.studRSys.enums.Status;

public class Response {
    private String message;
    private String code;

    public Response(String message, Status code) {
        this.message = message;
        this.code = code.name();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
