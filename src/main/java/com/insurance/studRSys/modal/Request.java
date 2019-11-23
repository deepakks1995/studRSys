package com.insurance.studRSys.modal;

public class Request<T> {

    T data;

    public Request(String token, String adminId, T data) {

        this.data = data;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
