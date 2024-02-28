package com.developer.javacore.collections.comparable;

/*
Comparable provides only one sort of sequence.
It provides one method named compareTo().
It is found in java.lang package.
If we implement the Comparable interface, The actual class is modified.

* */
public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age,otherPerson.age);
    }
}
