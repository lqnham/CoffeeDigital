package com.coffee.digital.core.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class CoffeeDigitalException extends RuntimeException {
    private HttpStatus status;
    private String message;
    private List<String> errors;

    public CoffeeDigitalException(final HttpStatus status, final String message, final List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public CoffeeDigitalException(final HttpStatus status, final String message, final String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        //Dont want print StackTrace
        return null;

    }
}
