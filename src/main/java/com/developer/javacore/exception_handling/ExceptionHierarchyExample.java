package com.developer.javacore.exception_handling;
/*
Java Exception class Hierarchy
After one catch statement executes, the others are bypassed, and execution continues after the try/catch block.
The nested catch blocks follow Exception hierarchy.
All exception classes in Java extend the class ‘Throwable’. Throwable has two subclasses, Error and Exception
The Error class defines the exception or the problems that are not expected to occur under normal circumstances by our program,
example Memory error, Hardware error, JVM error, etc
The Exception class represents the exceptions that can be handled by our program, and our program can be recovered
 from this exception using try and catch block
A Runtime exception is a sub-class of the exception class.
The Exception of these type represents exception that occur at the run time and which cannot be tracked at the compile time.
An excellent example of same is divide by zero exception, or null pointer exception, etc
IO exception is generated during input and output operations
Interrupted exceptions in Java, is generated during multiple threading.
*
* */
public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try{
            // Code that may throw an exception
            throw new CustomException ("Custom exception example");
        } catch (CustomException e) {
            // Handling the custom exception
            System.err.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions
            System.err.println("Generic Exception: " + e.getMessage());
        }
    }
}
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
