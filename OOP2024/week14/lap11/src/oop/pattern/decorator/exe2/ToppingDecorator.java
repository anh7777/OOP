package oop.pattern.decorator.exe2;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String getDescription();

    public String addTopping() {
        return " with a topping";
    }
}
