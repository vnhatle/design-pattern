package headfirst.practice.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
