package com.company;

import java.util.*;

public class ch1_CBSE_board_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of the first subject");
        float firstSubject = sc.nextFloat();

        System.out.println("Enter the marks of the first subject");
        float secondSubject = sc.nextFloat();

        System.out.println("Enter the marks of the first subject");
        float thirdSubject = sc.nextFloat();

        System.out.println("Enter the marks of the first subject");
        float fourthSubject = sc.nextFloat();

        System.out.println("Enter the marks of the first subject");
        float fifthSubject = sc.nextFloat();

        float marks = firstSubject + secondSubject + thirdSubject + fourthSubject + fifthSubject;

        float percentage = (marks / 500F) * 100;
        System.out.printf("Your CBSE percentage are %f", percentage);
    }
}
