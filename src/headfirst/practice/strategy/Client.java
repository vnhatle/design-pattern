package headfirst.practice.strategy;

public class Client {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
        duck.performFly();
    }
}
