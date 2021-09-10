package com.exceptions;

public class CustomInputException extends NumberFormatException{
    public CustomInputException(String message) {
        super(message);
    }
}
