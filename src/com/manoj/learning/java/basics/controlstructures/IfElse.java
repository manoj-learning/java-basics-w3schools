package com.manoj.learning.java.basics.controlstructures;

public class IfElse {

	public static void main(String[] args) {

		String value1 = "Value 01";
		String value2 = "No valuee";

		if (value1 == value2) {

			System.out.println("They're equal");

		}

		if (value1.equals(value2)) { // equals() methods also similar to '=='
			System.out.println("They're still equal");
		} else {
			System.out.println("They're not equal");
		}

		if (value1 == "") { // equals() methods also similar to '=='
			System.out.println("Empty bro");
		} else if (value2 == "") {
			System.out.println("Empty Bro");
		} else {
			System.out.println("Not Empty Bro");
		}

		if (value1 != "SomeValue" && value2 == "noValue") { // if both the conditions are true
			System.out.println("Condition one and condition two are true");
		}

		if (value1 != "SomeValue" || value2 == "noValue") { // if one of the conditions are true
			System.out.println("Either condition one or condition two are true");
		}

		// ternary if condition for simple if-else structures

		String someValueFromTernary = (value1 == null) ? value1 : value2;
		System.out.println(someValueFromTernary);

	}

}
