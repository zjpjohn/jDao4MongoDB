package com.fan1tuan.business.support.enums;

/**
 * Created by Li He on 2014/4/22.
 * @author Li He
 */
public enum ResultStatus {
    SUCCESS,NEED_LOGIN,UNKNOWN_ERROR;

    private String message;

    private ResultStatus(){

    }

    public void rawMessage(String message){
        this.message = message;
    }
    public String rawMessage(){
        return message;
    }

}