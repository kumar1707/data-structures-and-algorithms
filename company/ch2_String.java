package com.company;

public class ch2_String {
    public static void main(String[] args) {
        System.out.println("Hello Strings!");
        String name = new String("Aryan");
        System.out.println(name);

        /*
        Strings aren't primitive data structures. They are built-in classes
        in java to support hanling aplhabets, numbers, symbols, etc.
        */
        String symbols = "{(){P:><:|}~";
        System.out.println(symbols);

        // Ways to print in Java
        /*
         * System.out.print() ---> prints without adding new lines
         * System.out.println() ---> prints with adding new lines
         * System.out.printf() ---> helps formatting with variables
         * System.out.format() --->  helps formatting with variables
         * */

        String greeting = "Hello";
        int age = 6;
        double height = (byte) 90.2;
        double weight = (float) 89;
        float percentage = 96.25f;
//        System.out.print(greeting + "Aryan");
//        System.out.println(greeting + "Aryan");
//        System.out.printf("hello %s", name);
//        System.out.format("Hello %s age %d percentage %f", greeting, age, percentage);


        System.out.println(height);
        System.out.println(weight);
    }
}
