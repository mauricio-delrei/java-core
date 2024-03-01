package com.developer.javacore.exception_handling.custom_exception;

/*
Java Custom Exception
The custom exception refers to the creation of your own exception to customize an exception according to the needs.
The custom exceptions are derived from the Exception class.
Need of Java Custom Exceptions
To categorize the exceptions based on the different types of errors in your project.
To allow application-level exception handling.
Create a Custom Exception in Java
To create a custom exception, you need to create a class that must be inherited from the Exception class.

You just need to extend the predefined Exception class to create your own Exception.
These are considered to be checked exceptions.

Rules to Create Custom Exception
Keep the following points in mind when writing your own exception classes:

All exceptions must be a child of Throwable.
If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule,
 you need to extend the Exception class.
If you want to write a runtime exception, you need to extend the RuntimeException class.
* */
public class InsufficientFundsException extends Exception{
    /*
    The following InsufficientFundsException class is a user-defined exception that extends the Exception class,
     making it a checked exception.
    An exception class is like any other class, containing useful fields and methods.
    * */

    private double amount;

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
