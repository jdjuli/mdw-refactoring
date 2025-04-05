package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

	@Test
	public void withoutRentalsTest() {
		Customer customer = new CustomerBuilder().name("customerName").build();
		String result = new StatementBuilder().customerName("customerName")
				.totalAmount(0).frequentRenterPoints(0).build();
		assertEquals(result, customer.statement());
	}
	
	@Test
	public void rentalTest() {
		Movie regularMovie = new MovieBuilder().title("regularMovieName").regular().build();
		Rental regularRental = new RentalBuilder().movie(regularMovie).daysRented(10).build();
		Movie newReleaseMovie = new MovieBuilder().title("newReleaseMovieName").newRelease().build();
		Rental newReleaseRental = new RentalBuilder().movie(newReleaseMovie).daysRented(10).build();
		Movie childrensMovie = new MovieBuilder().title("childrensMovieName").childrens().build();
		Rental childrensRental = new RentalBuilder().movie(childrensMovie).daysRented(10).build();
		Customer customer = new CustomerBuilder().name("customerName")
				.rental(regularRental).rental(newReleaseRental).rental(childrensRental).build();
		String result = new StatementBuilder().customerName("customerName")
				.movie("regularMovieName", 14)
				.movie("newReleaseMovieName", 3)
				.movie("childrensMovieName", 15)
				.totalAmount(32).frequentRenterPoints(4).build();
		assertEquals(result, customer.statement());
	}

}
