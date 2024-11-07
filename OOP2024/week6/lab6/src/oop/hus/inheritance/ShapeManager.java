package oop.hus.inheritance;

import oop.hus.exe1.shape.Shape;

public class ShapeManager {
    public static void main(String[] args){
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Circle(2.0);
        System.out.println("\n" + shape2);
        System.out.println("Area: " + ((Circle)shape2).getArea());
        System.out.println("Perimeter: " + ((Circle) shape2).getPerimeter());
    }
}
