package org.example;

public class CannotWithdrawException extends  Exception{
    public CannotWithdrawException(String message) {
        super(message);
    }
}
