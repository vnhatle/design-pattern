package headfirst.practice.factory.abstractFactory;

public class Client {

    public static void main (String [] args) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new ClamPizza(pizzaIngredientFactory);
        pizza.prepare();
        System.out.println(pizza.toString());
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
