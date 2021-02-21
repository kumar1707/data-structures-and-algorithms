package com.company;

class Cylinder {
	private float radius;
	private float height;
	
	// Constructor
	public Cylinder(float r, float h) {
		radius = r;
		height = h;
	}
	
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	public float getRadius() {
		return radius;
	}
	
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	public float getHeight() {
		return height;
	}
	
	
	public float calcSurfaceArea() {
		float h = getHeight();
		float r = getRadius();
		float sa = (float) (2* Math.PI * h * r) + (float) (2 * Math.PI * r * r);
		
		return sa;
	}
	
	
	public float calcArea() {
		float h = getHeight();
		float r = getRadius();
		float area = (float) Math.PI  * r * r * h;
		
		return area;
		
	}
	
}


class Rect {
	private int length;
	private int breadth;
	
	public Rect(int l, int b) {
		length = l;
		breadth = b;
	}
	
	
	public int getLength() {
		return length;
	}
	
	
	public int getBreadth() {
		return breadth;
	}
	
}


public class ch9_acces_modifiers_PS {

	public static void main(String[] args) {
		// Question 1 and 3
		
//		 Cylinder c = new Cylinder(435.124f, 9052.34f); 
//		 c.setRadius(8.45f); c.setHeight(9.32f);
//		 System.out.println(c.getRadius()); System.out.println(c.getHeight());
		 
		
		// Question 2
//		System.out.println(c.calcSurfaceArea());
//		System.out.println(c.calcArea());
		 
		
		// Question 3
		Rect r = new Rect(34, 90);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
	}

}
