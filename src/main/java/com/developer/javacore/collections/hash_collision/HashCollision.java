package com.developer.javacore.collections.hash_collision;

import java.util.Hashtable;

/*
What is hash-collision in Hashtable and how it is handled in Java?
Two different keys with the same hash value are known as hash-collision.
Two separate entries will be kept in a single hash bucket to avoid the collision.
There are two ways to avoid hash-collision.
Separate Chaining
Open Addressing
* */

public class HashCollision {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String,Integer>hashtable = new Hashtable<>();
        // Add key-value pairs
        hashtable.put("apple", 1);
        hashtable.put("banana", 2);
        hashtable.put("orange", 3);

        // Intentionally create a collision by using a key with the same hash code as "banana"
        hashtable.put("ananas", 4);
        // Retrieve values using keys
        int value1 = hashtable.get("apple");
        int value2 = hashtable.get("banana");
        int value3 = hashtable.get("orange");
        int value4 = hashtable.get("ananas");

        // Print values
        System.out.println("Value for 'apple': " + value1);
        System.out.println("Value for 'banana': " + value2);
        System.out.println("Value for 'orange': " + value3);
        System.out.println("Value for 'ananas': " + value4);
    }
}
