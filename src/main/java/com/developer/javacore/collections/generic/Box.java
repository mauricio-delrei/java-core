package com.developer.javacore.collections.generic;

import java.util.ArrayList;
import java.util.List;

/*
Advantages of using the generic collection.
If we use the generic class, we don't need typecasting.
It is type-safe and checked at compile time.
Generic confirms the stability of the code by making it bug detectable at compile time.
Code Reusability: Generics allow you to write code that can work with a variety of data types. This enhances code reusability since the same collection or algorithm can be used with different types without modification.

Disadvantages
Complexity: Generics can add complexity to the code, especially when dealing with wildcards (?) and bounded type parameters. This complexity might make the code harder to understand for developers who are not familiar with the generic syntax.
Code Verbosity: In certain cases, the syntax for using generics can make the code more verbose, particularly when specifying generic types with long names or dealing with complex type hierarchies.
Type Erasure: Java uses type erasure to implement generics, meaning that the type information is removed during compilation. This can lead to challenges when working with generic types at runtime, especially if you need to inspect or manipulate the generic type information.
Compatibility Issues: If you're working with legacy code or external libraries that do not use generics, integrating generic collections may lead to compatibility issues. In such cases, you might need to bridge between generic and non-generic code.
Learning Curve: Developers who are new to generics may experience a learning curve, especially when dealing with advanced features like wildcards, upper and lower bounds, and generic methods. This can impact the speed at which a team can adopt and maintain the codebase.
* */
public class Box<T> {
    private T content;

    public Box(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Generics");
        System.out.println("Box Content: " + stringBox.getContent());

        Box<Integer>integerBox = new Box<>(123456789);
        System.out.println("Box Content: " + integerBox.getContent());

        Box<Double>doubleBox = new Box<>(3.1416);
        System.out.println("Box Content: " + doubleBox.getContent());

        stringBox.setContent("Other String");
        System.out.println("Box Content: " + stringBox.getContent());

        integerBox.setContent(987654321);
        System.out.println("Other Integer Content: " + integerBox.getContent() );

        doubleBox.setContent(3.141617);
        System.out.println("New Double Content: " + doubleBox.getContent() );

        List<String>cars = new ArrayList<>();
        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("Bentley");

      Box<List<String>> listBox = new Box<>(cars);
        // Retrieving the content from the Box
        List<String> retrievedCars = listBox.getContent();
        System.out.println("\nCars:");
        for(String car : retrievedCars){
            System.out.println(car);
        }
    }
}
