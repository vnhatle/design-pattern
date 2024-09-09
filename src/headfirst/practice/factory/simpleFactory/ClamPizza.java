package headfirst.practice.factory.simpleFactory;

public class ClamPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Clam Pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Clam Pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Clam Pizza box");
    }
}
