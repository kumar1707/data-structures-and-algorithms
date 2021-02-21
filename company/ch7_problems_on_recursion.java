package com.company;

public class ch7_problems_on_recursion {
    static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumOfArrayUsingRec(int[] arr, int n) {
//        int n = arr.length;
        if (n <= 0) {
            return 0;
        }
        return (sumOfArrayUsingRec(arr, n - 1) + arr[n - 1]);
    }

    static int power(int num, int p) {
        if (p == 0) {
            return 1;
        }
        return (num * power(num, p - 1));
    }

    static int decToBin(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 2 + 10 * (decToBin(n / 2));
        }

    }

    static int bin(int n) {
        int num = n;
        int dec = 0;

        int base = 1;
        int temp = num;

        while (temp > 0) {

            int ld = temp % 10;
            temp = temp / 10;
            dec += ld * base;
            base *= 2;

        }

        return dec;
    }

    public static void main(String[] args) {
        // Problem 1 - fibonacci sequence
        int a = fib(4);
        System.out.println(a);

        // Problem 2 - factorial
        int b = factorial(6);
        System.out.println(b);

        // Problem 3 - sum of elements of array using recursion
        int[] marks = {32, 4, 90, 56, 11};
        int c = sumOfArrayUsingRec(marks, 5);
        System.out.println(c);

        // Problem 4 - power
        int n = 4;
        int p = 3;
        int d = power(n, p);
        System.out.println(d);

        int dec = 10;
        System.out.println("The binary for the given number is " + decToBin(dec));

        int i = 1010;
        System.out.println("The number for the given binary is " + bin(i));


    }
}
