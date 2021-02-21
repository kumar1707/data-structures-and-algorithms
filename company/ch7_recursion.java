package com.company;

public class ch7_recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    static int fib(int a) {
        if (a <= 0) return 0;
        else if (a == 1) return 1;
        return fib(a - 1) + fib(a - 2);
    }

    public static void main(String[] args) {
        System.out.println("The factorial of 5 is " + factorial(5));
        System.out.println("The factorial in iterative way of 5 is " + factorial_iterative(5));
        System.out.println(fib(6)); //1,1,2,3,5,8 <---
    }
}
