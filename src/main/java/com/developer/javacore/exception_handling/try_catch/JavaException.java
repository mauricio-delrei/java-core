package com.developer.javacore.exception_handling.try_catch;

/*
What Is an Exception in Java?
An exception (or exceptional event) is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally,
which is not recommended, therefore, these exceptions are to be handled.
Why Exception Occurs?
An exception can occur for many different reasons.
Following are some scenarios where an exception occurs.
A user has entered an invalid data.
A file that needs to be opened cannot be found.
A network connection has been lost in the middle of communications or the JVM has run out of memory.
Some of these exceptions are caused by user error, others by programmer error,
and others by physical resources that have failed in some manner.
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
