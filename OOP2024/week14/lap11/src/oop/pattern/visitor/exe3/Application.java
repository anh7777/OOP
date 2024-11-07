package oop.pattern.visitor.exe3;

public class Application {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 2);
        Circle circle = new Circle(3, 4, 5);
        Rectangle rectangle = new Rectangle(6, 7, 8, 9);
        CompoundGraphic compoundShape = new CompoundGraphic();
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        compoundShape.draw();
        System.out.println();

        XMLExportVisitor visitor = new XMLExportVisitor();
        compoundShape.accept(visitor);
    }
}
