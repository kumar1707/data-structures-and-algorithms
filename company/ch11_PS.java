package com.company;

abstract class Pen {
    abstract public void write();

    abstract public void refill();

}

class OctanePen extends Pen {
    @Override
    public void write() {
        System.out.println("Writing...");
    }

    @Override
    public void refill() {
        System.out.println("Refilling...");
    }

}

class FountainPen extends Pen {
    @Override
    public void write() {
        System.out.println("Writing with Fountain Pen");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the Fountain pen");
    }

    public void changeNib(String nameOfNib) {
        System.out.println("Changed nib to " + nameOfNib);
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

abstract class TelePhone {

    abstract public void ring();

    abstract public void lift();

    abstract public void disconnect();

    public void call_number(long number) {
        System.out.println("Calling number " + number);
    }

}

class SmartTelePhone extends TelePhone {
    private final int cores;

    public SmartTelePhone(int cores) {
        this.cores = cores;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public void ring() {
        System.out.println("ring ring..");
    }

    @Override
    public void lift() {
        System.out.println("Lifting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
    }

    public void getOnSpeaker() {
        System.out.println("The call is on speaker mode...");
    }

}

class Monkey {
    public void jump() {
        System.out.println("Jumped...");
    }

    public void bite() {
        System.out.println("Biting...");
    }

}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void walk() {
        System.out.println("Walking...");
    }
}

interface TvRemote {
    void changeChannel(int to);

    void back();
}

interface SmartTvRemote extends TvRemote {
    @Override
    void back();

    void openYoutube();

    void openNetflix();

}

class MyRemote implements TvRemote, SmartTvRemote {
    @Override
    public void back() {
        System.out.println("Returned to previous channel");
    }

    @Override
    public void changeChannel(int to) {
        System.out.println("Changed channel to " + to);
    }

    @Override
    public void openNetflix() {
        System.out.println("Opened Netflix");
    }

    @Override
    public void openYoutube() {
        System.out.println("Open Youtube");
    }

    public void turnOFF() {
        System.out.println("Tata bye bye");
    }
}

public class ch11_PS {
    public static void main(String[] args) {

        // Question 1
//        FountainPen f = new FountainPen();
//        f.refill();
//        f.write();
//        f.changeNib("Bluish");

        // Question 3
//        Human aryan = new Human();
//        aryan.eat();
//        aryan.bite();
//        aryan.sleep();
//        aryan.jump();
//        aryan.walk();

        // Question 4
//        SmartTelePhone s = new SmartTelePhone(4);
//        s.call_number(4353524);
//        s.disconnect();
//        s.lift();
//        System.out.println(s.getCores());
//        s.ring();
//        s.getOnSpeaker();
//
//        System.out.println();
//
//        TelePhone t = new SmartTelePhone(4);
//        t.call_number(35352);
//        t.lift();
//        t.disconnect();
//        t.ring();

        // Question 5
//        Monkey m = new Monkey();
//        m.bite();
//        m.jump();
//
//        Monkey h = new Human();
//        h.jump();
//        h.walk();  -- throws an error because we are making the object of class monkey
//        but using the reference of class Human (child class of monkey class).. thus
//        it can only use the methods of class monkey

        // Question 6 and 7
//        MyRemote t = new MyRemote();
//        t.back();
//        t.openNetflix();
//        System.out.println();
//
//        SmartTvRemote s = new MyRemote();
//        s.back();
//        s.turnOFF();

    }
}
