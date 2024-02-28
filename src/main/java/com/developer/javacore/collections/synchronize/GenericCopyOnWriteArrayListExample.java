package com.developer.javacore.collections.synchronize;

import java.util.concurrent.CopyOnWriteArrayList;



    public class GenericCopyOnWriteArrayListExample<T> {

        private CopyOnWriteArrayList<T> copyOnWriteList;

        public GenericCopyOnWriteArrayListExample() {
            // Initialize the CopyOnWriteArrayList with generics
            this.copyOnWriteList = new CopyOnWriteArrayList<>();
        }

        public void addItem(T item) {
            // Adding an item to the CopyOnWriteArrayList
            copyOnWriteList.add(item);
        }

        public void removeItem(T item) {
            // Removing an item from the CopyOnWriteArrayList
            copyOnWriteList.remove(item);
        }

        public CopyOnWriteArrayList<T> getList() {
            // Returning the CopyOnWriteArrayList
            return copyOnWriteList;
        }

        public static void main(String[] args) {
            // Create an instance of the generic class
            GenericCopyOnWriteArrayListExample<String> stringListExample = new GenericCopyOnWriteArrayListExample<>();

            // Add items to the list
            stringListExample.addItem("Apple");
            stringListExample.addItem("Banana");
            stringListExample.addItem("Orange");
            stringListExample.addItem("Grapres");

            // Print the list
            System.out.println("CopyOnWriteArrayList of Strings: " + stringListExample.getList());

            stringListExample.removeItem("Grapres");
            System.out.println("Item removed" + stringListExample.getList());
            // Create another instance with a different type
            GenericCopyOnWriteArrayListExample<Integer> integerListExample = new GenericCopyOnWriteArrayListExample<>();

            // Add items to the list
            integerListExample.addItem(1);
            integerListExample.addItem(2);
            integerListExample.addItem(3);
            integerListExample.addItem(4);

            // Print the list
            System.out.println("CopyOnWriteArrayList of Integers: " + integerListExample.getList());

            integerListExample.removeItem(4);

            // Print the list
            System.out.println("CopyOnWriteArrayList of Integers Removed: " + integerListExample.getList());


        }

}
