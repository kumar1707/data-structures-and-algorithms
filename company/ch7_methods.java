package com.company;

import java.util.Scanner;

public class ch7_methods {
    int addTwo(int x, int y) {
        int z = x + y;
        return z;
    }

    static int add(int n) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            total = total + input;
        }
        return total;
    }

    static int[] reverse(int[] array) {
        int l = array.length;
        int[] b = new int[l];
        for (int i = 0; i < array.length; i++) {
            b[l - 1] = array[i];
            l--;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = addTwo(a, b);
//        int z = add(2);
//        System.out.println(c);
//        int[] marks = {77, 43, 90, 65, 9};
//        int[] reveredArray = reverse(marks);
//        for (int element : reveredArray) {
//            System.out.print(element + " ");
//        }
//        int x = 1;
//        int y = 2;
//        ch7_methods obj = new ch7_methods();
//        int c = obj.addTwo(x, y);
//        System.out.println(c);
    }
}

