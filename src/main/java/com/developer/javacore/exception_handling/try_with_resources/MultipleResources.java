package com.developer.javacore.exception_handling.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Try with Resources having Multiple Resources
//You can also declare multiple resource inside a try block.
public class MultipleResources {
    public static void main(String[] args) {
        // try block with multiple resources
        try(
        FileReader fileReader = new FileReader("E:\\Development\\Interview\\ile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("E:\\Development\\Interview\\file2.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        ){
          String line;
          while ((line = bufferedReader.readLine())!= null){
              // Read content line by line and write it
              // to the output (file2.txt) file
              printWriter.println(line);
          }
            System.out.println("Content copied!!!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
