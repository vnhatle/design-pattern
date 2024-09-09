package headfirst.practice.factory.factoryMethod;

public class ChicagoStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style cheese pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago style cheese pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago style cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago style cheese pizza box");
    }
}
