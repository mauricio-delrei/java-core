package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
A fail-fast iterator in Java is an iterator that detects concurrent modification during iteration
and immediately throws a ConcurrentModificationException
if any structural modification (like adding or removing elements)
occurs while iterating over a collection. Fail-fast iterators aim to catch
and report any unexpected changes to the underlying collection during the iteration process.
*/
public class FailFastExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String>cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes Benz");
        cars.add("Audi");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("[" + element + "]");
            // Attempt to modify the list during iteration (will cause ConcurrentModificationException)
            // Uncomment the following line to see the exception:
            //cars.add("BMW");
        }

    }
}
