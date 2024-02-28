package com.developer.javacore.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Set contains values only whereas Map contains key and values both.
Set contains unique values whereas Map can contain unique Keys with duplicate values.
Set holds a single number of null value whereas Map can include a single null key with n number of null values.
 */

public class SetXMap {
  public static void main(String[] args) {
    // Set Example
    Set<String> set = new HashSet<>();
    set.add("Apple");
    set.add("Banana");
    set.add("Orange");
    set.add("Apple"); // Duplicate, will not be added
    set.add(null);
    set.add("");

    System.out.println("Set elements:");
    set.forEach(element -> System.out.println("[" + element + "]"));

    // Map Example
    Map<String, Integer> map = new HashMap<>();
    map.put("Apple", 2);
    map.put("Banana", 3);
    map.put("Orange", 1);
    map.put("Orange", 1);
    map.put("", 4);
    // map.put("Apple", 5); // Duplicate key, will update the value

    System.out.println("\nMap Elements:");
    /*
     * for (Map.Entry<String,Integer>entry : map.entrySet()) {
     * System.out.println(entry.getKey() + ": " + entry.getValue());
     * }
     */

    // Lambda
    map.forEach((key, value) -> System.out.println("[" + key + ":" + value + "]"));
  }
}
