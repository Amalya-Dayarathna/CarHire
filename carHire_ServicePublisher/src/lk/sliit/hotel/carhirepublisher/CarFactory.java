package lk.sliit.hotel.carhirepublisher;

import java.util.ArrayList;

public class CarFactory {
	
	//ArrayList for the car categories
	ArrayList <Car> category = new ArrayList<Car>();
	
	//Object from Booking
	Booking booking = new Booking();
	//Booking object
	
	//Method displayCars()
	void displayCars() {
		category.add(new VagonR());
		category.add(new KDHVan());
		category.add(new PriusCar());
		
		//printing
		for (Car car:category) {
			System.out.println("\n");
			car.printDetails();
			
		}
	}
	
	//Method bookCars
	void bookCars(int option, int days) {
		
		double charge;
		
		
		
		
		if (option == 1) {
			charge = (10000.00) * days;
			
			booking.setCharge(charge);
			booking.setDays(days);
			booking.setOption(option);
			
			System.out.println("The total booking charge of Vagon R for " + days + " days : Rs. " + charge);
			
			
		}
		
		else if (option == 2) {
			charge = (15000.00) * days;
			
			booking.setCharge(charge);
			booking.setDays(days);
			booking.setOption(option);
			
			System.out.println("The total booking charge of KDH Van for " + days + " days : Rs. " + charge);
			
			
		}
		
		else if (option == 3) {
			charge = (12000.00) * days;
			
			booking.setCharge(charge);
			booking.setDays(days);
			booking.setOption(option);
			
			System.out.println("The total booking charge of Prius Car for " + days + " days : Rs. " + charge);
			
		}
		
		else {
			System.out.println("Invalid Option !!!");
		}
		
		displayBookings();
		
		
		
	}
	
	//Method displayBookings
	void displayBookings() {
		booking.printDetails();
		
	}
	
	
	//Method cancelBooking
	void cancelBooking (int bookingId) {
		
		//Delete the relevant booking
		
	}
	
	
	
	
	
	

}
