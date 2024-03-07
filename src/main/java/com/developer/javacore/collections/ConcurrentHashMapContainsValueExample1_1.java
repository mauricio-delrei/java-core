package com.developer.javacore.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapContainsValueExample1_1 {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer>concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("AAA",10);
        concurrentHashMap.put("BBB",15);
        concurrentHashMap.put("CCC",25);
        concurrentHashMap.put("DDD",255);
        concurrentHashMap.put("EEE",30);

        System.out.println(" Mappings are: " + concurrentHashMap);

        System.out.println("is 255  present? ::  " + concurrentHashMap.containsValue(255));
    }

}
