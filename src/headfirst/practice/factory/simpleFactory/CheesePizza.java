package headfirst.practice.factory.simpleFactory;

public class CheesePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Cheese Pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Cheese Pizza box");
    }
}
