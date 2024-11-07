package oop.pattern.decorator.exe1;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void draw() {
        this.setRedBorder();
        this.shape.draw();
    }
    private void setRedBorder() {
        System.out.println("Setting Red Border");
    }
}
