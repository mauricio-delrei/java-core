package com.developer.javacore.collections;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
he differences between the HashSet and HashMap are listed below.

HashSet contains only values whereas HashMap includes the entry (key, value). HashSet can be iterated, but HashMap needs to convert into Set to be iterated.
HashSet implements Set interface whereas HashMap implements the Map interface
HashSet cannot have any duplicate value whereas HashMap can contain duplicate values with unique keys.
HashSet contains the only single number of null value whereas HashMap can hold a single null key with n number of null values.
* */
public class HashSetXHashMap {
    public static void main(String[] args) {
        //HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet elements:");
        //Lambda
        // hashSet.forEach(element -> System.out.println("[" + element + "]"));
        //Iterating over elements directly
        for (String element : hashSet) {
            System.out.println("[" + element + "]");
        }


        //HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 2);
        hashMap.put("Banana", 3);
        hashMap.put("Orange", 1);
        //hashMap.put("Apple", 5); // Duplicate key, will update the value

        System.out.println("\nHashMap elements:");
        //hashMap.forEach((key,value)-> System.out.println("[" + key + ":" + value + "]")); Lambda
        // Converting HashMap to Set of Map.Entry for iteration
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        // Iterating over entries using Iterator
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }

    }
}
