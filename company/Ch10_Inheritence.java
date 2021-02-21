package com.company;

class Base {
	int x;
	
	public void setX(int x) {
		System.out.println("I am in base class and setting x");
		this.x = x;
	}
	
	
	public int getX() {
		return x;
	}
	
	
	public void printMe() {
		System.out.println("Hello this is the \"Base\" class!");
	}
	
}
  
   // Names of Inheritance (3 alternative names)
// Parent --> Child
// SuperClass --> SubClass
// Base --> Derived


// Inheritance from Base class

class Derived extends Base {
	int y;
	
	public void setY(int y) {
		System.out.println("I am in derived class and setting y");
		this.y = y;
	}
	
	
	public int getY() {
		return y;
	}
	
}

class Animal {
	int age;
	
	public void introduceYourself() {
		System.out.println("Hello I am an animal!");
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	
}


class Dog extends Animal{
	int lilAge;
	
	public void bark() {
		System.out.println("Bhauu bhauu");
	}
	
	
	public void setLilAge(int lilAge) {
		this.lilAge = lilAge;
	}
	
	
	public int getLilAge() {
		return lilAge;
	}
}

public class Ch10_Inheritence {

	public static void main(String[] args) {

		// Instantiating object of class Base 
		Base b = new Base();
		b.setX(4);
		System.out.println(b.getX());
		
		// Instantiating object of class Derived
		Derived d = new Derived();
		d.setX(5);
		System.out.println(d.getX());
		
		d.setY(10);
		System.out.println(d.getY());
	
		Animal a = new Animal();
		a.setAge(9);
		System.out.println(a.getAge());
		a.introduceYourself();
		
		Dog doggy = new Dog();
		doggy.setLilAge(4);
		doggy.setAge(54);
		System.out.println(doggy.getLilAge());
		doggy.introduceYourself();
		doggy.bark();
		System.out.println(doggy.getAge());
	}

}
