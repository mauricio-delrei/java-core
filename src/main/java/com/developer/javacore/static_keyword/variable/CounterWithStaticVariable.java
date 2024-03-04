package com.developer.javacore.static_keyword.variable;

/*
As we have mentioned above, static variable will get the memory only once,
 if any object changes the value of the static variable, it will retain its value.
* */
public class CounterWithStaticVariable {
    static int count =0;//will get memory only once and retain its value.

    CounterWithStaticVariable(){
        count++;//incrementing the value of static variable
        System.out.println(count);
    }
}
