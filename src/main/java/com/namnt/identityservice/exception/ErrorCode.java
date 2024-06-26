package com.namnt.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters"),
    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXISTED(1002, "User existed"),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    USER_NOT_EXISTED(1005, "User not existed");

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public java.lang.String getMessage() {
        return message;
    }
}
