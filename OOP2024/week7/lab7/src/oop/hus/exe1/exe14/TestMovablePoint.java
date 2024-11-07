package oop.hus.exe1.exe14;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        point.moveUp();
        point.moveRight();
        point.toString();
    }
}
