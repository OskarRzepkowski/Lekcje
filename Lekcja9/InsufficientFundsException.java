package com.company;


public class InsufficientFundsException extends RuntimeException {

    private final String wiad;

    public InsufficientFundsException(String message) {

        this.wiad = message;
    }
    @Override
    public String getMessage() {
        return wiad;
    }
}
