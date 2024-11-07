package oop.hus.exe2.mypoint678910;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(8, 2);
        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
