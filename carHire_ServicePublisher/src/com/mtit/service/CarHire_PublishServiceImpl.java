package com.mtit.service;

import java.util.Scanner;

public class CarHire_PublishServiceImpl implements CarHire_PublishService {
	
	//viewCars method
	@Override
	public void viewCars() {
		
		CarFactory carFactory = new CarFactory();
		carFactory.displayCars();
		
	}
	
	//bookCars method
	@Override
	public void bookCars(int option, int days) {
		
		//Scanner object 
		Scanner sc = new Scanner(System.in);
		
		//carFactory object
		CarFactory carFactory = new CarFactory();
		
		//Input the option from the user
		System.out.println("Enter the option : ");
		option = sc.nextInt();
		
		//Input the number of days of the booking from the user
		System.out.println("Enter the number of days of the booking : ");
		days = sc.nextInt();
		
		//Send the details for bookCars method of CarFactory class
		carFactory.bookCars(option,days);
		
		//Close the scanner object
		sc.close();
		
	}
	

	@Override
	public void cancelBooking(int bookingId) {

		//Scanner object 
		Scanner sc = new Scanner(System.in);
		
		//carFactory object
		CarFactory carFactory = new CarFactory();
		
		//Input the booking id from the user
		System.out.println("Enter the booking Id : ");
		bookingId = sc.nextInt();
		
		
		//Send the booking id for cancelBooking method of CarFactory class
		carFactory.cancelBooking(bookingId);
		
		//Close the scanner object
		sc.close();
		
		
	}
	
	
	

}
