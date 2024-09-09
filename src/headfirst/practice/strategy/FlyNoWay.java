package headfirst.practice.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying now");
    }
}
