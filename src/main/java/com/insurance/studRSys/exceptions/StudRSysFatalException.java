package com.insurance.studRSys.exceptions;

import com.insurance.studRSys.enums.Status;

public class StudRSysFatalException extends Exception implements StudRSysException {
    private String errorCode;

    public StudRSysFatalException(String errorCode) {
        super("");
        this.errorCode = errorCode;
    }

    public StudRSysFatalException(String errorMsg, Status errorCode) {
        super(errorMsg);
        this.errorCode = errorCode.name();
    }

    @Override
    public String getErrorMsg() {
        return errorCode;
    }

    @Override
    public void setErrorCode(String code) {
        this.errorCode = code;
    }
}
