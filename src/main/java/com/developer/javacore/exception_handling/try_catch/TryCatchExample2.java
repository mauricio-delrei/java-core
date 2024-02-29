package com.developer.javacore.exception_handling.try_catch;

/*
Java catch block is used to handle the Exception by declaring the type of exception
 within the parameter.
The declared exception must be the parent class exception ( i.e., Exception)
 or the generated exception type.
However, the good approach is to declare the generated type of exception.
The catch block must be used after the try block only.
You can use multiple catch block with a single try block.
* */
public class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        //handling the exception
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        /*
        As displayed in the above example, the rest of the code is executed,

         i.e., the rest of the code statement is printed.
        * */
        System.out.println("rest of the code");
    }
}
