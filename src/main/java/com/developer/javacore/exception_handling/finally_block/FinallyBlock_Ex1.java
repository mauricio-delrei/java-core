package com.developer.javacore.exception_handling.finally_block;

/*
The finally Block in Java
The finally block follows a try block or a catch block.
A finally block of code always executes, irrespective of occurrence of an Exception.
Using a finally block allows you to run any cleanup-type statements that you want to execute,
 no matter what happens in the protected code.

 Points To Remember While Using Finally Block

A catch clause cannot exist without a try statement.
It is not compulsory to have finally clauses whenever a try/catch block is present.
The try block cannot be present without either catch clause or finally clause.
Any code cannot be present in between the try, catch, finally blocks.
finally block is not executed in case exit() method is called before finally block or a fatal error occurs in program execution.
finally block is executed even method returns a value before finally block.

Why Java Finally Block Used?
Java finally block can be used for clean-up (closing) the connections, files opened, streams, etc.
those must be closed before exiting the program.
It can also be used to print some final information.
* */
public class FinallyBlock_Ex1 {
    //Here is code segment showing how to use finally after try/catch statements after handling exception.
    // In this example, we're creating an error accessing an element of an array using invalid index.
    // The catch block is handling the exception and printing the same. Now in finally block,
    // we're printing a statement signifying that finally block is getting executed.

    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println("Access element three: " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
