package com.developer.javacore.exception_handling.custom_exception;

//The following BankDemo program demonstrates invoking the deposit() and withdraw() methods of CheckingAccount.
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(101);
        System.out.println("Depositing 500GBP");
        checkingAccount.deposit(500.00);

        try{
            System.out.println("\nWithdrawing 100GBP...");
            checkingAccount.withdraw(100.00);
            System.out.println("\nWithdrawing 600GBP...");
            checkingAccount.withdraw(600.00);
        }catch (InsufficientFundsException e){
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
