package headfirst.practice.decorator;

public class Soy extends CondimentDecorator {

    private static final double SOY_COST = 0.25;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + SOY_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    
}
