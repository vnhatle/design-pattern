package headfirst.practice.factory.factoryMethod;

public class NYStyleVeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY style veggie pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY style veggie pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NY style veggie pizza cut");
    }

    @Override
    public void box() {
        System.out.println("NY style veggie pizza box");
    }
}
