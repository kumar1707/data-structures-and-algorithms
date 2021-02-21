package com.company;

public class ch5_break_and_continue {
    public static void main(String[] args) {
        // Break

        // for loop illustration
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            System.out.println("Java is best!");
//            if (i == 3) {
//                System.out.println("The loop is ending");
//                break;
//            }
//        }

        // while loop illustration
//        int j = 0;
//        while (j <= 10) {
//            System.out.println("This is roll number " + j);
//            j++;
//            if (j == 5) {
//                System.out.println("The loop is ending");
//                break;
//            }
//        }
        // do while loop illustration
//        int x = 0;
//        do {
//
//            System.out.println(x);
//            System.out.println("I am the best!!");
//            if (x == 7) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            x++;
//        } while (x < 10);


        // Continue


        // for loop illustration
//        System.out.println("The program was compiled successfully");
//        for (int i = 0; i <= 10; i++) {
//            if (i == 2) {
//                System.out.printf("Roll number %d is absent\n", i);
//                continue;
//            }
//            System.out.printf("Roll number %d present ma'am!\n", i);


        // while loop illustration
//        int j = 0;
//        while (j<10){
//            j++;
//            if (j==2){
//                System.out.println("Skipping");
//                continue;
//            }
//            System.out.println(j);
//            System.out.println("Java is best");
//            j++;
//        }

        // do while loop illustration
        int y = 0;
        do {
            y++;
            if (y == 7) {
                System.out.println("7 is a-shubh");
                continue;
            }
            System.out.println(y + " here!");
        } while (y < 15);


    }
}

