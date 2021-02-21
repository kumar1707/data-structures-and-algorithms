package com.company;

import java.util.Random;
import java.util.Scanner;

public class ch4_RPS {
    public static void main(String[] args) {
        Random r = new Random();
        String[] comp_choices = {"rock", "paper", "scissor"};
        int random_comp_card = r.nextInt(comp_choices.length);

        System.out.println("Enter your input (rock, paper, scissor)");
        Scanner sc = new Scanner(System.in);
        String user_input = sc.next();

        String comp_input = comp_choices[random_comp_card];
        System.out.println("Computer's choice was " + comp_input);

        // TIE
        if (user_input.equalsIgnoreCase("rock") && comp_input.equals("rock")) {
            System.out.println("Tie!");
        } else if (user_input.equalsIgnoreCase("paper") && comp_input.equals("paper")) {
            System.out.println("Tie!");
        } else if (user_input.equalsIgnoreCase("scissor") && comp_input.equals("scissor")) {
            System.out.println("Tie!");
        }

        if (user_input.equalsIgnoreCase("rock") && comp_input.equals("paper")) {
            System.out.println("Computer won!");
        } else if (user_input.equalsIgnoreCase("rock") && comp_input.equals("scissor")) {
            System.out.println("You won!");
        }

        if (user_input.equalsIgnoreCase("paper") && comp_input.equals("scissor")) {
            System.out.println("Computer won!");
        } else if (user_input.equalsIgnoreCase("paper") && comp_input.equals("rock")) {
            System.out.println("You won!");
        }

        if (user_input.equalsIgnoreCase("scissor") && comp_input.equals("paper")) {
            System.out.println("You won!");
        } else if (user_input.equalsIgnoreCase("scissor") && comp_input.equals("rock")) {
            System.out.println("Computer won!");
        }

    }
}

