package com.developer.javacore.static_keyword.block;

/*
Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.
A static block, is a block of code inside a Java class that will be executed when a class is first loaded into the JVM.
Mostly the static block will be used for initializing the variables.
Static block will be called only one while loading and it cannot have any return type, or any keywords (this or super).
It is also called as Initializer block.
* */
public class StaticBlockExample {

    static {
        System.out.println("Static Block is invoked");
    }

    public static void main(String[] args) {
        System.out.println("Hello Main");
    }
}
