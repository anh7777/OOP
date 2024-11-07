package oop.hus.exe1.exe16;

abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    abstract void greets();
}
