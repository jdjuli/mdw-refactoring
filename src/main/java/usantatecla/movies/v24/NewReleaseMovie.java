package usantatecla.movies.v24;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title) {
        super(title);
        this.charge = 3;
        this.daysRentedThreshold = 1;
        this.frequentRenterPoints = 2;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > this.daysRentedThreshold) {
            return this.frequentRenterPoints;
        } else {
            return super.getFrequentRenterPoints(daysRented);
        }
    }
}
