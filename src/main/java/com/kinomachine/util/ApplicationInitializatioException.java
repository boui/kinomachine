package com.kinomachine.util;

public class ApplicationInitializatioException extends RuntimeException{
    public ApplicationInitializatioException() {
    }

    public ApplicationInitializatioException(String message) {
        super(message);
    }

    public ApplicationInitializatioException(String message, Throwable cause) {
        super(message, cause);
    }
}
