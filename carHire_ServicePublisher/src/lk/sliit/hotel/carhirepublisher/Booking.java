package lk.sliit.hotel.carhirepublisher;

public class Booking {
	
	//Attributes
	private int  days;
	private int option;
	private double charge;
	
	String option1;
	
	
	//Constructor
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Booking( int days, int option, double charge) {
		super();
		this.charge = charge;
		this.days = days;
		this.option = option;
	}
	
	

	//Getters and Setters
	/*
	 * public int getBookingId() { return bookingId; }
	 * 
	 * public void setBookingId(int bookingId) { this.bookingId = bookingId; }
	 */
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	
	
	//Methods
	public void printDetails() {
		
		
		
		if(getOption() == 1) {
			option1 = "Wagon R";
		}
		else if(getOption() == 2) {
			option1 = "KDH Van";
		}
		else if(getOption() == 3) {
			option1 = "Prius Car";
		}
		
		System.out.println("\n");
		
		System.out.println("--------------------------");
		System.out.println("Booking Option: " + option1);
		System.out.println("Number of days : " + getDays());
		System.out.println("Booking Charges: " + getCharge());
		System.out.println("--------------------------");
		
		
	}
	
	

}
