package hus.java;

public class Rectangle implements Shape {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public int compareTo(Shape shape) {
        return Shape.super.compareTo(shape);
    }

    @Override
    public String printShape() {
        return String.format("Rectangle[length=%f, width=%f, are=%s]", length, width, getArea());
    }

    @Override
    public String isShape() {
        return "Rectangle";
    }
}
