package com.developer.javacore.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/*
The HashSet and TreeSet, both classes, implement Set interface.
The differences between the both are listed below.
HashSet maintains no order whereas TreeSet maintains ascending order.
HashSet impended by hash table whereas TreeSet implemented by a Tree structure.
HashSet performs faster than TreeSet.
HashSet is backed by HashMap whereas TreeSet is backed by TreeMap.
 */

public class HashSetXTreeSet {
  public static void main(String[] args) {
    // HashSet Example
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Banana");
    hashSet.add("Apple");
    hashSet.add("Orange");
    hashSet.add("Grapes");
    // hashSet.add("Grapes");
    System.out.println("HashSet elements:");
    hashSet.forEach(element -> System.out.println("[" + element + "]"));

    System.out.println("\nTreeSet elements");
    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Banana");
    treeSet.add("Apple");
    treeSet.add("Orange");
    treeSet.add("Grapes");
    // treeSet.add("Grapes");

    treeSet.forEach(element -> System.out.println("[" + element + "]"));

  }

}
