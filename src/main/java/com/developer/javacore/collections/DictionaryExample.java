package com.developer.javacore.collections;

import java.util.Dictionary;
import java.util.Hashtable;

/*
In Java, the Dictionary class is an abstract class that provides the capability to store key-value pairs.
It is part of the Java Collections Framework and is considered somewhat obsolete.
Instead of using Dictionary, it is recommended to use the more versatile HashMap or Hashtable classes.
* */
public class DictionaryExample {
    public static void main(String[] args) {
        // Create a Dictionary using Hashtable
        Dictionary<String,Integer>dictionary = new Hashtable<>();
        // Add key-value pairs
        dictionary.put("apple", 1);
        dictionary.put("banana", 2);
        dictionary.put("orange", 3);


        // Retrieve values using keys
        int value1 = dictionary.get("apple");
        int value2 = dictionary.get("banana");
        int value3 = dictionary.get("orange");


        // Print values
        System.out.println("Value for 'apple': " + value1);
        System.out.println("Value for 'banana': " + value2);
        System.out.println("Value for 'orange': " + value3);

    }
}
