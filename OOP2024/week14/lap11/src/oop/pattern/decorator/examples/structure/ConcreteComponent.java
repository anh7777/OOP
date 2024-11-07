package oop.pattern.decorator.examples.structure;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.execute()");
    }
}
