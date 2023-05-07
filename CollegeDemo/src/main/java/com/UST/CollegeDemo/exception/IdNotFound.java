package com.UST.CollegeDemo.exception;

public class IdNotFound extends RuntimeException{
    private static final long serialversionUID= 1L;
    public IdNotFound(String message){
        super(message);
    }
}



