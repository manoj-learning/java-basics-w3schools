package com.manoj.learning.java.basics.strings;

public class Main {

	public static void main(String[] args) {
		// Create the string variable
		String greeting = "hello";
		
		//String length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the text string is: " + txt.length());
		
		//Find character in string
		String locateHere = "Please locate where 'locate' occurs!";
		System.out.println(locateHere.indexOf("locate"));
		
		// String Concatenation 
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName); //+ is also used for addition and concatenation
		
		//Special characters => ""
		String special = "We are the so-called \"Vikings \" from the north.";
		System.out.println(special);
		
		//Special characters => ''
		String singleQuote = "It\'s alright.";
		System.out.println(singleQuote);

		String backSlash = "The character \\ is called backslash.";
		System.out.println(backSlash);
		
		String newLines = "First Line \n Second Line";
		System.out.println(newLines);
		
		String carriageReturn = "Hello\rWorld!";
		System.out.println(carriageReturn);
		
		String tabspace = "Hello\t World with \t tab space!";
		System.out.println(tabspace);
		
		String backspace = "Hello \b World with \b backspace!";
		System.out.println(backspace);
	}

}
