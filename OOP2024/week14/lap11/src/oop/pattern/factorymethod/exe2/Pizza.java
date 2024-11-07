package oop.pattern.factorymethod.exe2;

public abstract class Pizza {
    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400F for 20 minutes.");
    }
}
