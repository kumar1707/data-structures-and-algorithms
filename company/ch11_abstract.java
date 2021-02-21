package com.company;

abstract class PhoneModel {
    public PhoneModel() {
        System.out.println("I am the constructor of Phone Model");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void turnON();

    abstract public void turnOF();
}

class Redmi extends PhoneModel {
    @Override
    public void turnON() {
        System.out.println("Turning on the mobile...");
    }

    @Override
    public void turnOF() {
        System.out.println("Turning off the mobile");
    }
}

abstract class Graphics extends PhoneModel {
    public void th() {
        System.out.println("The Graphics is working quite well");
    }

}

public class ch11_abstract {
    public static void main(String[] args) {
        // PhoneModel p = new PhoneModel(); -- error.. Abstract classes can't be instantiated
        Redmi Redmi_max_pro = new Redmi();
        Redmi_max_pro.turnON();
        Redmi_max_pro.turnOF();

        PhoneModel p = new Redmi();
        p.sayHello();
        p.turnOF();
        p.turnON();

    }
}
