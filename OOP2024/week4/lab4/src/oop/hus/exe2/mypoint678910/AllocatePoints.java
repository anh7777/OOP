package oop.hus.exe2.mypoint678910;

public class AllocatePoints {
    public static void main(String[] args) {
        // Declare and allocate an array of MyPoint
        MyPoint[] points = new MyPoint[10];

        // Allocate each of MyPoint instances and initialize them
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Use a loop to print all the points
        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}
