package com.developer.javacore.exception_handling.try_catch;

/*
Exception handling in Java is a mechanism to deal with runtime errors or exceptional
 situations that may occur during the execution of a program.
These exceptional situations, represented by objects of classes derived from the Throwable
 class, can be due to various reasons such as invalid input, network issues, file not found,
  etc. Handling exceptions allows programmers to write robust code that can gracefully
  handle errors and prevent the program from crashing.
* */
public class JavaException {
    public static void main(String[] args) {
        //code that may raise exception
        try {
            int data = 100 / 0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}
