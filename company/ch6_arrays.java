package com.company;

import java.util.Arrays;

public class ch6_arrays {
    public static void main(String[] args) {
        // Arrays
        // They are collection of data into a list form

//      [90][80][95][94][97]

        // Ways to make a Array in Java

        // WAY 1
//        int[] marks = new int[5]; // Declaration and Initialization
//        marks[0] = 90;
//        marks[1] = 80;
//        marks[2] = 95;
//        marks[3] = 94;
//        marks[4] = 97;


        // WAY 2

        int[] marks = {90, 80, 95, 94, 97};
        System.out.println(marks[1]);

        // length - gives the length
        int len = marks.length;
        System.out.println(len);

        // Changing values from an array
        String[] cars = {"BMW", "Audi", "Innova", "Yeti", "Mercedes"};
        cars[4] = "Jaquar";
        System.out.println(cars[4]);


    }
}