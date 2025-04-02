package usantatecla.movies.v24;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title, Price price) {
        super(title, price);
        this.charge = 1.5;
        this.extraCharge = 1.5;
        this.daysRentedThreshold = 3;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = super.getCharge(daysRented);
        if (daysRented > this.daysRentedThreshold) {
            result += (daysRented - 1) * this.extraCharge;
        }
        return result;
    }

}
