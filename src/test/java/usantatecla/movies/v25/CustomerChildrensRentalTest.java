package usantatecla.movies.v25;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CustomerChildrensRentalTest {

	@Parameterized.Parameters
	public static Object[][] data() {
		return new Object[][]{
				//{daysRended, expectedPrice, expectedFrecuentRenterPoints}
				{1, 1.5, 1},
				{3, 1.5, 1},
				{4, 6.0, 1}
		};
	}

	private final int daysRented;
	private final double expectedPrice;
	private final int expectedFrecuentRenterPoints;

	public CustomerChildrensRentalTest(int daysRented, double expectedPrice, int expectedFrecuentRenterPoints) {
		this.daysRented = daysRented;
		this.expectedPrice = expectedPrice;
		this.expectedFrecuentRenterPoints = expectedFrecuentRenterPoints;
	}

	@Test
	public void childrensRentalFormatTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		Customer customer = new CustomerBuilder().name("customerName").rental(rental).build();
		String result = new StatementBuilder().customerName("customerName").movie("movieName", this.expectedPrice)
				.totalAmount(this.expectedPrice).frequentRenterPoints(this.expectedFrecuentRenterPoints).build();
		assertEquals(result, customer.statement());
	}

	@Test
	public void childrensRentalChargeTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		assertEquals(this.expectedPrice, rental.getCharge(), 0.001);
	}

	@Test
	public void childrensRentalFrecuentRenterPointsTest() {
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(this.daysRented).build();
		assertEquals(this.expectedFrecuentRenterPoints, rental.getFrequentRenterPoints());
	}
}
