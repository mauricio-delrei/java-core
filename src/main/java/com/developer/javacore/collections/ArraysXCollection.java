package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.List;

/*
What are the main differences between array and collection?
In Java, both arrays and collections are used to store and manipulate groups of elements,
 but there are key differences between the two.

Fixed Size vs. Dynamic Size:

Array: Arrays in Java have a fixed size, meaning that once you create an array,
you cannot change its size. You need to specify the size at the time of array creation.
Collection: Collections, on the other hand, are dynamic in size.
They can grow or shrink during runtime based on the number of elements added or removed.
Type of Elements:

Array: In Java, arrays can store primitive data types or objects. However, when using arrays, you need to specify the data type and the size of the array.
Collection: Collections can store only objects, not primitive data types. They work with objects, and Java provides wrapper classes for primitive types (e.g., Integer for int, Double for double) to be used in collections.
Flexibility:

Array: Arrays provide less flexibility compared to collections. Once the size is set, it cannot be changed.
Collection: Collections, being dynamic, offer more flexibility in terms of size and operations like adding, removing, and manipulating elements.
Functionality:

Array: Arrays have limited built-in functionality. They offer basic operations like accessing elements by index and iterating through elements using loops.
Collection: Collections provide a rich set of APIs and interfaces in the Java Collections Framework (e.g., List, Set, Map) with various utility methods and algorithms for sorting, searching, and manipulation.
 */
public class ArraysXCollection {

  public static void main(String[] args) {
    int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        System.out.println("Array Elements ");
        long startTime = System.nanoTime();
        for (int array : intArray) {
            System.out.println(array);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken for Array: " + duration + " nanoseconds");

        System.out.println("List Elements ");
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        startTime = System.nanoTime();
        for (int number : numbersList) {
            System.out.println(number);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken for List: " + duration + " nanoseconds");

}
}
