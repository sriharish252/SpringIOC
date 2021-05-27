
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class TransportService {
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking booking) throws ParseException {

		// code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		booking.setCustomerName(sc.nextLine());
		System.out.println("Enter the Mobile Number");
		booking.setMobileNumber(sc.nextLong());
		System.out.println("Enter the Destination");
		booking.setDestination(sc.next());
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		booking.setDateOfJourney(sdf.parse(sc.next()));

		calculateTravelCost(this.vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());

		sc.close();
	}

	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		if (checkAvailableDateForTravel(doj)) {
			System.out.printf("Total Travel Cost is Rs. %f", getCost(destination));
		} else {
			System.out.println("Invalid Travel Date");
		}

	}

	public boolean checkAvailableDateForTravel(Date doj) {

		// code here
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = null;
		try {
			currentDate = sdf.parse("27-04-2020");
			if (doj.equals(currentDate) || doj.after(currentDate))
				return true;

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return false;
	}

	public double getCost(String destination) {

		// code here
		Map<String, Double> destinationMap = this.vehicle.getDestinationMap();

		if (destinationMap.containsKey(destination))
			return destinationMap.get(destination);

		return 0.0;
	}

}
