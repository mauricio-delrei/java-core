package com.developer.javacore.exception_handling.try_with_resources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Example: Without Try with Resources
//In the following program, we are reading data from a file using FileReader and we are closing it using finally block.
// In this program, we're creating the FileReader object within try block. FileReader fr,
// reference is declared outside the try block so that it is accessible outside the try block and we need to remember
// to close it in finally block or before program exits so that there is no memory leak or loose connection possibility.
public class WithoutTryWithResources {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("E:\\Development\\Interview\\ile.txt");
            fr = new FileReader(file); char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
