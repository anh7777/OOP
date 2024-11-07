package oop.hus.exe1.animal;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public String toString(){
        return String.format("Animal: Animal[name=%s]", name);
    }
}
