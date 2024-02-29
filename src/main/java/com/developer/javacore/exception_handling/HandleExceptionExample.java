package com.developer.javacore.exception_handling;
/*
How to Handle Exception
So far we have seen, exception is beyond developer’s control.
But blaming your code failure on environmental issues is not a solution.
You need a Robust Programming, which takes care of exceptional situations.
Such code is known as Exception Handler.
* */
public class HandleExceptionExample{
    public static void main(String[] args) {
        try{
            // Code that may throw an exception
            int result = divide(10,0);
            System.out.println("Result :" + result);
        }catch (ArithmeticException e){
            // Handling the exception
            System.err.println("Error :" + e.getMessage());
        }
    }
    public static int divide(int numerator, int denominator){
        return numerator/denominator;
    }
}
