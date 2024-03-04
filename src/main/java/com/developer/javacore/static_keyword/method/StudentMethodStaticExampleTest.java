package com.developer.javacore.static_keyword.method;

public class StudentMethodStaticExampleTest {
    public static void main(String[] args) {


        //creating objects
        StudentMethodStaticExample student = new StudentMethodStaticExample(111,"Mauricio Del Rei");
        StudentMethodStaticExample student2 = new StudentMethodStaticExample(222,"Ju Eugenia");
        StudentMethodStaticExample student3 = new StudentMethodStaticExample(333,"Pedro Henrique Del Rei");
        StudentMethodStaticExample student4 = new StudentMethodStaticExample(444,"Maria Eugenia Del Rei");
        //StudentMethodStaticExample.change();//calling change method

        //calling display method
        student.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
