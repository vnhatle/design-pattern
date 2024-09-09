package headfirst.practice.decorator;

public class Decaf extends Beverage {

    private static final double DECAF_COST = 4.5;

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return DECAF_COST;
    }
}
