package com.developer.javacore.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueXDeque {

  public static void main(String[] args) {
    // Queue Example
    Queue<String> queue = new LinkedList<>();
    queue.offer("First");
    queue.offer("Second");
    queue.offer("Third");

    System.out.println("Queue elements:");
    while (!queue.isEmpty()) {
      System.out.println(queue.poll()); // Retrieves and removes the head of the queue
    }

    // Deque Example
    Deque<String> deque = new ArrayDeque<>();
    deque.offerFirst("First");
    deque.offerLast("Last");

    System.out.println("\nDeque elements:");
    while (!deque.isEmpty()) {
      System.out.println(deque.poll()); // Retrieves and removes the head of the deque
    }
  }
  
}
