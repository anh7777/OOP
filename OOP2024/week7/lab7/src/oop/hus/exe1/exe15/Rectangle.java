package oop.hus.exe1.exe15;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public String toString() {
        return String.format("Rectangle[width=%f,length=%f]", width, length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
