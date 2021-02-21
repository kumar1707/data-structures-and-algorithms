package com.company;

interface Camera {
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

interface Wifi {
    String[] getAvailNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    public void call(int number) {
        System.out.println("Calling " + number);
    }

    public void pickCall() {
        System.out.println("Connecting...");
    }

}

class MySmartPhone extends MyCellPhone implements Camera2, Wifi2 {
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

public class ch11_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getAvailNetworks();
        for (String elem : ar) System.out.print(elem + " ");
        System.out.print("\n");
        ms.record4k();



    }
}
