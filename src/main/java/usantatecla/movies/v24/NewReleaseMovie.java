package usantatecla.movies.v24;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title, Price price) {
        super(title, price);
        this.charge = 3;
        this.daysRentedThreshold = 1;
        this.frequentRenterPoints = 2;
    }

}
