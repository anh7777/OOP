package hus.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = inputShapes(scanner);
        printArray(maxCircles(shapes));
        printArray(maxRectangles(shapes));
    }

    public static ArrayList<Shape> inputShapes(Scanner scanner) {
        ArrayList<Shape> shapes = new ArrayList<>();
        while (true) {
            System.out.println("Input shapes: " +
                    "(Enter 0 to exit, " +
                    "Enter 1 to input square, " +
                    "Enter 2 to input rectangle, " +
                    "Enter 3 to input circle)");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else if (n == 1 || n == 2 || n == 3) {
                Shape shape = createShape(n, scanner);
                if (shape != null) {
                    shapes.add(shape);
                }
            } else {
                System.out.println("Error value... Enter again...");
            }
        }
        return shapes;
    }

    private static Shape createShape(int n, Scanner scanner) {
        switch (n) {
            case 1:
                return createSquare(scanner);
            case 2:
                return createRectangle(scanner);
            case 3:
                return createCircle(scanner);
            default:
                return null;
        }
    }

    private static Shape createSquare(Scanner scanner) {
        System.out.println("Enter the length of square: ");
        double length = scanner.nextDouble();
        if (length <= 0) {
            System.out.println("Length must be greater than 0. Enter again...");
            return null;
        }
        return new Square(length);
    }

    private static Shape createRectangle(Scanner scanner) {
        System.out.println("Enter the length and width of rectangle: ");
        double len = scanner.nextDouble();
        double width = scanner.nextDouble();
        if (len <= 0 || width <= 0) {
            System.out.println("Length and width must be greater than 0. Enter again...");
            return null;
        }
        return new Rectangle(len, width);
    }

    private static Shape createCircle(Scanner scanner) {
        System.out.println("Enter the radius of circle");
        double radius = scanner.nextDouble();
        if (radius <= 0) {
            System.out.println("Radius must be greater than 0. Enter again...");
            return null;
        }
        return new Circle(radius);
    }

    public static double maxRectangleArea(ArrayList<Shape> shapes) {
        double maxArea;
        maxArea = 0;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea && shape.isShape().equals("Rectangle")) {
                maxArea = shape.getArea();
            }
        }
        return maxArea;
    }

    public static ArrayList<Shape> maxRectangles (ArrayList<Shape> shapes) {
        ArrayList<Shape> Rectangles = new ArrayList<>();
        double maxArea = maxRectangleArea(shapes);
        for (Shape shape : shapes) {
            if (shape.getArea() == maxArea && shape.isShape().equals("Rectangle")) {
                Rectangles.add(shape);
            }
        }
        return Rectangles;
    }

    public static double maxCircleArea(ArrayList<Shape> shapes) {
        double maxArea = 0;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea && shape.isShape().equals("Circle")) {
                maxArea = shape.getArea();
            }
        }
        return maxArea;
    }

    public static ArrayList<Shape> maxCircles (ArrayList<Shape> shapes) {
        ArrayList<Shape> Circles = new ArrayList<>();
        double maxArea = maxCircleArea(shapes);
        for (Shape shape : shapes) {
            if (shape.getArea() == maxArea && shape.isShape().equals("Circle")) {
                Circles.add(shape);
            }
        }
        return Circles;
    }
    public static void printArray(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.printShape());
        }
    }
}
