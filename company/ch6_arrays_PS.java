package com.company;

import java.util.Scanner;

public class ch6_arrays_PS {
    public static void main(String[] args) {
        // Question 1
//        float[] array = {9.07f, 43.32f, 12.85f, 88.30f, 22.56f};
//        float total = 0;
//        for (float elem : array){
//            total += elem;
//        }
//        System.out.printf("The sum of all elements of the array is %f", total);

        // Question 2
       /* int[] score = {1, 3, 5, 2, 0};
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean isFlag = false;
        for (int element : score) {
            if (element == n) {
                isFlag = true;
                break;
            }

        }
        System.out.println(isFlag);*/

        // Question 3
        /*float[] marks = {10,20,30,40};
        float sum = 0;
        float avr_marks = 0;
        for (float elem : marks) {
            sum += elem;
            avr_marks = sum/marks.length;
        }
        System.out.println("The average marks is " + avr_marks);*/

        // Question 4
        /*int[][] matrix1 = {{1,2,3},{3,4,5}};
        int[][] matrix2  = {{7,8,9},{10,11,12}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }*/

        // Question 5
        int[] array = {34, 78, 29, 23, 90, 12, -10, 23, -102, -3};

        //METHOD 1
//        int n = array.length;
//        int[] reversedArray = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            reversedArray[n - 1] = array[i];
//            n -= 1;
//        }
//        for (int i : reversedArray) {
//            System.out.print(i + " ");
//        }

        // METHOD 2
//        int a = Math.floorDiv(4, 3);
//        int l = array.length;
//        int n = Math.floorDiv(l, 2);
//        for (int i = 0; i < n; i++) {
//            // swapping a[i] and a[l-1-n]
//            int temp = array[i];
//            array[i] = array[l-1-i];
//            array[l-1-i] = temp;
//        }
//        for (int element : array) {
//            System.out.print(element + " ");
//        }

        // Question 6
//        int max = 0;
//        for (int element : array) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        System.out.println(max);
////        for (int element : array) {
////            System.out.print(element + " ");
////        }
//
//        // Question 7
//        int min = max;
//        for (int element : array) {
//            if (element < min) {
//                min = element;
//            }
//        }
//        System.out.println(min);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        // Question 8
//        int[] array2 = {1,3,4,5};
        boolean isSorted = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }

}