package usantatecla.movies.v24;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title, Price price) {
        super(title, price);
        this.charge = 1.5;
        this.extraCharge = 1.5;
        this.daysRentedThreshold = 3;
    }

}
