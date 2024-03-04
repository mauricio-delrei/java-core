package com.developer.javacore.static_keyword.method;

/*
Restrictions for the static method
There are two main restrictions for the static method. They are:

1) The static method can not use non static data member or call non-static method directly.
2) This and super cannot be used in static context.
* */
public class StudentMethodStaticExample {

    int rollNumber;
    String name;
   static String college = "ITS";

    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StudentMethodStaticExample(int rollNumber,String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
    //method to display values
    void display(){System.out.println(rollNumber+" "+name+" "+college);}

}
