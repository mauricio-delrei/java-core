package com.developer.javacore.static_keyword.variable;

public class StudentWithoutStaticVariableTest {

    public static void main(String[] args) {
        StudentWithoutStaticVariable student = new StudentWithoutStaticVariable(111, "Karan");

        System.out.println("Student :" + student.toString());
    }
}
