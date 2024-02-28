package com.developer.javacore.collections.convert;

import java.util.ArrayList;
import java.util.List;

/*
We can convert an ArrayList to Array using toArray() method of the ArrayList class.
* */
public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String>arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Convert ArrayList to Array
        String[] array = arrayList.toArray(new String[0]);
        // Print the elements of the array
        System.out.println("Array elements:");
        for(String element: array){
            System.out.println(element);
        }
    }
}
