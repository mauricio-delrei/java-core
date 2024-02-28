package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
The List and Set both extend the collection interface.
However, there are some differences between the both.

The List can contain duplicate elements whereas Set includes unique items.
The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
The List interface contains a single legacy class which is Vector class whereas Set interface does not have any legacy class.
The List interface can allow n number of null values whereas Set interface only allows a single null value.
 */
public class ListXSet {
  public static void main(String[] args) {
    // List Example
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Apple"); // Duplicates are allowed in List

        System.out.println("List Elements: " + fruitList);

        // Set Example
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Apple"); // Duplicate will not be added to Set

        System.out.println("Set Elements: " + fruitSet);

  }
  
}
