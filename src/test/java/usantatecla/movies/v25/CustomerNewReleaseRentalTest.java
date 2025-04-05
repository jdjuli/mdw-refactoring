package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerNewReleaseRentalTest {

	@Test
	public void newReleaseRental1DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void newReleaseRental1DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(3.0, rental.getCharge(), 0.001);
	}

	@Test
	public void newReleaseRental1DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		assertEquals(1, rental.getFrequentRenterPoints());
	}

	@Test
	public void newReleaseRental2DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void newReleaseRental2DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		assertEquals(3.0, rental.getCharge(), 0.001);
	}

	@Test
	public void newReleaseRental2DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		assertEquals(2, rental.getFrequentRenterPoints());
	}

	@Test
	public void newReleaseRental3DayFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void newReleaseRental3DayChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(3.0, rental.getCharge(), 0.001);
	}

	@Test
	public void newReleaseRental3DayFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		assertEquals(2, rental.getFrequentRenterPoints());
	}

}
