package com.company;

interface MySampleInterface {
    void meth1();

    void meth2();
}

interface MyChildSampleInterface extends MySampleInterface{
    void meth3();

    void meth4();
}

class MySampleClass implements MyChildSampleInterface{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }
    @Override
    public void meth2() {
        System.out.println("Meth2");
    }
    @Override
    public void meth3() {
        System.out.println("Meth3");
    }
    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}

public class ch11_interface_inheritance {
    public static void main(String[] args) {
        MySampleClass a = new MySampleClass();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
    }
}
