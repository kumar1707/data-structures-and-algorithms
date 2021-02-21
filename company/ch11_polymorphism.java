package com.company;

interface Camera2 {
    void takeSnap();

    void captureVideo();

    private void greet() {
        System.out.println("Good morning");
    }

    default void record4k() {
        greet();
        System.out.println("Recording in 4K");
    }
}

interface Wifi2 {
    String[] getAvailNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    public void call(int number) {
        System.out.println("Calling " + number);
    }

    public void pickCall() {
        System.out.println("Connecting...");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Camera2, Wifi2 {
    @Override
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    @Override
    public void captureVideo() {
        System.out.println("Capturing Video...");
    }

    // These default methods can be overridden
//    @Override
//    public void record4k(){
//        System.out.println("Smart Phone is recording in 4K..");
//    }

    @Override
    public String[] getAvailNetworks() {
        String[] networkList = {"Paras", "Aryan", "Honey"};
        System.out.println("Getting available networks....");
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network + "network");
    }
}

public class ch11_polymorphism {
    public static void main(String[] args) {
        MyCellPhone2 c = new MySmartPhone2();
        c.call(3242); // It can use only methods of MyCellPhone2
        c.pickCall();

        // MySmartPhone2 p = new MyCellPhone2 --> Throws error as MySmartPhone2 is the subclass of MyCellPhone2
    }
}
