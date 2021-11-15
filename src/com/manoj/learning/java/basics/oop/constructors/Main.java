package com.manoj.learning.java.basics.oop.constructors;


public class Main {
	int x; 

	// Create a class constructor for the Main class
	public Main() {
		x = 5; // Set the initial value for the class attribute x
	}

	public static void main(String[] args) {
		Main objofMain = new Main(); // Create an object of class Main (This will call the constructor)
		System.out.println(objofMain.x); // Print the value of x
	}
}
