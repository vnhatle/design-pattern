package headfirst.practice.factory.factoryMethod;

public class ChicagoStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Chicago style clam pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago style clam pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago style clam pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago style clam pizza box");
    }
}
