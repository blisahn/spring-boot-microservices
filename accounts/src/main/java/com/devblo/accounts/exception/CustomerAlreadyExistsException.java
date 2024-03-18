package com.devblo.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author blisahn 06.03.2024
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsException extends RuntimeException {


    public CustomerAlreadyExistsException(String message) {
        super(message);
    }

}
