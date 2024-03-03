package com.developer.javacore.exception_handling.custom_exception;

//The following BankDemo program demonstrates invoking the deposit() and withdraw() methods of CheckingAccount.
public class BankDemo_1 {
    public static void main(String[] args) {
        CheckingAccount_1 checkingAccount = new CheckingAccount_1(101);
        System.out.println("Depositing 500GBP");
        checkingAccount.deposit(500.00);


        System.out.println("\nWithdrawing 100GBP...");
        checkingAccount.withdraw(100.00);
        System.out.println("\nWithdrawing 600GBP...");
        checkingAccount.withdraw(600.00);

    }
}
