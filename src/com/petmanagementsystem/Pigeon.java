package com.petmanagementsystem;

public class Pigeon extends Pet implements Flyable {
	
	public Pigeon() {
		name = "PIGEON";
		colour = Colour.GREY;
	}
	
	@Override
	public void fly() {
		System.out.println("Peigon fly");
	}
}
