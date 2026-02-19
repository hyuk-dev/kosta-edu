package com.ws06.exception;

public class UserAccountNotFoundException extends Exception{
    public UserAccountNotFoundException(String message) {
        super(message);
    }
}
