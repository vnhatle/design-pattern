package headfirst.practice.decorator;

public class HouseBlend extends Beverage {

    private static final double HOUSE_BLEND_COST = 1.5;

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return HOUSE_BLEND_COST;
    }
}
