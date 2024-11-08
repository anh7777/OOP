package oop.hus.exe1.exe14;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);

        point.moveUp();
        point.moveRight();
        System.out.println(point.toString());

        MovableCircle circle = new MovableCircle(0, 0, 1, 1,5);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
    }
}
