package oop.pattern.decorator.exe1;

public abstract class ShapeDecorator {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public abstract void draw();
}
