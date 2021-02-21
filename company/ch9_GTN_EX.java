package com.company;

import java.util.Random;
import java.util.Scanner;


class MyGuessGame {
    int attempts = 5;
    int randomNumber;
    int guessedNumber;

    public int getRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max is lesser");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void play() {
        int min = 0;
        int max = 15;
        randomNumber = getRandomNumber(min, max);
//        System.out.println(randomNumber);
        System.out.printf("Enter a number between %d and %d\n", min, max);
        Scanner sc = new Scanner(System.in);
        guessedNumber = sc.nextInt();

        while (guessedNumber != randomNumber && attempts > 0) {
            if (guessedNumber < randomNumber) {
                System.out.println("Go higher");
                attempts -= 1;
                System.out.println("Attempts left are " + attempts);
            } else {
                System.out.println("Go lower");
                attempts -= 1;
                System.out.println("Attempts left are " + attempts);
            }

            System.out.printf("Enter a number between %d and %d\n", min, max);
            guessedNumber = sc.nextInt();
        }

        if (guessedNumber == randomNumber) {
            System.out.println("you won");
        }
    }
}

public class ch9_GTN_EX {
    public static void main(String[] args) {
        MyGuessGame g = new MyGuessGame();

        g.play();
    }
}
