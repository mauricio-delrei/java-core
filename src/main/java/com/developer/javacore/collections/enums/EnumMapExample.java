package com.developer.javacore.collections.enums;

/*
EnumMap is a specialized implementation of the Map interface in Java
 that is designed to work with enum types as keys. It is part of the java.util package
 and was introduced in Java 5 as part of the Java Collections Framework.

Here are some key points about EnumMap:

Specific to Enums: EnumMap is designed to work exclusively with enum keys.
 It takes advantage of the fact that enums are constants and provides an efficient and type-safe
  way to associate values with enum constants.

Efficient Implementation: Internally, EnumMap uses an array to store the mapping of enum keys to values.
  It is highly efficient both in terms of memory usage and performance.
  It can perform key-related operations more quickly than other general-purpose map implementations.

No Null Keys: EnumMap does not allow null keys.
 If you try to use a null key, it will throw a NullPointerException.

Use Cases: EnumMap is particularly useful when you have a small,
 fixed set of enum constants and you want to associate a value with each constant.
* */

import java.util.EnumMap;

// Enum type representing days of the week
    enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapExample {
    public static void main(String[] args) {
        // Creating an EnumMap with keys of type Days
        EnumMap<Days,String>schedule = new EnumMap<>(Days.class);
        // Adding values to the EnumMap
        schedule.put(Days.MONDAY, "Work");
        schedule.put(Days.TUESDAY, "Meeting");
        schedule.put(Days.WEDNESDAY, "Gym");
        schedule.put(Days.THURSDAY, "Church");
        schedule.put(Days.FRIDAY, "Movie");
        schedule.put(Days.SATURDAY, "Church");
        schedule.put(Days.SUNDAY, "Family Time");

        // Accessing values from the EnumMap
        System.out.println("Schedule for Monday: " + schedule.get(Days.MONDAY));
        System.out.println("Schedule for Saturday: " + schedule.get(Days.SATURDAY));
        // Printing the entire EnumMap
        System.out.println("Full Schedule: " + schedule);
    }
}
