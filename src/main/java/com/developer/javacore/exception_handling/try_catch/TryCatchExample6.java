package com.developer.javacore.exception_handling.try_catch;
//Let's see an example to resolve the exception in a catch block.
public class TryCatchExample6 {

    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;

        try{
            data = i/j; //may throw exception
        }
        //handling exception
        catch (Exception e){
            // resolving the exception in catch block
            System.out.println(i/(j+2));
        }
    }
}
