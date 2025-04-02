package usantatecla.movies.v24;

public class Movie {

	private static final int DEFAULT_FRECUENT_RENTER_POINTS = 1;

	private String title;
	
	private Price price;

	protected int frequentRenterPoints;

	protected double charge;

	protected double extraCharge;

	protected int daysRentedThreshold;

	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
	}
	
	public double getCharge(int daysRented) {
		return this.charge;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return DEFAULT_FRECUENT_RENTER_POINTS;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
}
