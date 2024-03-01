package com.developer.javacore.exception_handling.checked_exceptions;

import java.io.File;
import java.io.FileReader;

/*
Java Checked Exceptions
A checked exception is an exception that is checked (notified) by the compiler at compilation-time,
 these are also called as compile time exceptions.
These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.
Example: Checked Exceptions in Java
For example, if you use FileReader class in your program to read data from a file,
if the file specified in its constructor doesn't exist, then a FileNotFoundException occurs,
and the compiler prompts the programmer to handle the exception.
* */
public class FileNotFound_Demo {
    public static void main(String[] args) {
        File file = new File("E:\\Development\\Interview");
        //FileReader reader = new FileReader(file);
        //If you try to compile the above program, you will get the following exceptions.
        /*
        Note − Since the methods read() and close() of FileReader class throws IOException,
        you can observe that the compiler notifies to handle IOException, along with FileNotFoundException.
        * */
        //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
    }
}
