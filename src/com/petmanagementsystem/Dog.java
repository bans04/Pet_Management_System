package com.petmanagementsystem;

public class Dog extends Pet implements Swimable {
	
	public Dog() {
		name = "DOG";
		colour = Colour.BROWN;
	}
	
	@Override
	public void swim() {
		System.out.println(" Dog swim");
	}
	
	
}
