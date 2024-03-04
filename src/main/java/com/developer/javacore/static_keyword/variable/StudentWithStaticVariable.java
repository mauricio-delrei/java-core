package com.developer.javacore.static_keyword.variable;
/*
Java static keyword
Static variable
Program of the counter without static variable
Program of the counter with static variable
Static method
Restrictions for the static method
Why is the main method static?
Static block
Can we execute a program without main method?
The static keyword in Java is used for memory management mainly.
We can apply static keyword with variables, methods, blocks and nested classes.
The static keyword belongs to the class than an instance of the class.

The static can be:
Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class
Static in Java

1) Java static variable
If you declare any variable as static, it is known as a static variable.
The static variable can be used to refer to the common property of all objects (which is not unique for each object),
 for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).
* */
public class StudentWithStaticVariable {

    Integer rollNumber;
    String name;
    static String college = "ITS";//static variable.

    //constructor
    public StudentWithStaticVariable(Integer rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
    //method to display the values
    void display(){
        System.out.println("Roll Number: " + rollNumber + " Name: " + name + " College :" + college);
    }

}
