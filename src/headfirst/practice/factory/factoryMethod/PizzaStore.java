package headfirst.practice.factory.factoryMethod;

public abstract class PizzaStore {

    public abstract Pizza createPizza(PizzaType pizzaType);

    public final void orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
