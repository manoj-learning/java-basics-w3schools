package com.manoj.learning.java.basics.oop;

public class Main {

	public static void main(String[] args) {
		
		//object of Animal class and accessing class property
		Animal animal = new Animal();
		System.out.println(animal.planetOfOrigin.toString());
		
		
		//multiple objects of the same class
		Animal dog = new Animal();
		Animal cat = new Animal();
		Animal deer = new Animal();
		
		System.out.println(dog.formFactor);
		System.out.println(cat.planetOfOrigin);
		System.out.println(deer.numberOfChromosomes);
		
		
		//Access Methods With an Object

		dog.printAnimalBasicDetails();
		
	}

}
