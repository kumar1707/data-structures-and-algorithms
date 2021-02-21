package com.company;

import java.util.*;

public class ch1_Getting_user_inputs {
    public static void main(String[] args) {
//        System.out.println("whats up java!");
        Scanner sc = new Scanner(System.in);

        // Operation 1
//        System.out.println("Enter first number:");
//        int a = sc.nextInt();
//
//        System.out.println("Enter first number:");
//        int b = sc.nextInt();
//
//        int sum = a + b;
//        System.out.println("The sum is " + sum);

        // Operation 2
        System.out.println("Enter first float");
        float num1 = sc.nextFloat();

        System.out.println("Enter second float");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;
        System.out.println("The sum of two floats is " + sum);

    }
}
