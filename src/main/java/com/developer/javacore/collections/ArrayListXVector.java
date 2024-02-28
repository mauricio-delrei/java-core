package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class ArrayListXVector {

  /*
   What is the difference between ArrayList and Vector?

   ArrayList	Vector
ArrayList is not synchronized || Vector is synchronized.
ArrayList is not a legacy class || Vector is a legacy class.
ArrayList increases its size by 50% of the array size ||	Vector increases its size by doubling the array size.
ArrayList is not ?thread-safe? as it is not synchronized ||	Vector list is ?thread-safe? as it?s every method is synchronized.
 */

  public static void main(String[] args) {
    // ArrayList Example
    List<String> arrayList = new ArrayList<>();
    arrayList.add("One");
    arrayList.add("Two");
    arrayList.add("Three");

    System.out.println("ArrayList elements:");
    for(String element : arrayList){
      System.out.println("[" + element + "]");
    }
     // Vector Example
     Vector<String>vector = new Vector<>();
     vector.add("One");
     vector.add("Two");
     vector.add("Three");

     System.out.println("\nVector elements:");
     for(String element : vector){
      System.out.println("[" + element + "]");
     }
  }
}