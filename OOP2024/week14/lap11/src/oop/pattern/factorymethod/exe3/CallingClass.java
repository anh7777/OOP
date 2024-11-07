package oop.pattern.factorymethod.exe3;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit apple = factory.provideFruit("Apple");
        apple.produceJuice();

        Fruit banana = factory.provideFruit("banana");
        banana.produceJuice();

        Fruit orange = factory.provideFruit("Orange");
        orange.produceJuice();
    }
}
