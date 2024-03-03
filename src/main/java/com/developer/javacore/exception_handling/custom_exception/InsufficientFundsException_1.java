package com.developer.javacore.exception_handling.custom_exception;

/*
Example to Create Custom Class by Extending Runtime Exception
We are extending the predefined RuntimeException class to create your own Exception as an unchecked exception.
The following InsufficientFundsException class is a user-defined exception that extends the RuntimeException class,
 making it a unchecked exception. An RuntimeException class is like any other class, containing useful fields and methods.
* */
public class InsufficientFundsException_1 extends RuntimeException {


    private final double amount;

    public InsufficientFundsException_1(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
