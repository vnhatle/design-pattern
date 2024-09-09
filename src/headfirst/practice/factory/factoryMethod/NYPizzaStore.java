package headfirst.practice.factory.factoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (PizzaType.CHEESE.equals(pizzaType)) {
            return new NYStyleCheesePizza();
        }

        if (PizzaType.CLAM.equals(pizzaType)) {
            return new NYStyleClamPizza();
        }

        if (PizzaType.VEGGIE.equals(pizzaType)) {
            return new NYStyleVeggiePizza();
        }

        if (PizzaType.PEPPERONI.equals(pizzaType)) {
            return new NYStylePepperoniPizza();
        }

        return null;
    }
}
