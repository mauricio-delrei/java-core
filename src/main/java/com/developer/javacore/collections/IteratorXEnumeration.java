package com.developer.javacore.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
Iterator	Enumeration
The Iterator can traverse legacy and non-legacy elements ||	Enumeration can traverse only legacy elements.
The Iterator is fail-fast ||	Enumeration is not fail-fast.
The Iterator is slower than Enumeration ||	Enumeration is faster than Iterator.
The Iterator can perform remove operation while traversing the collection ||	The Enumeration can perform only traverse operation on the collection.
 */
public class IteratorXEnumeration {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Ferrari");
    list.add("Aston Martin");
    list.add("Bentley");

    System.out.println("Iterator");
    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println("[" + element + "]");
    }

    System.out.println("Enumeration");

    Vector<String> vector = new Vector<>();
    vector.add("Ferrari");
    vector.add("Aston Martin");
    vector.add("Bentley");

    Enumeration<String> enumeration = vector.elements();
    while (enumeration.hasMoreElements()) {
      String element = enumeration.nextElement();
      System.out.println("[" + element + "]");

    }
  }

}
