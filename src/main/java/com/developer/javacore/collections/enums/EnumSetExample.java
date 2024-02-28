package com.developer.javacore.collections.enums;


import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;


/*
EnumSet is a specialized and highly efficient implementation of the Set interface in Java that is designed to work with enum types.
It is a part of the java.util package and was introduced in Java 5 as part of the Java Collections Framework.

Here are some key points about EnumSet:
Specific to Enums: EnumSet is designed to work exclusively with enum types.
 It takes advantage of the fact that enums are constants and can be efficiently represented using bit vectors.

Efficient Implementation: Internally, EnumSet uses a bit vector representation,
 which makes it highly efficient in terms of both memory usage and performance.
 It can perform set operations (like union, intersection, and complement) more quickly than other general-purpose set implementations.

No Null Elements: EnumSet does not allow null elements.
 If you try to add a null element, it will throw a NullPointerException.

Use Cases: EnumSet is particularly useful when dealing with a small, fixed set of elements of the same enum type.
 It is often used for representing sets of enum constants.

Range of Elements: You can create an EnumSet with a range of elements using the range() method.
 This is useful when you want to create a set of consecutive enum constants.
* */

enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample {

    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.SATURDAY, days.THURSDAY);
        // Traversing elements
        Iterator<days>iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nallOf");
        Set<days>set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:" + set1);
        System.out.println("\nnoneOf");
        Set<days>set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:" + set2);

        // Creating an EnumSet with some days of the week
        EnumSet<days> weekend = EnumSet.of(days.SATURDAY, days.SUNDAY);
        // Adding a range of days (MONDAY to FRIDAY) to the EnumSet
        EnumSet<days> weekdays = EnumSet.range(days.MONDAY, days.FRIDAY);
        // Performing set operations
        EnumSet<days>workingDays = EnumSet.complementOf(weekend);
        // Printing the sets
        System.out.println("Weekend: " + weekend);
        System.out.println("Weekdays: " + weekdays);
        System.out.println("Working Days: " + workingDays);

    }

}
/*
Method	                                                            Description
static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType)	It is used to create an enum set containing all of the elements in the specified element type.
static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c)	    It is used to create an enum set initialized from the specified collection.
static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)	It is used to create an empty enum set with the specified element type.
static <E extends Enum<E>> EnumSet<E> of(E e)	                    It is used to create an enum set initially containing the specified element.
static <E extends Enum<E>> EnumSet<E> range(E from, E to)	        It is used to create an enum set initially containing the specified elements.
EnumSet<E> clone()	                                                It is used to return a copy of this set.
* */
