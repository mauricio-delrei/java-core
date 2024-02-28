package com.developer.javacore.collections.equals;

public class PersonEqualsTest {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);

        // Using default equals() (reference equality)
        System.out.println("Using default equals(): " + (person1.equals(person2))); // Outputs: false

        // Overriding equals() to check for equality based on fields
        System.out.println("Using overridden equals(): " + person1.equals(person2)); // Outputs: true
    }
    }
