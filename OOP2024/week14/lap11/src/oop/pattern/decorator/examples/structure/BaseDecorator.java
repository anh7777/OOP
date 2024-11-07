package oop.pattern.decorator.examples.structure;

public class BaseDecorator extends AbstractComponent {
    private final AbstractComponent component;

    protected BaseDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
