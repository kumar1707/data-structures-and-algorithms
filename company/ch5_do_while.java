package com.company;

import java.util.Scanner;

public class ch5_do_while {
    public static void main(String[] args) {
//        int a= 0;
//        while (a<=5){
//            System.out.println(a);
//            a++;

//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b < 5);

        // Quick quiz
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a <= n);


    }
}
