package com.developer.javacore.collections.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;

public class EnumMapExample2 {

    public static void main(String[] args) {
        EnumMap<Key,Book> map = new EnumMap<>(Key.class);
        //Creating Books
        Book b1=new Book(UUID.randomUUID(),"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(UUID.randomUUID(),"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(UUID.randomUUID(),"Operating System","Galvin","Wiley",6);

        // Adding Books to Map
        map.put(Key.ONE,b1);
        map.put(Key.TWO,b2);
        map.put(Key.THREE,b3);

        // Traversing EnumMap
       for(Map.Entry<Key,Book> entry : map.entrySet()){
           Book b = entry.getValue();
           System.out.println(b.toString());
       }
    }


}
