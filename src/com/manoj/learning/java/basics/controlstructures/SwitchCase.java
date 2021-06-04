package com.manoj.learning.java.basics.controlstructures;

public class SwitchCase {
	public static void main(String[] args) {
		
		String conditionVal = "CAR";
		
		switch(conditionVal) {
			case "CAR":
				System.out.println("This is a car");
				break;
			case "Van":
				System.out.println("This is a van");
				break;
				
			default:
				System.out.println("im a default dude");
				break;
		}
	}
}
