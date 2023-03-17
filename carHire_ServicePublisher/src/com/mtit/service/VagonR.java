package com.mtit.service;

public class VagonR implements Car {

	
	//Attributes
	private String name = "Vagon R";
	private double charge = 10000;
	private String description = " Luxury Car || Three seats available without driver|| ";

	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Car Name: " + name);
		System.out.println("Car cost per day : " + charge);
		System.out.println("Description: " + description);
		System.out.println("--------------------------");
		
		
		
	}
	
}
