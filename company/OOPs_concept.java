package com.company;


import java.util.ArrayList;

public class OOPs_concept {
    static boolean isPrime(int a) {

        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) return false;
        }

        return true;
    }

     static ArrayList<Integer> sieveOfPrimes(int x, int y) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = x; i <= y; i++) {
            if (isPrime(i)){
                primeList.add(i);
            }
        }

        return primeList;


    }



    public static void main(String[] args) {
//        System.out.println(isPrime(19));
        ArrayList<Integer> arr = sieveOfPrimes(2, 50);
        System.out.println(arr);
    }
}
