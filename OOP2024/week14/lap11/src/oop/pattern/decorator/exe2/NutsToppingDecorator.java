package oop.pattern.decorator.exe2;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
}
