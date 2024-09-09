package headfirst.practice.factory.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (PizzaType.CHEESE.equals(pizzaType)) {
            return new ChicagoStyleCheesePizza();
        }

        if (PizzaType.CLAM.equals(pizzaType)) {
            return new ChicagoStyleClamPizza();
        }

        if (PizzaType.VEGGIE.equals(pizzaType)) {
            return new ChicagoStyleVeggiePizza();
        }

        if (PizzaType.PEPPERONI.equals(pizzaType)) {
            return new ChicagoStylePepperoniPizza();
        }

        return null;
    }
}
