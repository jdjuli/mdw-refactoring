package usantatecla.movies.v25;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CustomerNewReleaseRentalTest {

	@Parameterized.Parameters
	public static Object[][] data() {
		return new Object[][]{
				//{daysRended, expectedPrice, expectedFrecuentRenterPoints}
				{1, 3.0, 1},
				{2, 3.0, 2},
				{3, 3.0, 2}
		};
	}

	private final int daysRented;
	private final double expectedPrice;
	private final int expectedFrecuentRenterPoints;

	public CustomerNewReleaseRentalTest(int daysRented, double expectedPrice, int expectedFrecuentRenterPoints) {
		this.daysRented = daysRented;
		this.expectedPrice = expectedPrice;
		this.expectedFrecuentRenterPoints = expectedFrecuentRenterPoints;
	}

	@Test
	public void newReleaseRentalFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", this.expectedPrice)
				.totalAmount(this.expectedPrice).frequentRenterPoints(this.expectedFrecuentRenterPoints).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void newReleaseRentalChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		assertEquals(this.expectedPrice, rental.getCharge(), 0.001);
	}

	@Test
	public void newReleaseRentalFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		assertEquals(this.expectedFrecuentRenterPoints, rental.getFrequentRenterPoints());
	}

}
