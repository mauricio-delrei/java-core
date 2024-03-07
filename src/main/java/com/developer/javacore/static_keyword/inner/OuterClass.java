package com.developer.javacore.static_keyword.inner;
/*
 Can you create a static inner class in Java?
 Yes, I can create a static inner class in Java.
 To create this, I first declare the inner class within the outer class.
 In the next step, I add the static keyword to the inner class definition.
 I create a static inner class in Java to provide additional encapsulation and access to the members of the outer class.
 The static inner class in Java can also have its own fields and methods, and I can use it just like any other class.
* */
public class OuterClass {
    public static String outerStaticField = "Outer static field";

    // Static nested class
    public static class StaticInnerClass{
        private String innerField;


        public  StaticInnerClass(String innerField){
            this.innerField = innerField;
        }
        public void display() {
            System.out.println("Outer static field: " + outerStaticField);
            System.out.println("Inner field: " + innerField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static inner class
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass("Inner static field");
        // Calling the display method of the static inner class
       staticInner.display();
    }
}
