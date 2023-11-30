package com.example;

//import java.lang.reflect.Array;

public class ArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents.
        int []numbers={1, 2, 3, 4, 5};
        for (int i: numbers){
            System.out.println(i);
        }
        System.out.println(numbers);
    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int maximumNumber = array[0];
        for (int num: array) {
            if (maximumNumber<num) {
                maximumNumber=num;
            }
        }
        return maximumNumber; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        for (int num: array){
            if (num==value) {
                return true;
            }
        }
        // TODO: Implement the logic to check if the array contains the specified value.
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum=0;
        for (int num: array){
            sum +=num;
        }
        // TODO: Implement the logic to calculate the average of the array elements.
        return sum/array.length; // Placeholder return value
    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int j = array.length - 1-i;
            int temp = array[i];
            array[i]=array[j];
            array[j] = temp;
        }
        // TODO: Implement the logic to reverse the array.
        return array; // Placeholder return value
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }       
        // TODO: Implement a sorting algorithm to sort the array.
    }
}
