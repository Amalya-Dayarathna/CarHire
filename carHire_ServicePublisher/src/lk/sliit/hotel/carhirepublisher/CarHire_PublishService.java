package lk.sliit.hotel.carhirepublisher;

public interface CarHire_PublishService {
	
	public void viewCars();
	public void bookCars(int option );
	public void viewBooking();
	public void cancelBooking(int bookingId);

}
