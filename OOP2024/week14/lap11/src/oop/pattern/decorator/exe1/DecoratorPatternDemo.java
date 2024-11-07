package oop.pattern.decorator.exe1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Red Circle: " + redCircle.toString());
    }
}
