package oop.pattern.abstractfactory.exe3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape = shapeFactory.getShape();
        shape.draw();
    }
}
