package com.UST.SamplePractice.exception;

public class StudentIdNotFound extends RuntimeException{
    private static final long serialversionUID= 1L;
    public StudentIdNotFound(String message){
        super(message);
    }
}
