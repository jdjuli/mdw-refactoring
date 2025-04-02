package usantatecla.movies.v24;

public class RegularMovie extends Movie {

    public RegularMovie(String title, Price price) {
        super(title, price);
        this.charge = 2.0;
        this.extraCharge = 1.5;
        this.daysRentedThreshold = 2;
    }

}
