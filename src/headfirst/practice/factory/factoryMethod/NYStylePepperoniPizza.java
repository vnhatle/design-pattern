package headfirst.practice.factory.factoryMethod;

public class NYStylePepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY style pepperoni pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY style pepperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NY style pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("NY style pepperoni pizza box");
    }
}
