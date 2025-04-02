package usantatecla.movies.v25;

public class Movie {

	private static final int DEFAULT_FRECUENT_RENTER_POINTS = 1;

	private String title;

	protected int frequentRenterPoints;

	protected double charge;

	protected double extraCharge;

	protected int daysRentedThreshold;

	public Movie(String title) {
		this.title = title;
	}
	
	public double getCharge(int daysRented) {
		return this.charge;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return DEFAULT_FRECUENT_RENTER_POINTS;
	}
	
	public String getTitle() {
		return title;
	}
	
}
