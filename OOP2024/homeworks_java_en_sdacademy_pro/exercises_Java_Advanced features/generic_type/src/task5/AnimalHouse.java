package task5;

class AnimalHouse<T extends Animal> {
    T[] animals;
    public AnimalHouse(T[] animals) {
        this.animals = animals;
    }
    public T[] getAnimals() {
        return animals;
    }
    public void setAnimals(T[] animals) {
        this.animals = animals;
    }
}
