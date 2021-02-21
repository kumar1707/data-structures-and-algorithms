package com.company;

class PSkaCircle {
	int radius;
	
	public PSkaCircle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public float getArea() {
		float area = (float) Math.PI * radius * radius;
		return area;
	}
	
}

class PSkaCylinder extends PSkaCircle {
	int height;
	
	public PSkaCylinder(int height, int radius) {
		super(radius);
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public float getArea() {
		float area = (float) (2* Math.PI * height * radius) + (float) (2 * Math.PI * radius * radius);
		return area;
	}
	
}

public class Ch10_Inheritence_PS {

	public static void main(String[] args) {
		// Question 1
		PSkaCircle cir = new PSkaCircle(4);
		System.out.println(cir.getArea());
		
		PSkaCylinder cyl = new PSkaCylinder(90, 32);
		float area = cyl.getArea();
		System.out.println(area);
	}

}
