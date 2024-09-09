package headfirst.practice.decorator;

public class Espresso extends Beverage {

    private static final double ESPRESSO_COST = 3.5;

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return ESPRESSO_COST;
    }
}
