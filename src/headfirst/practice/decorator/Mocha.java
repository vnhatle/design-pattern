package headfirst.practice.decorator;

public class Mocha extends CondimentDecorator {

    private static final double MOCHA_COST = 0.5;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + MOCHA_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
