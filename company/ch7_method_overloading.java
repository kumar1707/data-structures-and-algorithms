package com.company;

public class ch7_method_overloading {
    static int add(int x, int y) {
        return x + y;
    }

    static void change(int a) {
        a = 403;
    }

    static void greet(int a) {
        System.out.println("Good morning " + a);
    }

    static void changeArray(int[] marks) {
        marks[0] = 103;
    }

    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(String a){
        System.out.println("Good morning " + a + " bro!");
    }



    public static void main(String[] args) {
//        int c = add(45, 34);
//        System.out.println(c);
//        int z = 19;
//        change(z);
//        System.out.println(z);

//        greet(43);
        /*
         * Variables aren't changed in methods because the arguments gets
         * copied from the variable
         *
         * Whereas in giving an object as an arguments, the argument is a reference which is an address
         * So the object changes.
         * */

//        int[] marks = {10, 43, 90, 23};
//        changeArray(marks);
//        System.out.println(marks[0]);
//        foo();
//        foo("Aryan");

    }
}
