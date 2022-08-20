package com.moseswilliamsiii.realestate.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomHouseException extends RuntimeException{
    public CustomHouseException(String message) {
        super(message);

    }
}
