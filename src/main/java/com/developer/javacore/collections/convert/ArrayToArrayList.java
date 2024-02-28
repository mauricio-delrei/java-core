package com.developer.javacore.collections.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
We can convert an Array to ArrayList by using the asList() method of Arrays class.
asList() method is the static method of Arrays class and accepts the List object.
* */
public class ArrayToArrayList {
    public static void main(String[] args) {
        // Create an array
        String array[] = {"Apple", "Banana", "Orange"};

        // Convert Array to ArrayList
        List<String>arrayList = new ArrayList<>(Arrays.asList(array));

        //arrayList.add("Pineapple");

        // Print the elements of the ArrayList
        System.out.println("ArrayList elements:");
        arrayList.forEach(element -> System.out.println("[" + element + "]"));
    }
}
