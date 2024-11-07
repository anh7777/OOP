package strategy.flying;

public class Duck {
    private FlyingBehavior flyingBehavior;

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void performFly() {
        flyingBehavior.fly();
    }
}