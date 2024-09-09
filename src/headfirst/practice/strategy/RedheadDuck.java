package headfirst.practice.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
