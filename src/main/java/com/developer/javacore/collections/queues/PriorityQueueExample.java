package com.developer.javacore.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

/*
A PriorityQueue is a heap-based implementation of a queue.
Elements are ordered according to their natural order or by a Comparator provided when creating the PriorityQueue
 */
public class PriorityQueueExample {
  public static void main(String[] args) {
    Queue<Integer>priorityQueue  = new PriorityQueue<>();
    priorityQueue.offer(5);
    priorityQueue.offer(30);
    priorityQueue.offer(20);
    priorityQueue.offer(40);
    priorityQueue.offer(10);

    System.out.println("PriorityQueue elements:");
    while(!priorityQueue.isEmpty()){
      System.out.println(priorityQueue.poll());
    }
  }
  
}
