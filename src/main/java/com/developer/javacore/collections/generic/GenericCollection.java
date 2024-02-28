package com.developer.javacore.collections.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCollection {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("JavaScript");
        stringList.add("PL SQL Oracle");

        System.out.println("Languages: " + stringList);

        //Type-safe retrieval
        String lastLanguage = stringList.get(3);
        System.out.println("Last Language: " + lastLanguage);

        System.out.println("\nGeneric Map Example");
        Map<String,Integer>ageMap = new HashMap<>();
        ageMap.put("John", 25);
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 28);

        System.out.println("Ages: " + ageMap);

        // Type-safe retrieval
        int johnsAge = ageMap.get("John");
        System.out.println("John's Age: " + johnsAge);
    }
}
