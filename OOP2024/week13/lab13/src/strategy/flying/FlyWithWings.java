package strategy.flying;

public class FlyWithWings implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}