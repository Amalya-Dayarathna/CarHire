package com.mtit.service;

import java.util.ArrayList;

public class CarFactory {
	
	//ArrayList for the car categories
	ArrayList <Car> category = new ArrayList<Car>();
	
	//Method displayCars()
	void displayCars() {
		category.add(new VagonR());
		category.add(new KDHVan());
		category.add(new PriusCar());
		
		//printing
		for (Car car:category) {
			car.printDetails();
		}
	}
	
	//Method bookCars
	void bookCars(int option, int days) {
		
		double charge;
		
		if (option == 1) {
			charge = (10000.00) * days;
			
			System.out.println("The total booking charge of Vagon R for " + days + " days : Rs. " + charge);
			
		}
		
		else if (option == 2) {
			charge = (15000.00) * days;
			
			System.out.println("The total booking charge of KDH Van for " + days + " days : Rs. " + charge);
			
		}
		
		else if (option == 3) {
			charge = (12000.00) * days;
			
			System.out.println("The total booking charge of Prius Car for " + days + " days : Rs. " + charge);
			
		}
		
		else {
			System.out.println("Invalid Option !!!");
		}
		
		//Add the booking to the arrayList
	}
	
	//Method cancelBooking
	void cancelBooking (int bookingId) {
		
		//Delete the relevant booking
		
	}
	
	
	
	
	
	

}
