package com.developer.javacore.collections.hash_collision;

import java.util.LinkedList;
/*
Separate Chaining involves using a linked list or another data structure at each array index to handle collisions.
* */
public class SeparateChaining {
    private static final int ARRAY_SIZE = 5;

    private LinkedList<Pair>[]hashTable = new LinkedList[ARRAY_SIZE];

    private static class Pair{
        String key;
        Integer value;
        Pair(String key, Integer value){
            this.key = key;
            this.value = value;
        }
    }
    public SeparateChaining(){
        // Initialize the hash table with empty linked lists
        for(int i = 0;i< ARRAY_SIZE;i++){
            hashTable[i] = new LinkedList<>();
        }

    }
    public void put(String key, Integer value){
        int index = Math.abs(key.hashCode()) % ARRAY_SIZE;
        hashTable[index].add(new Pair(key,value));
    }

    public int get(String key){
        int index = Math.abs(key.hashCode()) % ARRAY_SIZE;
        for(Pair pair : hashTable[index]){
            if(pair.key.equals(key)){
                return pair.value;
            }
        }
        return -1; // Key not found;
    }

    public static void main(String[] args) {
        SeparateChaining separateChaining = new SeparateChaining();

        // Add key-value pairs
        separateChaining.put("Apple",1);
        separateChaining.put("Banana",2);
        separateChaining.put("Orange",3);
        separateChaining.put("Ananas",4);


        int value1 = separateChaining.get("Apple");
        int value2 = separateChaining.get("Banana");
        int value3 = separateChaining.get("Orange");
        int value4 = separateChaining.get("Ananas");


        // Print values
        System.out.println("Value for 'Apple': " + value1);
        System.out.println("Value for 'Banana': " + value2);
        System.out.println("Value for 'Orange': " + value3);
        System.out.println("Value for 'Ananas': " + value4);


    }
}
