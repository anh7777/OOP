package task5;

class Cat extends Animal {
    private int numberOfLife;
    public Cat(String name, int numberOfLife) {
        super(name);
        this.numberOfLife = numberOfLife;
    }
    public int getNumberOfLife() {
        return numberOfLife;
    }
    public void setNumberOfLife(int numberOfLife) {
        this.numberOfLife = numberOfLife;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", numberOfLife=" + numberOfLife +
                '}';
    }
}

