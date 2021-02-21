package com.company;

// Constructor Inheritance and overloading of constructor

class Base1 {

	public Base1() {
		System.out.println("I am the constructor of Base 1");
	}
	
	// Overloading our constructors
	public Base1(int a) {
		System.out.println("I am the overloaded constructor of Base 1 with value of a as: " + a);
	}
	
	public Base1(int a, int b) {
		System.out.printf("I am the overloaded constructor of Base 1 with the values of "
				+ "a and b as %d and %d \n", a, b);
	}
}


class Derived1 extends Base1 {
	
	public Derived1() {
		// agar hume base class ka overloaded constructor ko call krna hai 
		// from derived class toh hum super keyword ka use krte hai
//		super(9, 34);
		System.out.println("I am the contructor of Derived 1");
	}
	
	public Derived1(int a) {
		System.out.println("I am the overloaded constructor of Derived 1 with value of a as: " + a);
	}
	
	public Derived1(int a, int b) {
		 
		System.out.printf("I am the overloaded constructor of Derived 1 with the values of "
				+ "a and b as %d and %d \n", a, b);
	}
	
}


class childOfDerived1 extends Derived1{
	
	public childOfDerived1() {
		System.out.println("I am the child of derived class constructor");
	}
	
	public childOfDerived1(int x, int y, int z) {
		super(x, y);
		System.out.println("I am the overloaded constructor of childOfDerived 1 with value of z as: " + z);
	}
	
}


public class Ch9_Constructor_In_Inheritence {

	public static void main(String[] args) {
//		Base1 b = new Base1(4, 13);
//		Derived1 d = new Derived1(50, 99);
		childOfDerived1 c = new childOfDerived1(102, 140, 184);
		
	}

}
