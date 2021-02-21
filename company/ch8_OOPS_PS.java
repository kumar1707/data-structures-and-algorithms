package com.company;

import java.util.Scanner;

class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }
}

class smartPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void call() {
        System.out.println("Calling...");
    }

    public void playMusic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the song you wanna hear");
        String music = sc.next();
        System.out.println("Playing " + music);
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

class Square {
    int side;

    public void initializeSide() {
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        System.out.println("The sides of the Square is " + side);
    }

    public void calculateArea() {
        int area = side * side;
        System.out.println("The area of the square is " + area);
    }
}

class Rectangle {
    int length, breadth;

    public void initializeSides() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("The length is " + length + " and the breadth is " + breadth);
    }

    public void calculateArea() {
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

}

class Circle {
    int radius;

    public void initializeSides() {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        System.out.println("The radius is " + radius);
    }

    public void calculateArea() {
        double area = 2 * 3.14 * radius;
        System.out.println("The area of the circle is " + area);
    }
}

class Game {
    public void hit() {
        System.out.println("Hitting...");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void fire() {
        System.out.println("Firing...");
    }

}

public class ch8_OOPS_PS {
    public static void main(String[] args) {

        // Question 1
        /*
        employee aryan = new employee();
        aryan.name = "Aryan";
        aryan.salary = 1000000;

        System.out.println(aryan.getName());
        System.out.println(aryan.getSalary());
        aryan.setName("Rohan");
        System.out.println(aryan.name);
        System.out.println(aryan.salary);
        */

        // Question 2
        /*
        smartPhone sp = new smartPhone();
        sp.call();
        sp.vibrate();
        sp.playMusic();
        sp.ring();
        */

        // Question 3
        /*
        Square sq = new Square();
        sq.initializeSide();
        sq.calculateArea();
        */

        // Question 4
        /*
        Rectangle r = new Rectangle();
        r.initializeSides();
        r.calculateArea();
        */

        // Question 5
        /*
        Circle cl = new Circle();
        cl.initializeSides();
        cl.calculateArea();
        */

        // Question 6
        /*
        Game game = new Game();
        game.fire();
        game.hit();
        game.run();
        */

    }
}
