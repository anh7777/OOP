package oop.hus.exe1.exe12;

public class Circle implements GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle[radius=%f]",radius);
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
