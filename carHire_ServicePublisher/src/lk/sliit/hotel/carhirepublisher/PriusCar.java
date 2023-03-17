package lk.sliit.hotel.carhirepublisher;

public class PriusCar implements Car {

	
	//Attributes
	private String name = "Prius Car";
	private double charge = 12000;
	private String description = " Luxury Car || Four seats available without driver|| ";

	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Car Name: " + name);
		System.out.println("Car cost per day : " + charge);
		System.out.println("Description: " + description);
		System.out.println("--------------------------");
		
		
		
	}
	
}
