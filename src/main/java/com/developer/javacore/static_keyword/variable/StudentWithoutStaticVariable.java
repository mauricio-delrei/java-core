package com.developer.javacore.static_keyword.variable;
/*
Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created.
All students have its unique rollNumber and name, so instance data member is good in such case.
Here, "college" refers to the common property of all objects.
If we make it static, this field will get the memory only once.
* */
public class StudentWithoutStaticVariable {

    int rollNumber;
    String name;
    String college="ITS";


    public StudentWithoutStaticVariable(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    @Override
    public String toString() {
        return "Student {" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
