package strategy.flying;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Unable to fly");
    }
}