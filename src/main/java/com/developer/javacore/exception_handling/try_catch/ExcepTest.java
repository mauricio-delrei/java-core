package com.developer.javacore.exception_handling.try_catch;


/*
Java try and catch
A method catches an exception using a combination of the try and catch keywords.
A try and catch block is placed around the code that might generate an exception.
Code within a try and catch block is referred to as protected code, and the syntax for using try/catch looks like the following −

The try Block
The code which is prone to exceptions is placed in the try block.
When an exception occurs, that exception occurred is handled by catch block associated with it.
Every try block should be immediately followed either by a catch block or finally block.

The catch Block
A catch statement involves declaring the type of exception you are trying to catch.
If an exception occurs in protected code, the catch block (or blocks) that follows the try is checked.
If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block much as
 an argument is passed into a method parameter.
*
* */
public class ExcepTest {
    public static void main(String[] args) {
        /*
        In following example, an array is declared with 2 elements. Then the code tries to access the 3rd element of the array which throws an exception.
        As we've enclosed the code with a try block, this exception can be handled within next catch block which we've declared
        to catch ArrayIndexOutOfBoundsException. After catching the exception, we can take the corresponding action.
        Here we're printing the details of the exception thrown
        * */
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
