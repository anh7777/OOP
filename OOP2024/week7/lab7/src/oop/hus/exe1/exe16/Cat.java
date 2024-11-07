package oop.hus.exe1.exe16;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Meow");
    }
}
