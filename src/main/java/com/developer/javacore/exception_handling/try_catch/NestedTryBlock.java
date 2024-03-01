package com.developer.javacore.exception_handling.try_catch;

/*
A try block can be nested within another try block. This structure is termed as Nested try block.
Whenever an exception is raised within a nested try block, its exception is pushed to Stack.
The exception propagates from child to parent try block and so on.

You can have any number of them. If an exception occurs in the protected child code, the exception is thrown to
 the catch block of the child list.
If the data type of the exception thrown matches ExceptionType1, it gets caught there.
If not, the exception passes up to the parent catch statement.
This continues until the exception either is caught or falls through all catches, in which case the current method stops
 execution and the exception is thrown down to the previous method on the call stack.

 Pointer To Remember While Using Nested Try Block

Child catch block should have specific exception for better code clarity.
Parent catch block can have more generic exception handled so that if child catch block is not able to handle the exception
 then parent catch block can handle it.
There in no restriction on exception hiearchy to be used in child vs parent catch block.
If a exception is handled correctly in child catch block, then in parent, another exception can be raised and handled.
* */
public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            try{
                int b = 0;
                int c = 1/b;
            }catch (Exception e){
                System.out.println("Exception thrown: " + e);
            }
            System.out.println("Access element three :" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
