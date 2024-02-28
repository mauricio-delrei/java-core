package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
The differences between the Collection and Collections are given below.

The Collection is an interface whereas Collections is a class.
The Collection interface provides the standard functionality of data structure to List, Set, and Queue. However, Collections class is to sort and synchronize the collection elements.
The Collection interface provides the methods that can be used for data structure whereas Collections class provides the static methods which can be used for various operation on a collection.
* */
public class CollectionXCollections {
    public static void main(String[] args) {
        // Using Collection interface
        Collection<String>stringCollection = new ArrayList<>();
        stringCollection.add("Apple");
        stringCollection.add("Banana");
        stringCollection.add("Orange");


        System.out.println("Collection elements:");
        //Lambda
        stringCollection.forEach(element -> System.out.println("[" + element + "]"));

        // Using Collections utility class
        List<String>stringList = new ArrayList<>();

        stringList.add("Orange");
        stringList.add("Banana");
        stringList.add("Apple");

        System.out.println("Original List:");
        for(String element : stringList){
            System.out.println("[" + element + "]");
        }
        // Sorting the list using Collections utility class
        Collections.sort(stringList);
        System.out.println("\nSorted List:");
        stringList.forEach(element -> System.out.println("[" + element + "]"));
    }
}
