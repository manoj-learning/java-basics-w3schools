package com.manoj.learning.java.basics.controlstructures;

public class ForLoop {

	public static void main(String[] args) {

		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// for each - for each element in an array /list
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
