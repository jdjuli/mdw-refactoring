package usantatecla.movies.v24;

public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
        this.charge = 2.0;
        this.extraCharge = 1.5;
        this.daysRentedThreshold = 2;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = super.getCharge(daysRented);
        if (daysRented > this.daysRentedThreshold) {
            result += (daysRented - this.daysRentedThreshold) * this.extraCharge;
        }
        return result;
    }

}
