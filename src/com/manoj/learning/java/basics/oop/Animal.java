package com.manoj.learning.java.basics.oop;


//class declaration
public class Animal {
	
	//class property. See Main file for object 
	public String planetOfOrigin = "Earth";
	
	public String formFactor = "CarbonBased";
	
	public int numberOfChromosomes = 23;
	
	//class method
	
	public void printAnimalBasicDetails() {
		System.out.println("I am from : " + this.planetOfOrigin);
		System.out.println("I am : " + this.formFactor);
		System.out.println("I have  " + this.numberOfChromosomes + " chromosomes");
	}

}
