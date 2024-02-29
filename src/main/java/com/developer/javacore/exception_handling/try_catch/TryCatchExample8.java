package com.developer.javacore.exception_handling.try_catch;

/*
In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
* */
public class TryCatchExample8{
    public static void main(String[] args) {
        try{
            int data=50/0; //may throw exception
        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
    }
}
