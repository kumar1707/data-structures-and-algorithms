package com.company;

public class ch5_while {
    public static void main(String[] args) {
        // Template
        /*
        * while (condition){
        *       // code
        *       // updating (++ or --)
        * }
        * */
        // Incrementing while loop
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        // Decrementing while loop
        int j = 10;
        while (j>0){
            System.out.println(j);
            j--;
        }

        // infinite loop
//        boolean yes = true;
//        while (yes){
//            System.out.println(j);
//            j++;
//        }

        // Quick quiz
        int start_point = 100;
        while (start_point<=200){
            System.out.println(start_point);
            start_point++;
        }

        System.out.println("The code Successfully ended");
        System.out.println("Lets naachoooo!!!");
    }
}
