package headfirst.practice.factory.simpleFactory;

public class VeggiePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Veggie Pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Veggie Pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Veggie Pizza box");
    }
}
