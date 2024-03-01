package com.developer.javacore.exception_handling.finally_block;
/*
Here is code segment showing how to use finally after try/catch statements even exception is not handled.
In this example, we're creating an error accessing an element of an array using invalid index.
As the catch block is not handling the exception, we can check in output that finally block is printing a statement signifying
 that finally block is getting executed.
* */
public class FinallyBlock_Ex2 {
    public static void main(String[] args) {
        int a [] = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        }catch (ArithmeticException e){
            System.out.println("Exception thrown :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
