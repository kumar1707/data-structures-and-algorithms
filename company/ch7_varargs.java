package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class ch7_varargs {
//    static int add(int a, int b) {
//        return a + b;
//    }
//
//    static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    static int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    static int add(int... arr) {
        // Available as int [] array
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    static int increasedSum(int x, int... arr){
        int sum = x;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    static int isInArr(boolean[] arr, boolean key) {
        int timesItContainsTheKey = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) timesItContainsTheKey++;
        }
        return timesItContainsTheKey;
    }

    static float getPercentage() {
        boolean[] likes = {true, true, true, false};
        int len = likes.length;
        float times = isInArr(likes, true);
        float perc = (times/len)*100;
        return perc;

    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is "  + add()); // The array is still created and all the elements of the
        System.out.println("The sum of a, b is " + add(3, 4)); // array is zero, thus the result will be 0
        System.out.println("The sum of a, b, c is " + add(3, 4, 5));
        System.out.println("The sum of a, b, c, d is " + add(3, 4, 5, 6));
        System.out.println("The sum is " + add(4, 54, 3, 90, 120, 43, 34));
        System.out.println("\nThe increased sum is " + add(8, 90, 43, 12, 904, 34));
        System.out.println("The number of times the key is in the list is " + getPercentage());
    }
}
