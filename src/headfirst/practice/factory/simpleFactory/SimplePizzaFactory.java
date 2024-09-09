package headfirst.practice.factory.simpleFactory;

public class SimplePizzaFactory {

    public static Pizza createPizza(PizzaType type) {
        if (PizzaType.CHEESE.equals(type)) {
            return new CheesePizza();
        }

        if (PizzaType.VEGGIE.equals(type)) {
            return new VeggiePizza();
        }

        if (PizzaType.CLAM.equals(type)) {
            return new ClamPizza();
        }

        if (PizzaType.PEPPERONI.equals(type)) {
            return new PepperoniPizza();
        }

        return null;
    }
}
