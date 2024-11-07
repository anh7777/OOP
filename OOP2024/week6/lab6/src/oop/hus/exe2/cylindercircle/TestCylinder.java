package oop.hus.exe2.cylindercircle;

import oop.hus.exe1.circle.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        oop.hus.exe1.circle.Cylinder cylinder1 = new oop.hus.exe1.circle.Cylinder();
        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Cylinder: " +
                "radius=" + cylinder1.getRadius() +
                ", height=" + cylinder1.getHeight() +
                ", base area=" + cylinder1.getArea() +
                ", volume=" + cylinder1.getVolume());


        oop.hus.exe1.circle.Cylinder cylinder2 = new oop.hus.exe1.circle.Cylinder(10.0);
        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Cylinder: " +
                "radius=" + cylinder2.getRadius() +
                ", height=" + cylinder2.getHeight() +
                ", base area=" + cylinder2.getArea() +
                ", volume=" + cylinder2.getVolume());


        oop.hus.exe1.circle.Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3: " + cylinder3);
        System.out.println("Cylinder: " +
                "radius=" + cylinder3.getRadius() +
                ", height=" + cylinder3.getHeight() +
                ", base area=" + cylinder3.getArea() +
                ", volume=" + cylinder3.getVolume());

        System.out.println("Volume of Cylinder 3: " + cylinder3.getVolume());
    }
}
