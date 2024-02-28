package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
ArrayList	LinkedList
1)	ArrayList uses a dynamic array ||	LinkedList uses a doubly linked list.
2)	ArrayList is not efficient for manipulation because too much is required ||	LinkedList is efficient for manipulation.
3)	ArrayList is better to store and fetch data ||	LinkedList is better to manipulate data.
4)	ArrayList provides random access ||	LinkedList does not provide random access.
5)	ArrayList takes less memory overhead as it stores only object ||	LinkedList takes more memory overhead, as it stores the object as well as the address of that object.

*/

public class ArrayListXLinkedList {

  public static void main(String[] args) {
    // ArrayList Example

    List<String> arrayList = new ArrayList<>();
    arrayList.add("One");
    arrayList.add("Two");
    arrayList.add("Three");

    System.out.println("ArrayList elements:");
    arrayList.forEach(element -> System.out.println("[" + element + "]"));

    // LinkedList Example
    List<String> linkedList = new LinkedList<>();
    linkedList.add("One");
    linkedList.add("Two");
    linkedList.add("Three");
    // linkedList.add("Three");

    System.out.println("LinkedList elements:");
    linkedList.forEach(element -> System.out.println("[" + element + "]"));

  }

}
