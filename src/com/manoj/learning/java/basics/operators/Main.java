package com.manoj.learning.java.basics.operators;

public class Main {

	public static void main(String[] args) {

		// Add two values together
		int x = 100 + 50;

		// Assignment ( The '=' sign)
		int y = 10;

		int z = 10;

		z += 5; // Adds 5 to the value
		System.out.println(z); // Prints

		z = z + 5; // same as +=
		System.out.println(z);

		int a = 30;
		a -= 5;
		System.out.println(a);

		a = a - 5; // same as -=
		System.out.println(a);

		int b = 10;

		b *= 2;
		System.out.println(b);

		b = b * 2; // same as *=
		System.out.println(b);

		int c = 10;

		c /= 2;
		System.out.println(c);

		c = c / 2; // same as /=
		System.out.println(c);

		int d = 31;

		d %= 2;
		System.out.println(d);

		d = d % 2; // same as %=
		System.out.println(d);

		int e = 5;

		e &= 3;
		System.out.println(e);

		int f = 5;

		f |= 3;
		System.out.println(f);

		int g = 5;

		g ^= 3;
		System.out.println(g);

		// Comparison operators
		/*
		 * Reason I am assigning this to boolean variable is, Comparison operators
		 * return a boolean value (true or false)
		 */
		boolean comparisons = (x == y); // Equal to
		comparisons = (x != y); // Not equal
		comparisons = (x > y); // Greater than
		comparisons = (x < y); // Less than
		comparisons = (x >= y);
		comparisons = (x <= y);

		System.out.println(comparisons);

		// Logical Operators
		boolean logical = (x < 5 && x < 10); // AND statement. Returns true if both statements are true. else returns
												// false
		logical = (x < 5 || x < 4); // OR statement. Returns true if one of the statements are true. else returns
									// false
		logical = !(x < 5 && x < 10); // NOT statements. returns false if the result is true
		System.out.println(logical);
		;
	}

}
