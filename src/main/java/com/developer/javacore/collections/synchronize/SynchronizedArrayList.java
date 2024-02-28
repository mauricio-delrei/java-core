package com.developer.javacore.collections.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        // Create a normal ArrayList
        List<String> normalList = new ArrayList<>();
        normalList.add("Apple");
        normalList.add("Banana");
        normalList.add("Orange");

        // Synchronize the ArrayList using Collections.synchronizedList
        List<String> synchronizedList = Collections.synchronizedList(normalList);

        // Create and start two threads to modify the lists concurrently
        Thread thread1= new Thread(()->{
            synchronizedList.add("Grappes");
        });

        Thread thread2 = new Thread(()->{
            synchronizedList.add("Banana");
        });

        thread1.start();
        thread2.start();


        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // Print the synchronized list
        System.out.println("Synchronized ArrayList: " + synchronizedList);
    }
}
