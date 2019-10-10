package com.enigma.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class InsufficientQuantityException extends RuntimeException {

    public InsufficientQuantityException() {
        super("Out Of Stock");
    }

    public InsufficientQuantityException(String message) {
        super(message);
    }

}
