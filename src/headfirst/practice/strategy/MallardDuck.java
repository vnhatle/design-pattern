package headfirst.practice.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
