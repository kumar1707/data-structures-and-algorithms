package com.company;

import java.util.Scanner;

public class ch6_for_each {
    public static void main(String[] args) {
        double[] marks = {54.0, 90.3, 90.5, 44.5};

        // Accessing the variables using for loop
//        double total_marks = 0;
//        for (int i = 0; i < marks.length; i++) {
//            total_marks += marks[i];
//        }
//        System.out.println("The marks of the students are " + total_marks);
//        Scanner sc  = new Scanner(System.in);
        // Printing elements in reverse order

        System.out.println("Printing the array using for loop");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }

        // For-Each loop
        System.out.println("\nPrinting the array using for-each loop");
        for (double mark : marks){
            System.out.print(mark + " ");
        }

    }
}
