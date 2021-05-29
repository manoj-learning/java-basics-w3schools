package com.manoj.learning.java.basics.math;

public class Main {

	public static void main(String[] args) {
		System.out.println("Maximum Value: " + Math.max(5, 10)); //Returns the maximum value 
		
		System.out.println("Minimum Value: " + Math.min(5, 10));//Returns the minimum value 
		
		System.out.println("Square Root of " + 64  +"is: " + Math.sqrt(64));//Returns the Square Root of the value
		
		System.out.println("Absolute Value: " + Math.abs(-4.7));//Returns the absolute (minimum) value 
		
		System.out.println("Random Value: " + Math.random());//Returns the minimum value 
		
		//More on random
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);

	}

}
