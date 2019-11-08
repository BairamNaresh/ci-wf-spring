package com.nielsen.confirmit.exceptionHandler;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorDetails {
    private String details;
    private Integer statusCode;

    public ErrorDetails(String details, Integer statusCode) {
        this.details = details;
        this.statusCode = statusCode;
    }
}
