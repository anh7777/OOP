package oop.pattern.factorymethod.exe2;

public class PizzaFactoryTest {
    public static void main(String[] args) {
        testMakePizzas();
    }

    public static void testMakePizzas() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}