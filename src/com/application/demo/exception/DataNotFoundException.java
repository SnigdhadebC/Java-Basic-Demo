package com.application.demo.exception;
//User defined exception class
public class DataNotFoundException extends Throwable {

    private String message = null;
    public DataNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
