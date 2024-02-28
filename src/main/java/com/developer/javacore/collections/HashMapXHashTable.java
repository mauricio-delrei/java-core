package com.developer.javacore.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/*
HashMap	                            Hashtable
HashMap is not synchronized ||  Hashtable is synchronized.
HashMap can contain one null key and multiple null values || Hashtable cannot contain any null key or null value.
HashMap is not thread-safe, so it is useful for non-threaded applications || Hashtable is thread-safe, and it can be shared between various threads.
HashMap inherits the AbstractMap class ||	Hashtable inherits the Dictionary class.
* */
public class HashMapXHashTable {

    public static void main(String[] args) {
        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 2);
        hashMap.put("Orange", 1);
        hashMap.put(null, 5); // Null key is allowed
        hashMap.put("Grapes", null); // Null value is allowed


        for(Map.Entry<String,Integer>entry : hashMap.entrySet()){
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }

        // Hashtable Example
        Hashtable<String, Integer>hashtable = new Hashtable<>();
        hashtable.put("Banana",3);
        hashtable.put("Apple", 2);
        hashtable.put("Orange", 1);
        // The following lines will throw NullPointerException
        //hashtable.put(null, 5); // Null key is not allowed
        // hashtable.put("Grapes", null); // Null value is not allowed
        System.out.println("\nHashtable elements:");
        for(Map.Entry<String,Integer>entry : hashtable.entrySet()){
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }
    }
}
