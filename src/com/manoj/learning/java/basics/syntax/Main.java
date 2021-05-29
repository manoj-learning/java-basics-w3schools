package com.manoj.learning.java.basics.syntax;

public class Main {

	public static void main(String[] args) {
		//This is the print line
		System.out.println("Hellow Universe!");
		
		//This is a Java single Line comment
		
		
		/* This 
		 * is a 
		 * java
		 * multi-line
		 * comment
		 * */
		
		//variables
		String variableNameInString = "This is a java String variable";
		System.out.println(variableNameInString);
		
		int variableNameInInt = 123;
		System.out.println(variableNameInInt);
		
		
		//Data types - Primitive
		String stringDatatype = "This is a String";
		int intDatatype = 123;
		float floatDataType = 12.45f; //fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f":
		double doubleDatatype = 12.5445d;//store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d"
		char singleCharacter = 'D';
		byte byteVariable = 100;
		short shortNumbers = 5666; //short handles values from -32768 to 32767
		long longNumbers = 1827311233319237982L; //store whole numbers from -9223372036854775808 to 9223372036854775807
		boolean isTrue = false; 
		boolean isFalse = true;
		
		
		//Type Casting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    double myOtherDouble = 9.78;
	    int myOtherInt = (int) myOtherDouble; // Manual casting: double to int

	    System.out.println(myOtherDouble);   // Outputs 9.78
	    System.out.println(myOtherInt);      // Outputs 9
	}

}
