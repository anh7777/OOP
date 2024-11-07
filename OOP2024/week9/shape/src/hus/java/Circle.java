package hus.java;

public class Circle implements Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Shape shape) {
        return Shape.super.compareTo(shape);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String printShape() {
        return String.format("Circle[radius=%f, are=%s]", radius, getArea());
    }

    @Override
    public String isShape() {
        return "Circle";
    }
}
