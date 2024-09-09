package headfirst.practice.decorator;

public class DarkRoast extends Beverage {

    private static final double DARK_ROAST_COST = 2.5;

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return DARK_ROAST_COST;
    }
}
