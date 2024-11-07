package oop.pattern.abstractfactory.exe3;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
