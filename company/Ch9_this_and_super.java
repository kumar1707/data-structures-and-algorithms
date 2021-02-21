package com.company;

class EkClass {
	int a;
	
	public EkClass(int a) {
		System.out.println("Hello" + a);
	}
	
	public EkClass(int a, int b) {
		this.a = a;
 		System.out.println(a + " " +  b);
	}
	
	public int return1() {
		return 1;
	}
	
	public int getA() {
		return a;
	}
}

class DoClass extends EkClass{
//	int b;
	
	public DoClass(int c) {
		super(c, 80);
		System.out.println("This is the cnstructor of Do-Class");
	}
}

public class Ch9_this_and_super {

	public static void main(String[] args) {
		EkClass c = new EkClass(45);
//		System.out.println(c.getA());
		DoClass d = new DoClass(90);
		
	} 

}
