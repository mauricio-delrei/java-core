package com.developer.javacore.collections.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
To synchronize access to List, Set, and Map elements,
you can use Collections.synchronizedList, Collections.synchronizedSet, and Collections.synchronizedMap
respectively.
These methods return synchronized wrappers for the provided collections,
ensuring that the methods of the original collection are properly synchronized.
*/

public class SynchronizedListSetAndMap {
    public static void main(String[] args) {

        // Creating a non-thread-safe list
        List<String> nonThreadSafeList = new ArrayList<>();
        nonThreadSafeList.add("Orange");
        nonThreadSafeList.add("Banana");
        nonThreadSafeList.add("Pineapple");

        //Synchronizing the list
        List<String> synchronizedList = Collections.synchronizedList(nonThreadSafeList);
        //Synchronized access to the list
        System.out.println("\nSynchronized access to the list");
        synchronized (synchronizedList) {
            synchronizedList.forEach(element -> System.out.println("[" + element + "]"));
        }
        //Creating a non-synchronized HashSet
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Synchronizing the set
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        // Synchronized access to the set
        System.out.println("\nSynchronized access to the set");
        synchronized (synchronizedList) {
            for (String element : synchronizedList) {
                System.out.println("[" + element + "]");
            }
        }
        // Creating a non-synchronized HashMap
        Map<String,Integer>map = new HashMap<>();
        map.put("Apple", 2);
        map.put("Banana", 3);
        map.put("Orange", 1);

        // Synchronizing the map
        Map<String,Integer>synchronizedMap = Collections.synchronizedMap(map);
        // Synchronized access to the map
        System.out.println("\nSynchronized access to the map");
        synchronized (synchronizedMap){
            for(Map.Entry<String,Integer>entry : synchronizedMap.entrySet()){
                System.out.println("key:" + entry.getKey() + " Value:" + entry.getValue());
            }
        }

        SortedSet<String>sortedSet = new TreeSet<>();
        sortedSet.add("Abraao");
        sortedSet.add("Isaque");
        sortedSet.add("Jacob");

        // Creating a synchronized version of the SortedSet
        SortedSet<String>synchronizedSortedSet = Collections.synchronizedSortedSet(sortedSet);

        // Synchronizing access to the set
        System.out.println("\nSynchronized access to the SortedSet");
        synchronized (synchronizedSortedSet){
            synchronizedSortedSet.forEach(element -> System.out.println("[" + element + "]"));
        }
    }
}
