package oop.pattern.abstractfactory.exe3;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
