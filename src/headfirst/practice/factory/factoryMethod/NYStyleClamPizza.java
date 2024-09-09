package headfirst.practice.factory.factoryMethod;

public class NYStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY style clam pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NY style clam pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NY style clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("NY style clam pizza box");
    }
}
