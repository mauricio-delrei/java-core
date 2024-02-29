package com.developer.javacore.exception_handling.try_catch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Let's see an example to handle checked exception.
public class TryCatchExample10 {
    public static void main(String[] args) {

        PrintWriter printWriter;
        try{
            printWriter = new PrintWriter("jtp.txt"); //may throw exception
            printWriter.println("saved");
        }
        // providing the checked exception handler
        catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }
        System.out.println("File saved successfully");
    }

}
