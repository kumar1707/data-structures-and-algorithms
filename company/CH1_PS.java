package com.company;

import java.util.Scanner;

public class CH1_PS {
    public static void main(String[] args) {

        // Problem 1
//        int a = 10;
//        int b = 12;
//        int c = 32;
//        long sum = a + b + c;
//        System.out.println(sum);

        // Problem 2
        Scanner sc = new Scanner(System.in);
//        int subject1 = sc.nextInt();
//        int subject2 = sc.nextInt();
//        int subject3 = sc.nextInt();
//        int subject4 = sc.nextInt();
//        int subject5 = sc.nextInt();
//        float sum = subject1 + subject2 + subject3 + subject4 + subject5;
//        float cpga = sum/50;
//        System.out.printf("The CGPA is %f", cpga);

        // Problem 3
//        System.out.println("What is your name:");
//        String name = sc.next();
//        System.out.printf("Dear %s Good Morning", name);

        // Problem 4
//        System.out.println("Enter anything: ");
//        boolean is_int = sc.hasNextInt();
//        System.out.println("It is " + is_int);

        // Problem 5
        float km = sc.nextFloat();
        float to_miles = km * 0.621f;
        System.out.println(km + " km in miles is " + to_miles + " miles");
    }
}
