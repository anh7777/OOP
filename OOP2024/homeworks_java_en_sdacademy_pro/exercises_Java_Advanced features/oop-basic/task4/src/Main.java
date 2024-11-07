public class Main {
    public static void main(String[] args) {
        ShapeEx4[] shapes = {
                new CircleEx4("blue", true, 20),
                new RectangleEx4("yellow", true, 20, 30),
                new SquareEx4("green", false, 40)
        };
        for (ShapeEx4 shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}