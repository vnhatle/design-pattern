package headfirst.practice.factory.simpleFactory;

public class Client {

    public static void main(String [] args) {
        Pizza pizza = SimplePizzaFactory.createPizza(PizzaType.CHEESE);
        pizza.prepare();
    }
}
