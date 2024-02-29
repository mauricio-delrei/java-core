package com.developer.javacore.exception_handling.try_catch;

//Let's see an example to print a custom message on exception.
public class TryCatchExample5 {
    public static void main(String[] args) {
        try {
            int data=50/0; //may throw exception
        }
        // handling the exception
        catch (Exception e){
            // displaying the custom message
            System.out.println("Cannot divided by zero");
        }
    }
}
