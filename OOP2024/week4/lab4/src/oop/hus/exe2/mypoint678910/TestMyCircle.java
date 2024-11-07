package oop.hus.exe2.mypoint678910;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(3, 4, 5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
