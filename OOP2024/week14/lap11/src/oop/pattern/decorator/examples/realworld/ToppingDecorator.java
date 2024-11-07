package oop.pattern.decorator.examples.realworld;

public abstract class ToppingDecorator extends Pizza {
    protected Pizza pizza;

    public abstract String getDescription();
}
