package com.developer.javacore.collections.equals;

import java.util.Objects;

/*
In Java, the equals() method is used to compare the equality of two objects. By default, the equals() method in the Object class checks for reference equality, which means it returns true only if the two references point to the exact same object in memory.
However, in many cases, you might want to compare objects based on their content or specific attributes.
When you override the equals() method, you can define your own criteria for object equality.
This is especially important when dealing with custom classes where you want to compare objects based on their fields or attributes.
* */
public class Person {
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

//    @Override
//    public boolean equals(Object obj) {
//        // Check for reference equality
//        if (this == obj) {
//            return true;
//        }
//
//        // Check if the other object is null or of a different class
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//
//        // Cast the object to a Person
//        Person otherPerson = (Person) obj;
//
//        // Compare the fields for equality
//        return age == otherPerson.age && name.equals(otherPerson.name);
//    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }
}
