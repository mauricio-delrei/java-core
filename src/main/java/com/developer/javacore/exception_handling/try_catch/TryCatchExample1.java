package com.developer.javacore.exception_handling.try_catch;


/*
Java try block is used to enclose the code that might throw an exception.
 It must be used within the method.
If an exception occurs at the particular statement in the try block,
 the rest of the block code will not execute.
So, it is recommended not to keep the code in try block that will not throw an exception.
Java try block must be followed by either catch or finally block.
*
* */
public class TryCatchExample1 {
    public static void main(String[] args) {

        //Problem without exception handling
        int data=50/0; //may throw exception
        /*
        As displayed in the above example, the rest of the code is not executed (in such case, the rest of the code statement is not printed).
        There might be 100 lines of code after the exception.
        If the exception is not handled, all the code below the exception won't be executed.
        * */
        System.out.println("rest of code");
    }
}
