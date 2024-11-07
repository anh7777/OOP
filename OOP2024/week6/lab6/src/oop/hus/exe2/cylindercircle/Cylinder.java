package oop.hus.exe2.cylindercircle;

import oop.hus.exe1.circle.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base.setRadius(radius);
        base.setColor(color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return base.getArea() * height;
    }


    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }


    public String toString() {
        return "Cylinder: subclass of " + base.toString() + ", height=" + height;
    }
}
