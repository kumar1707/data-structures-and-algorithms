package com.company;

public class ch7_methods_PS {
    static void multiplicationTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    static void starPatterns(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int recursiveSum(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else return n + recursiveSum(n - 1);
    }

    static void reverseStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int nthfib(int n) {
        /*if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }*/
        if (n == 1 || n == 2) return n - 1;
        else return nthfib(n - 1) + nthfib(n - 2);
    }

    static void recursiveStarPatterns(int n) {
        if (n > 0) {
            reverseStarPattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int iter_n_nat_nums_sum(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    static double cToF(double cel) {
        return 9 / 5f * cel + 32;
    }

    static void recStarPatterns(int n) {
        if (n > 0) {
            recStarPatterns(n - 1);
            for (int i = n; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum(int... arr) {
        int total = 0;
        for (int element : arr) {
            total += element;
        }
        return total;
    }

    public static void main(String[] args) {
        // Question 1
//        multiplicationTable(11);

        // Question 2
//        starPatterns(6);

        // Question 3
//        int a = recursiveSum(1);
//        System.out.println(a);

        // Question 4
//        reverseStarPattern(9);

        // Question 5
//        int a = nthfib(6);
//        System.out.println(a);

        // Question 6
//        int result = sum(425,235,2,342,231,41);
//        System.out.println(result);

        // Question 7
//        recursiveStarPatterns(6);

        // Question 8
//        recStarPatterns(6);

        // Question 9
//        double i = cToF(90.4);
//        System.out.println(i);

        // Question 10
//        int j = iter_n_nat_nums_sum(10);
//        System.out.println(j);

    }
}
