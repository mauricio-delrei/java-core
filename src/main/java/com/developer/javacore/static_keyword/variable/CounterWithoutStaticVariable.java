package com.developer.javacore.static_keyword.variable;
/*
In this example, we have created an instance variable named count which is incremented in the constructor.
Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable.
If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.
* */
public class CounterWithoutStaticVariable {
    //Java Program to demonstrate the use of an instance variable
    //which get memory each time when we create an object of the class.
    int count = 0; //will get memory each time when the instance is created

    CounterWithoutStaticVariable(){
        count++;//incrementing value
        System.out.println(count);
    }


}
