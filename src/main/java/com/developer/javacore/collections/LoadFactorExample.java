package com.developer.javacore.collections;

import java.util.HashMap;

/*
The default size of load factor is 0.75. The default capacity is computed as initial capacity * load factor. For example, 16 * 0.75 = 12. So, 12 is the default capacity of Map.
* */
public class LoadFactorExample {
    public static void main(String[] args) {
        // Create a HashMap with the default load factor (0.75)
        HashMap<String,Integer> hashMap = new HashMap<>();
        // Add key-value pairs
        for(int i=1;i <= 10; i++){
            hashMap.put("key" + i, i);
        }
        // Print the size and capacity of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());
        System.out.println("Capacity of the HashMap: " +  getCapacity(hashMap));
    }
    private static int getCapacity(HashMap<?,?> hashMap){
        try{
            // Access the table field using reflection
            java.lang.reflect.Field tableField = HashMap.class.getDeclaredField("table");
            tableField.setAccessible(true);
            Object[] table = (Object[])tableField.get(hashMap);
            return table == null ? 0 : table.length;

        }catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
            return -1;

        }
    }
}
