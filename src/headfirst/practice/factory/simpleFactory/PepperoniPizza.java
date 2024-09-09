package headfirst.practice.factory.simpleFactory;

public class PepperoniPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni Pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni Pizza box");
    }
}
