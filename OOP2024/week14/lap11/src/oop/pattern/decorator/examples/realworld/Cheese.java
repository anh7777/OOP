package oop.pattern.decorator.examples.realworld;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return pizza.cost();
    }
}
