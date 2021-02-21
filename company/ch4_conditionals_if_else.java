package com.company;

import java.util.Scanner;

public class ch4_conditionals_if_else {
    public static void main(String[] args) {
        /*
         * DECISION MAKING INSTRUCTIONS
         * --> If-else Statement
         * --> Switch-case Statement
         * */

        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age<18){
            System.out.println("You can't get driving license!");
        }
//        if(age>130){
//            System.out.println("Invalid age");
//        }
        else{
            System.out.println("You can get the driving license!");
        }

        if (age == 1) {
            System.out.println("Hello baby!");
        }
        else if (age == 20) {
            System.out.println("Hello adult!");
        } else {
            System.out.println("Hello senior citizen!");
        }

    }

}
