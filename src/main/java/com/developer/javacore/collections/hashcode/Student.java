package com.developer.javacore.collections.hashcode;


/*
The hashCode() method returns a hash code value (an integer number).
The hashCode() method returns the same integer number if two keys (by calling equals() method) are identical.
However, it is possible that two hash code numbers can have different or the same keys.
If two objects do not produce an equal result by using the equals() method, then the hashcode() method will provide the different integer result for both the objects.
In Java, the hashCode() method is a method defined in the Object class, and it is used to get a hash code value for an object. The hash code is an integer value that represents the object, and it is commonly used in hash-based data structures such as hash tables (e.g., HashMap, HashSet).
The general contract of the hashCode() method is that:
It is consistent with equals(): If two objects are equal according to the equals() method, they must have the same hash code. However, the reverse is not necessarily true.
It returns the same hash code value for the same object across multiple invocations of the method during the same execution of a Java application, provided no information used in equals() comparisons is modified.
It does not require that if two objects are unequal according to the equals() method, they must have distinct hash codes. However, distinct hash codes improve the efficiency of hash-based data structures.
* */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
    public int hashCode(){
        // A simple hash code calculation using name and age
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
