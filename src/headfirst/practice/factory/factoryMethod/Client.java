package headfirst.practice.factory.factoryMethod;

public class Client {

    public static void main (String [] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);

        pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.PEPPERONI);
    }
}
