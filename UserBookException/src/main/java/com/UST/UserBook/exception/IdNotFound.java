package com.UST.UserBook.exception;

public class IdNotFound extends RuntimeException{
    public IdNotFound(String idNotFound) {
        super(idNotFound);
    }
}
