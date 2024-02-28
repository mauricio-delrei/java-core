package com.developer.javacore.collections.synchronize;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        copyOnWriteList.add("Apple");
        copyOnWriteList.add("Banana");
        copyOnWriteList.add("Orange");

        // Create and start two threads to modify the list concurrently
        Thread thread1 = new Thread(()->{
            copyOnWriteList.add("Grappes");
        });

        Thread thread2 = new Thread(()->{
            copyOnWriteList.add("Banana");
        });

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the CopyOnWriteArrayList
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteList);

    }
}
