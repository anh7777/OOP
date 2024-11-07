package oop.pattern.decorator.examples.structure;

public class App {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        BaseDecorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
