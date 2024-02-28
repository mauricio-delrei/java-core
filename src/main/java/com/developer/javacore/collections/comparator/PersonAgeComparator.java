package com.developer.javacore.collections.comparator;

import java.util.Comparator;

/*
The Comparator provides multiple sorts of sequences.
It provides one method named compare().
It is located in java.util package.
The actual class is not changed.
* */
public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(),person2.getAge());
    }
}
