package com.yasmin.biblioteca.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GenericHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ExceptionResponse> handlerApiException(ApiException exception) {
        ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .name("ApiException")
                .cause(exception.getMessage())
                .httpStatus(exception.getHttpStatus())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(exceptionResponse, exception.getHttpStatus());
    }
}