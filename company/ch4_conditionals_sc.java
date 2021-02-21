package com.company;

//import java.util.Scanner;

public class ch4_conditionals_sc {
    public static void main(String[] args) {
//        int weight;
//        Scanner weightInput = new Scanner(System.in);
//        weight = weightInput.nextInt();
//
//        switch (weight){
//            case 13:
//                System.out.println("teenager");
//                break;
//
//            case 24:
//                System.out.println("Adult");
//                break;
//            case 60:
//                System.out.println("Senior Citizen");
//                break;
//            default:
//                System.out.println("Enjoy your life!");
//        }
        char var = 's';
        switch (var) {
            case '3' -> System.out.println("True");
            case 's' -> System.out.println("false");
            case 'g' -> System.out.println("bye");
            default -> System.out.println("enjoy your life!");
        }


    }
}
