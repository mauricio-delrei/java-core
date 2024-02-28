package com.developer.javacore.collections.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/*
LinkedBlockingQueue is a blocking queue implementation, often used in producer-consumer scenarios.
 */
public class LinkedBlockingQueueExample {
  public static void main(String[] args) {
    BlockingQueue<String>blockingQueue = new LinkedBlockingDeque<>();
    
    blockingQueue.offer("One");
    blockingQueue.offer("Two");
    blockingQueue.offer("Three");

    System.out.println("LinkedBlockingQueue elements:");
    while (!blockingQueue.isEmpty()) {
        System.out.println(blockingQueue.poll());
    }
    
  }
  
}
