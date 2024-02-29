package com.developer.javacore.exception_handling.multi_catch_block;

/*
Java Catch Multiple Exceptions
Java Multi-catch block
A try block can be followed by one or more catch blocks.
Each catch block must contain a different exception handler.
So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

Points to remember
At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e.
 catch for ArithmeticException must come before catch for Exception.

* */
public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try{
            int array[] = new int[5];
            array[5] = 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Exception occurs");
        }
        catch (Exception e){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Rest of the code");
    }
}
