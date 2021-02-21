package com.company;

public class ch4_logicals {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println("FOR LOGICAL AND...");
        if (a && b == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("FOR LOGICAL OR...");

        if (d || a) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("FOR LOGICAL NOT...");
        System.out.println(!a);
        System.out.println(!c);


    }
}
