package com.mtit.service;

public class KDHVan implements Car {
	
	//Attributes
	private String name = "KDH Van";
	private double charge = 15000;
	private String description = " Luxury Van || Sixteen seats available without driver|| ";

	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Car Name: " + name);
		System.out.println("Car cost per day : " + charge);
		System.out.println("Description: " + description);
		System.out.println("--------------------------");
		
		
		
	}
	

}
