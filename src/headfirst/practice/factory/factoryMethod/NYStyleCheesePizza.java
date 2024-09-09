package headfirst.practice.factory.factoryMethod;

public class NYStyleCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY style cheese pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY style cheese pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NY style cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("NY style cheese pizza box");
    }
}
