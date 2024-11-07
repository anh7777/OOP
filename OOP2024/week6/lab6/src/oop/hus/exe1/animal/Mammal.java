package oop.hus.exe1.animal;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }
    public String toString(){
        return String.format("Mammal: Mammal[%s]", super.toString());
    }
}
