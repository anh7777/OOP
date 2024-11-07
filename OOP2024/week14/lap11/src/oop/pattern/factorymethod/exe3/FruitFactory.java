package oop.pattern.factorymethod.exe3;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        switch (type.toLowerCase()) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            case "orange":
                return new Orange();
            default:
                throw new IllegalArgumentException("Invalid fruit type");
        }
    }
}
