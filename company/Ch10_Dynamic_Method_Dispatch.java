package com.company;

class Phone {
	public void showTime() {
		System.out.println("The current time is 7");
	}
	
	public void on() {
		System.out.println("Turning on Phone...");
	}
	
}

class SmartPhone extends Phone{
	
	@Override
	public void on() {
		System.out.println("Turning on Smart Phone...");
	}
	
	public void music() {
		System.out.println("namaste!");
	}
}

public class Ch10_Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		// reference is of phone but object is of Smartphone
		SmartPhone obj = new SmartPhone();
		obj.music();
//		obj.on();
//		obj.music();
		
		
	}

}
