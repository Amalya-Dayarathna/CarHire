package com.mtit.service;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	//Register the service
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		//Display when the publisher starts
		System.out.println("Car Hire Publisher Started !");
		
		//Object from ServicePublishImpl interface
		CarHire_PublishService publisherService = new CarHire_PublishServiceImpl();
		
		//Register the service
		publishServiceRegistration = context.registerService(CarHire_PublishService.class.getName(),publisherService,null);	
		
	}

	public void stop(BundleContext context) throws Exception {
		
		//Display when the publisher stop
		System.out.println("Car Hire Publisher Stopped !");
		
		//Unregister the service
		publishServiceRegistration.unregister();
		
	}

}
