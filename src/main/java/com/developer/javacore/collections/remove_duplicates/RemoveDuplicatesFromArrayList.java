package com.developer.javacore.collections.remove_duplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
How to remove duplicates from ArrayList?
There are two ways to remove duplicates from the ArrayList.
Using HashSet: By using HashSet we can remove the duplicate element from the ArrayList,
but it will not then preserve the insertion order.
Using LinkedHashSet: We can also maintain the insertion order by using LinkedHashSet instead of HashSet.
The Process to remove duplicate elements from ArrayList using the LinkedHashSet:
Copy all the elements of ArrayList to LinkedHashSet.
Empty the ArrayList using clear() method, which will remove all the elements from the list.
Now copy all the elements of LinkedHashset to ArrayList.
* */
public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
//        // Create an ArrayList with duplicate elements
//        List<String> originalList = new ArrayList<>();
//        originalList.add("Apple");
//        originalList.add("Banana");
//        originalList.add("Orange");
//        originalList.add("Apple");
//        originalList.add("Grapes");
//        originalList.add("Banana");
//
//        // Method 1: Using HashSet (Does not maintain insertion order)
//        List<String> uniqueListHashSet = removeDuplicatesUsingHashSet(originalList);
//        System.out.println("After removing duplicates using HashSet:");
//        System.out.println(uniqueListHashSet);
//
//        // Method 2: Using LinkedHashSet (Maintains insertion order)
//        List<String> uniqueListLinkedHashSet = removeDuplicatesUsingLinkedHashSet(originalList);
//        System.out.println("\nAfter removing duplicates using LinkedHashSet:");
//        System.out.println(uniqueListLinkedHashSet);
//    }
//
//    private static List<String> removeDuplicatesUsingHashSet(List<String> list) {
//        // Create a HashSet to store unique elements
//        HashSet<String> set = new HashSet<>(list);
//
//        // Create a new ArrayList with unique elements (order may not be preserved)
//        List<String> uniqueList = new ArrayList<>(set);
//
//        return uniqueList;
//    }
//
//    private static List<String> removeDuplicatesUsingLinkedHashSet(List<String> list) {
//        // Create a LinkedHashSet to store unique elements (preserves insertion order)
//        LinkedHashSet<String> set = new LinkedHashSet<>(list);
//
//        // Create a new ArrayList with unique elements (order is preserved)
//        List<String> uniqueList = new ArrayList<>(set);
//
//        return uniqueList;
//    }
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        System.out.println("Before converting to set" + list);
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println("After converting to set:" + set);
    }
}
