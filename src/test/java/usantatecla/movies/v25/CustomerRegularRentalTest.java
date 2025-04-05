package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerRegularRentalTest {

	@Test
	public void regularRental1DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 2)
				.totalAmount(2).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void regularRental1DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(2.0, rental.getCharge(), 0.001);
	}

	@Test
	public void regularRental1DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void regularRental2DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 2)
				.totalAmount(2).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void regularRental2DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		assertEquals(2.0, rental.getCharge(), 0.001);
	}

	@Test
	public void regularRental2DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void regularRental3DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3.5)
				.totalAmount(3.5).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void regularRental3DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(3.5, rental.getCharge(), 0.001);
	}

	@Test
	public void regularRental3DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}
}
