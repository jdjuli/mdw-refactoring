package usantatecla.movies.v24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {

	private String name;
	
	private List<Rental> rentals;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		Iterator<Rental> rentals = this.rentals.iterator();
		String result = "Rental Record for " + this.getName() + "\n";
		double totalCharge = 0.0;
		int totalFrecuentRenterPoints = 0;
		while (rentals.hasNext()) {
			Rental each = rentals.next();
			result += "\t" + each.getMovieTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
			totalCharge += each.getCharge();
			totalFrecuentRenterPoints += each.getFrequentRenterPoints();
		}
		result += "Amount owed is " + String.valueOf(totalCharge) + "\n";
		result += "You earned " + String.valueOf(totalFrecuentRenterPoints) + " frequent renter points";
		return result;
	}

}
