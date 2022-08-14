package com.Banking.Exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
    }

    public UnauthorizedException(Throwable cause) {
        super(cause);
    }
}
