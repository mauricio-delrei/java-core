package com.developer.javacore.exception_handling.throws_and_throw;

/*
If a method does not handle a checked exception, the method must declare it using the throws keyword. The throws keyword appears at the end of a method's signature.
You can throw an exception, either a newly instantiated one or an exception that you just caught, by using the throw keyword.
Try to understand the difference between throws and throw keywords, throws is used to postpone the handling
 of a checked exception and throw is used to invoke an exception explicitly.
 Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
 Type of exception Using throw keyword, we can only propagate unchecked exception i.e.,
  the checked exception cannot be propagated using throw only.
Syntax:
The throw keyword is followed by an instance of Exception to be thrown.
Declaration:
throw is used within the method.
Internal implementation:
We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
* */
public class TestThrow {

    //defining a method
    public static void checkNum(int num){
        if(num < 1){
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
    //main method
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.checkNum(-3);
        System.out.println("Rest of the code..");
    }
}
