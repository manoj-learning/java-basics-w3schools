package com.manoj.learning.java.basics.arrays;

public class Main {

	public static void main(String[] args) {
		// declare array variable
		String[] arrays;

		// declare and initialize
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		int[] myNum = { 10, 20, 30, 40 };

		// access elements in an array
		System.out.println(cars[0]); // Outputs Volvo

		// change an array elements value
		cars[0] = "Opel";

		// array length
		System.out.println(cars.length);

		// loop through array
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// loop through array - for each
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// 2D arrays (2D matrix)
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int x = myNumbers[1][2];
		System.out.println(x);
	}

}
