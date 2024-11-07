package task5;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        Animal[] animal = {new Cat("Persian", 10), new Dog("German Shepherd", "beef")};
                AnimalHouse<Animal> animals = new AnimalHouse<>(animal);
        System.out.println(Arrays.toString(animals.getAnimals()));
}
    }
