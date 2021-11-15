package com.manoj.learning.java.basics.methods;

public class Main {

	// this is the main method -- the starting point of your application
	public static void main(String[] args) {
		
		//calling the methods in the main root method
		myMethod(); 
		
		String parameter = "Parameter";
		myMethodWithParameter(parameter);
		
		int parameter2 = 2;
		
		//method with multiple parameter
		/*
		 * Also, note that the same method is called with different set of parameters. This is known as overloading
		 * 
		 * */
		myMethodWithParameter(parameter, parameter2);
		
		System.out.println(myMethodWithParameter(parameter, String.valueOf(parameter2)));
	}

	//a public method
	//void means returns nothing
	public static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	//single parameter
	public static void myMethodWithParameter(String parameter) {
		System.out.println("I just got executed with " + parameter);
	}
	
	//multiple parameters
	public static void myMethodWithParameter(String parameter1, int parameter2) {
		System.out.println("I just got executed with parameter 01: " + parameter1 + " and parameter 02: " + parameter2 );
	}
	
	public static String myMethodWithParameter(String parameter1, String parameter2) {
		return "OVERLOADED = I just got executed with parameter 01: " + parameter1 + " and parameter 02: " + parameter2 ;
	}

}
