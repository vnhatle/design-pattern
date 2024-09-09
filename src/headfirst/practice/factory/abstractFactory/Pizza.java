package headfirst.practice.factory.abstractFactory;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "name = " + getName() + ", dough = " + this.dough.getName() + ", sauce = " + this.sauce.getName() + ", cheese = " + this.cheese.getName() + ", clam = " + this.clam.getName();
    }
}
