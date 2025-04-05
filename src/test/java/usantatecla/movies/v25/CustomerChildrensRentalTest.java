package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerChildrensRentalTest {

	
	@Test
	public void childrensRental1DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 1.5)
				.totalAmount(1.5).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void childrensRental1DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(1.5, rental.getCharge(), 0.001);
	}

	@Test
	public void childrensRental1DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void childrensRental3DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 1.5)
				.totalAmount(1.5).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void childrensRental3DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(1.5, rental.getCharge(), 0.001);
	}

	@Test
	public void childrensRental3DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void childrensRental4DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 6)
				.totalAmount(6).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void childrensRental4DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		assertEquals(6.0, rental.getCharge(), 0.001);
	}

	@Test
	public void childrensRental4DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}
}
