package com.developer.javacore.exception_handling.try_catch;


//Here, we handle the exception using the parent class exception.
public class TryCatchExample4 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception by using Exception class
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
    }
}