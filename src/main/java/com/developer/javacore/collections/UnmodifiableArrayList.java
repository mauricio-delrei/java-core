package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
How to make ArrayList Read Only?
The read-only means unmodifiable view of Collection in which we can not perform
any operation which will change the collection through add(), remove() or set() method.
We can obtain read-only collection from the existing collection by calling
Collections.unmodifiableCollection() method.
* */
public class UnmodifiableArrayList {
    public static void main(String[] args) {
        List<String>fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        System.out.println(fruitList);

        List<String>unmodifiableList = Collections.unmodifiableList(fruitList);

        unmodifiableList.add("INDIA");
        System.out.println(fruitList);

        /*
        Here we have converted the existing list fruitList to unmodifiable List.
        If we alter the "unmodifiableList", it will cause UnsupportedOperationException.
        We can still change the list with fruitList reference. like calling:
        * */
    }
}
