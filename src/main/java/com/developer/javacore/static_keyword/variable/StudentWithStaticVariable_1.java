package com.developer.javacore.static_keyword.variable;

public class StudentWithStaticVariable_1 {
    public static void main(String[] args) {
        StudentWithStaticVariable student = new StudentWithStaticVariable(111,"Albert Einstein");
        StudentWithStaticVariable student2 = new StudentWithStaticVariable(222,"Isaac Newton");

        //we can change the college of all objects by the single line of code
        //StudentWithStaticVariable.college="BBDIT";

        student.display();
        student2.display();
    }
}
