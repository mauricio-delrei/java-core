package com.developer.javacore.exception_handling.throws_and_throw;
/*
Definition:
Java throws keyword is used in the method signature to declare an exception which might be thrown by
 the function while the execution of the code.

Using throws keyword, we can declare both checked and unchecked exceptions.
However, the throws keyword can be used to propagate checked exceptions only.

Syntax:
The throws keyword is followed by class names of Exceptions to be thrown.

Declaration:
throws is used with the method signature.

Internal implementation:
We can declare multiple exceptions using throws keyword that can be thrown by the method.
For example, main() throws IOException, SQLException

* */
public class TestThrows {
    //defining a method
    public static int  divideNum(int m, int n)throws ArithmeticException{
        int div = m/n;
        return div;
    }

    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            obj.divideNum(45, 0);
        }catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }
        System.out.println("Rest of the code..");
    }
}
