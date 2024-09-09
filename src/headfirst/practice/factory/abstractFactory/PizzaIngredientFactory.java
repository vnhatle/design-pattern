package headfirst.practice.factory.abstractFactory;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();

}
