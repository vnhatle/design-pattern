package headfirst.practice.decorator;

public class Milk extends CondimentDecorator {

    private static final double MILK_COST = 0.75;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + MILK_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

}
