package org.example;

public class Account {
    private int aid;
    private double balance;

    public Account(int aid, double balance) {
        this.aid = aid;
        this.balance = balance;
    }
    public boolean withdraw(double amount) throws CannotWithdrawException {
        if(amount == 0)
           // return  false; //
            throw  new CannotWithdrawException("Withdrawal amount cannot be 0");
        if(amount > balance)
            //return  false; //
            throw  new CannotWithdrawException("Withdrawal amount cannot be greater than balance available");
        if(amount == balance)
//            return  false;
            throw  new CannotWithdrawException("Withdrawal amount cannot be same as balance");
        balance -= amount;
        return true;
    }
}
