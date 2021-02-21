package com.company;

interface Bicycle {
    int model = 10;

    void applyBreak(int decrement);

    void speedUp(int increment);
}

interface HornWaliCycle {

    void BlowHorn();

    void BlowSongWalaHorn();

}

class Cycle {
    int tyres;
    public Cycle(int tyres) {
        this.tyres = tyres;
    }

    public void move() {
        System.out.println("Moving...");
    }
}

class AvonCycle extends Cycle implements Bicycle, HornWaliCycle {
    int speed;

    public AvonCycle(int tyres, int speed) {
        super(tyres);
        this.speed = speed;
    }

    void blowHorn() {
        System.out.println("pee pee poo poo");
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void BlowHorn() {
        System.out.println("Tujhe dekha toh yeh jaana sanam...");
    }

    @Override
    public void BlowSongWalaHorn() {
        System.out.println("Aeee nacho saaree jee phadd keee pee pee poo poo");
    }
}

public class ch11_interfaces_intro {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle(2, 60);
        System.out.println(a.speed);
        System.out.println(a.model);
        a.speedUp(30);
        a.applyBreak(47);
        a.blowHorn();
        a.BlowSongWalaHorn();
        a.BlowHorn();
        // The properties of the interfaces cannot be modified

        System.out.println(a.speed);
        a.move();
        System.out.println(a.tyres);
        System.out.println("the model number of the bicycle is " + a.model);

        Bicycle b = new AvonCycle(2, 30);
        b.speedUp(32); // can use only the methods of Bicycle interface

    }
}
