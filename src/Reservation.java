import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import javax.swing.text.DateFormatter;

public class Reservation {
 
	private final double NIGHTLY_RATE = 145.00;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private int numberOfNights = 0;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;	
	}
	
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDateFormatted() {
        DateTimeFormatter adf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM);    
		return adf.format(arrivalDate);
	}
	
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
        DateTimeFormatter ddf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM);    
		return ddf.format(departureDate);
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public int getNumberOfNights() {
		long nbrOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return (int) nbrOfNights;
	}
	
	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();			
		return currency.format(NIGHTLY_RATE);
	}
	
	public double getTotalPrice() {	
		return NIGHTLY_RATE*getNumberOfNights();
	}
	
	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();			
		return currency.format(getTotalPrice());
	}
	
}
