package com.developer.javacore.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person>personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 22));

        System.out.println("Before sorting:");
        for(Person person : personList){
            System.out.println(person.getName() + ": " + person.getAge() + " years old");
        }

        // Sorting using Comparable (natural ordering based on age)
        Collections.sort(personList);
        System.out.println("\nAfter sorting by age using Comparable:");
        personList.forEach(person -> System.out.println((person.getName() + ": " + person.getAge() + " years old")));
    }
}
