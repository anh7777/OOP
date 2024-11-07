package oop.pattern.decorator.examples.structure;

public class ConcreteDecorator extends BaseDecorator {
    public ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("[ADDITIONAL CODE BLOCK]");
    }
}
