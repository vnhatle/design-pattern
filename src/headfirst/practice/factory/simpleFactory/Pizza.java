package headfirst.practice.factory.simpleFactory;

public abstract class Pizza {

    public void prepare() {
        bake();
        cut();
        box();
    }

    public abstract void bake();

    public abstract void cut();

    public abstract  void box();
}
