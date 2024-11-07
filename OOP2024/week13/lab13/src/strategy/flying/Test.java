package strategy.flying;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new Duck();

        // Initially, mallardDuck can fly with wings
        mallardDuck.setFlyingBehavior(new FlyWithWings());
        mallardDuck.performFly(); // Output: Flying with wings

        // Change the flying behavior at runtime
        mallardDuck.setFlyingBehavior(new FlyNoWay());
        mallardDuck.performFly(); // Output: Unable to fly
    }
}
