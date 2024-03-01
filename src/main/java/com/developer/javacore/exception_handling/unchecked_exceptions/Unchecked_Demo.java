package com.developer.javacore.exception_handling.unchecked_exceptions;

/*
Java Unchecked Exceptions
An unchecked exception is an exception that occurs at the time of execution.
These are also called as Runtime Exceptions.
These include programming bugs, such as logic errors or improper use of an API.
Runtime exceptions are ignored at the time of compilation.

Example: Unchecked Exceptions in Java
For example, if you have declared an array of size 5 in your program,
and trying to call the 6th element of the array then an ArrayIndexOutOfBoundsExceptionException occurs.
* */
public class Unchecked_Demo {

    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        System.out.println(num[5]);
        /*
        If you compile and execute the above program, you will get the following exception.
        Output
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	    at Exceptions.Unchecked_Demo.main(Unchecked_Demo.java:8)
        * */
    }
}

