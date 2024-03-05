package com.developer.javacore.static_keyword.nested;

/*
What is nested static class in Java?
Nested static class in Java is a static member of any top-level class.
We may create the instance of the nested static class without the instance of enclosing class.
* */
public class StaticNestedClass {
    public static void main(String[] args) {
        StaticNestedClass.NestedStaticClass ns = new StaticNestedClass.NestedStaticClass();
        System.out.println(ns.getDesc());
    }
   static class NestedStaticClass{
       public String desc =" Example of Nested Static Class";

       public String getDesc(){
           return desc;
       }
   }
}
