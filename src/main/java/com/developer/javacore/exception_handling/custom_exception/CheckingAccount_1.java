package com.developer.javacore.exception_handling.custom_exception;

/*
To demonstrate using our user-defined exception, the following CheckingAccount class
 contains a withdraw() method that throws an InsufficientFundsException.
* */
public class CheckingAccount_1 {
    private double balance;
    private int number;

    public CheckingAccount_1(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException_1(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
