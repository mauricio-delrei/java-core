package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorXListIterator {
  public static void main(String[] args) {
    List<String>names = new ArrayList<>();
    names.add("Abraão");
    names.add("Isaque");
    names.add("Jacó");
   


    // Using Iterator
    System.out.println("Using Iterator:");
    Iterator<String>iterator = names.iterator();
    while (iterator.hasNext()) {

      String name = iterator.next();
      System.out.println("{ " + name + " }"); // Uncommenting the next line will result in a ConcurrentModificationException
      //names.add("David");
      
    }

    // Using ListIterator
    System.out.println("\nUsing ListIterator:");
    ListIterator<String>listIterator = names.listIterator();
    while (listIterator.hasNext()) {
      String name = listIterator.next();
      System.out.println("{ " + name + " }");
      // Modifying the list during iteration using ListIterator
      if(name.equals("Jacó")){
        listIterator.add("Pedro");
        listIterator.add("Tiago");
        listIterator.add("João");
      }
    }
     // Print the modified list
     System.out.println("\nModified List:");
     for(String name : names){
       // Print the modified list
       System.out.println("{ " + name + " }");
     }
  }
  
}
