package com.developer.javacore.exception_handling.try_with_resources;



import java.io.FileReader;
import java.io.IOException;

/*
An exception (or exceptional event) is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally,
 which is not recommended, therefore, these exceptions are to be handled.

Try with Resources
The Java try-with-resources statement is a try statement that is used for declaring one or more resources such as streams,
 sockets, databases, connections, etc.
These resources must be closed while the program is being finished.
The try-with-resources statement closes the resources at the end of the statement.

The try-with-resources feature was introduced in Java7.
The try-with-resources can also be a replacement for try-catch-finally with resources objects.
The try-with-resources statement is also referred as "Automatic Resource Management” and it was introduced in Java7.
This statement is a replacement of try-catch-finally-statement if you are working resources objects.
* */
public class Try_withDemo {
    /*
    Example: Try with Resources in Java
    In this program, we're creating the FileReader object within try with resources statement.
    FileReader fr, reference is declared within the try statement and we need not to remember to close it in finally block
    as it will be closed automatically by JVM so that there is no memory leak or loose connection possibility.
    * */

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("E:\\Development\\Interview\\ile.txt")){
            char [] a = new char[50];
            fileReader.read(a);// reads the content to the array
            for(char c : a){
                System.out.println(c);// prints the characters one by one
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
