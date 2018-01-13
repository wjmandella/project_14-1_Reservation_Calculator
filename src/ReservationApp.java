import java.time.LocalDate;
import java.util.Scanner;

public class ReservationApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter the arrival month (1-12): ");
			int arrivalMonth = sc.nextInt();
			System.out.print("Enter the arrival day (1-31): ");
			int arrivalDay = sc.nextInt();
			System.out.print("Enter the arrival year (Ex. 2017): ");
			int arrivalYear = sc.nextInt();
			
			LocalDate arrivalDate =LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
			
			System.out.println();
			
			System.out.print("Enter the departure month (1-12): ");
			int departureMonth = sc.nextInt();
			System.out.print("Enter the departure day (1-31): ");
			int departureDay = sc.nextInt();
			System.out.print("Enter the departure year (Ex. 2017): ");
			int departureYear = sc.nextInt();
			LocalDate departureDate = LocalDate.of(departureYear, departureMonth, departureDay);
			
			System.out.println();
			Reservation res = new Reservation(arrivalDate, departureDate);
			
			System.out.println("Arrival date: " + res.getArrivalDateFormatted());
			System.out.println("Departure date: " + res.getDepartureDateFormatted());
			System.out.println("Price: " + res.getPricePerNightFormatted() + " per night");
			System.out.println("Total price:  " + res.getTotalPriceFormatted() + " for " + res.getNumberOfNights() + " night(s)");
			System.out.println();	
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println();
		sc.close();		
		System.out.println("Bye!");
	}
}
