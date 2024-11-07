package oop.hus.exe1.animal;

public class Cat extends Mammal {
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    public String toString(){
        return String.format("Cat: Cat[%s]", super.toString());
    }
}
