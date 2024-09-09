package headfirst.practice.factory.factoryMethod;

public class ChicagoStylePepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style pepperoni pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago style pepperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago style pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago style pepperoni pizza box");
    }
}
