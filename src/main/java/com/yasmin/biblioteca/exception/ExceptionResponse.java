package com.yasmin.biblioteca.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExceptionResponse {

    private String name;
    private Object cause;
    private LocalDateTime timestamp;
    private HttpStatus httpStatus;
}