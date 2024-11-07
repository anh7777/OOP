package oop.hus.exe2.pointline;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println("Line l1: " + l1);

        Point p1 = new Point(5, 6);
        Point p2 = new Point(10, 12);

        LineSub l2 = new LineSub(p1, p2);
        System.out.println("Line l2: " + l2);
    }
}
