package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerNewReleaseRentalTest {

	@Test
	public void newReleaseRental1DayTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(1).build();
		assertEquals(result, customer.statement());
	}
	
	@Test
	public void newReleaseRental2DayTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, customer.statement());
	}
	
	@Test
	public void newReleaseRental3DayTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, customer.statement());
	}
	
}
