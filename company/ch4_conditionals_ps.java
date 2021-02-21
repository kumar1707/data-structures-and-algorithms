package com.company;

import java.util.Scanner;

public class ch4_conditionals_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         Question 2
        int total_marks = 100;
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sum = sub1 + sub2 + sub3;
        float sub1Percent = sub1 / total_marks * 100;
        float sub2Percent = sub2 / total_marks * 100;
        float sub3Percent = sub3 / total_marks * 100;
        float overall_percentage = (sum / 3.0f) ;
        System.out.println("Your overall percentage is " + overall_percentage);
        if (overall_percentage < 40 || sub1Percent < 33 || sub2Percent < 33 || sub3Percent < 33) {
            System.out.println("Fail!");
        } else {
            System.out.println("Pass!");
        }

        // Question 3
//        float tax = 0;
//        float income;
//        System.out.println("Enter your income:\n");
//        income = sc.nextFloat();
//
//        if (income > 2.5f && income < 5.0f) {
//            tax = tax +  0.05f * (income - 2.5f);
//        }
//        else if (income > 5.0f && income < 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//        }
    }

}

