package headfirst.practice.decorator;

public class Whip extends CondimentDecorator {

    private static final double WHIP_COST = 1.0;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + WHIP_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
}
