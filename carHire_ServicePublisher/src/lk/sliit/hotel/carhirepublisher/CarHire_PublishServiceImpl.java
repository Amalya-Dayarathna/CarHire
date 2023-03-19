package lk.sliit.hotel.carhirepublisher;

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
	public void bookCars(int option) {
		
		//Scanner object 
		Scanner sc = new Scanner(System.in);
		
		//Booking object
		Booking booking = new Booking();
		
		//carFactory object
		CarFactory carFactory = new CarFactory();
		
		//Display messages
		System.out.println("\n======== The Car Categories  ========");
		System.out.println("Option 1 : Wagon R");
		System.out.println("Option 2 : KDH Van");
		System.out.println("Option 3 : Prius Car");
		System.out.println("=====================================");
		System.out.println("\n");
		
		
		
		//Input the option from the user
		System.out.println("Enter the category option : ");
		option = sc.nextInt();
		booking.setOption(option);
		
		
		//Input the number of days of the booking from the user
		System.out.println("Enter the number of days of the booking : ");
		int days = sc.nextInt();
		booking.setDays(days);
		
		//Send the details for bookCars method of CarFactory class
		carFactory.bookCars(option,days);
		
		//System.out.println("\n\n");
		
		//Close the scanner object
		//sc.close();
		
	}
	
	//view Bookings method
	@Override
	public void viewBooking() {
		
		CarFactory carFactory = new CarFactory();
		carFactory.displayBookings();
		
		
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
