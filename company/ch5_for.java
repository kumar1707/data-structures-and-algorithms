package com.company;

public class ch5_for {
    public static void main(String[] args) {
        // template
        /*
         * for (init, cond. bool, update){
         *   code
         * }
         * */
//        int n = 9;
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }

        // Finding total
//        int total = 0;
//        for (int i = 0; i <= 10; i++) {
//            total += i;
//        }
//        System.out.printf("The total is %d\n", total);
//
//        // printing odds
//        for (int i = 1; i<=10; i+=2){
//            System.out.println(i);
//        }
//        // OR
//        for (int j=0; j<=10; j++){
//            System.out.println(2*j+1);
//        }

        // decrementing for and while loops
//        int i = 10;
//        while (i>0){
//            System.out.println(i);
//            i--;

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 10; i != 0; i--) {
            System.out.println(i);
        }
    }
}
