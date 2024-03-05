package com.developer.javacore.static_keyword.block;

/*
Can we have multiple static blocks in a Java class?
Yes, we can have more than one static block in a Java class. It will be executed exactly in the same order it appears.
* */
public class MultipleStaticBlocks {

    static {
        System.out.println("First static block executed");
    }
    static{
        System.out.println("Second static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
    }
}
