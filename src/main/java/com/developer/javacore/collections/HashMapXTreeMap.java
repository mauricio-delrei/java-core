package com.developer.javacore.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
The differences between the HashMap and TreeMap are given below.
HashMap maintains no order, but TreeMap maintains ascending order.
HashMap is implemented by hash table whereas TreeMap is implemented by a Tree structure.
HashMap can be sorted by Key or value whereas TreeMap can be sorted by Key.
HashMap may contain a null key with multiple null values whereas TreeMap cannot hold a null key but can have multiple null values.
*/

public class HashMapXTreeMap {
    public static void main(String[] args) {
        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana",1);
        hashMap.put("Apple",2);
        hashMap.put("Orange",3);
        //hashMap.put("Banana",5);// Duplicate key, will update the value

        System.out.println("HashMap elements:");
        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }

        // TreeMap Example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana",1);
        treeMap.put("Apple",2);
        treeMap.put("Orange",3);
        //treeMap.put("Banana",5);// Duplicate key, will update the value
        System.out.println("\nTreeMap elements:");
        treeMap.forEach((key,value)-> System.out.println("[" + key + ":" + value + "]"));
    }
}
