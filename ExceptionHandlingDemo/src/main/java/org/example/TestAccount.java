package org.example;

public class TestAccount {

    public static void main(String[] args) {
        Account account = new Account(1,1000);
        try {
            account.withdraw(100);
            System.out.println("withdrawl success");
        } catch (CannotWithdrawException e) {
            System.out.println(e.getMessage());
        }
    }
}
