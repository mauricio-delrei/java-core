package com.developer.javacore.collections;

public class SumElementsOfArray {

  public static void main(String[] args) {
    
  

  int my_array[] = {1,2,3,4,5,6,7,8,9,10};

  int sum =  0;
  int media = 0;

  for(int array : my_array){
    System.out.println(array);
    sum  += array;    
    media = sum/array;
  }
  // Print the sum of the array elements.
  
  System.out.println("The sum is " + sum);
  System.out.println("Media " + media);
}
  
}
