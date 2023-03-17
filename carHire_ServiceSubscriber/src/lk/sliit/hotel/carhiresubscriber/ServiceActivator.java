package lk.sliit.hotel.carhiresubscriber;


import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import lk.sliit.hotel.carhirepublisher.CarHire_PublishService;


public class ServiceActivator implements BundleActivator {

	//Create a service reference
	ServiceReference serviceReference;
	
	//variables
	int optionNo;
	int days;
	int bookingId;

	public void start(BundleContext context) throws Exception {
		
		//Scanner object
		Scanner sc = new Scanner (System.in);
		int option;
		
		//Display when the subscriber starts
		System.out.println("Car-Hire Subscriber Service Started");
		
		//Refer the registered service
		serviceReference = context.getServiceReference(CarHire_PublishService.class.getName());
			
		//Create getService from ServicePublish
		CarHire_PublishService servicePublish = (CarHire_PublishService)context.getService(serviceReference);
		
		//Display messages
		System.out.println("=====Welcome to Hotel BlueLock========");
		System.out.println("Option 1 : View Cars");
		System.out.println("Option 2 : Book Cars For Hire");
		System.out.println("Option 3 : Cancel Bookings");
		System.out.println("===================================");
		
		System.out.print("Enter option (1 or 2 or 3): ");
		option = sc.nextInt();
		
		//Selection
		if (option == 1) {
			servicePublish.viewCars();
		}
		else if (option == 2) {
			servicePublish.bookCars(option,days);
		}
		else if (option == 3) {
			servicePublish.cancelBooking(bookingId);
		}
		else {
			System.out.println("Invalid Option !!!");
		}
			
		
	}

	public void stop(BundleContext context) throws Exception {
		
		//Display when the subscriber stops
		System.out.println("Good Bye !!!");
		
		//Detach the service
		context.ungetService(serviceReference);
	}

}
