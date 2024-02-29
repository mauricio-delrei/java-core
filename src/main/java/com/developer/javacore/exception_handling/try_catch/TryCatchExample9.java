package com.developer.javacore.exception_handling.try_catch;

//Let's see an example to handle another unchecked exception.
public class TryCatchExample9 {
    public static void main(String[] args) {
        try{
            int array[] = {1,3,5,7};
            System.out.println("["+ array[5] + "]"); //may throw exception
        }
        //may throw exception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
    }
}
