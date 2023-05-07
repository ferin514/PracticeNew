package com.UST.CollegeDemo.exception;


import org.springdoc.api.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = IdNotFound.class)
    public ResponseEntity<ErrorMessage> IdNotFoundException(IdNotFound ex) {
        ErrorMessage errorMessage = new ErrorMessage( ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}

