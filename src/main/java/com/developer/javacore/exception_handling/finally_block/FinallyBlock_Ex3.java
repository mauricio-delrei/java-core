package com.developer.javacore.exception_handling.finally_block;

/*
Here is code segment showing how to use finally block where a method can return a value within try block.
In this example, we're returning a value within try block.
We can check in output that finally block is printing a statement signifying that finally block is getting executed
 even after method returned a value to caller function.
*
* */
public class FinallyBlock_Ex3 {
    public static void main(String[] args) {
        System.out.println(testFinallyBlock());
    }

    private static int testFinallyBlock() {
        int a [] = new int[2];
        try{
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        return 0;
    }
}
