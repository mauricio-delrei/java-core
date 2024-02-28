package com.developer.javacore.collections.hashcode;

public class StudentHashCodeTest {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Getting hash codes
        int hashCode1 = student1.hashCode();
        int hashCode2 = student2.hashCode();

        System.out.println("Hash Code for student1: " + hashCode1);
        System.out.println("Hash Code for student2: " + hashCode2);
    }
}
