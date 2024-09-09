package headfirst.practice.factory.factoryMethod;

public class ChicagoStyleVeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style veggie pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago style veggie pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago style veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago style veggie pizza box");
    }
}
