package com.swlc.elepath.elepath.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class StandardResponse<T> {
    private int code;
    private String message;
    private T response;
    public StandardResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public StandardResponse(int code, String message, T response) {
        this.code = code;
        this.message = message;
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResponse() {
        return response;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResponse(T response) {
        this.response = response;
    }


}
