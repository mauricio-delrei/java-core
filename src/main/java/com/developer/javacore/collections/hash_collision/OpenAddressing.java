package com.developer.javacore.collections.hash_collision;

/*
Open Addressing involves probing into the array to find the next available slot when a collision occurs.
* */
public class OpenAddressing {
    private static final int ARRAY_SIZE = 5;
    private Pair[] hashTable = new Pair[ARRAY_SIZE];

    private static class Pair {
        String key;
        Integer value;

        Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, Integer value) {
        int index = Math.abs(key.hashCode()) % ARRAY_SIZE;

        // Linear probing
        while (hashTable[index] != null) {
            index = (index + 1) % ARRAY_SIZE;
        }
        hashTable[index] = new Pair(key, value);
    }

    public int get(String key) {
        int index = Math.abs(key.hashCode()) % ARRAY_SIZE;

        // Linear probing
        while (hashTable[index] != null && !hashTable[index].key.equals(key)) {
            index = (index + 1) % ARRAY_SIZE;
        }
        if (hashTable[index] != null) {
            return hashTable[index].value;
        } else {

            return -1; // Key not found
        }
    }

    public static void main(String[] args) {
        OpenAddressing example = new OpenAddressing();
        // Add key-value pairs
        example.put("apple", 1);
        example.put("banana", 2);
        example.put("orange", 3);
        example.put("ananas", 4);

        // Retrieve values using keys
        int value1 = example.get("apple");
        int value2 = example.get("banana");
        int value3 = example.get("orange");
        int value4 = example.get("ananas");

        // Print values
        System.out.println("Value for 'apple': " + value1);
        System.out.println("Value for 'banana': " + value2);
        System.out.println("Value for 'orange': " + value3);
        System.out.println("Value for 'ananas': " + value4);
    }

}
