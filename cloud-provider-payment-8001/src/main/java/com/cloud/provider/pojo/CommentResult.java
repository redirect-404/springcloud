package com.cloud.provider.pojo;


import java.io.Serializable;


public class CommentResult<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommentResult(){
    }

    public CommentResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;

    }


}
