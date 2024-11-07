package task5;

class Dog extends Animal {
    private String favoriteFood;
    public Dog(String name, String favoriteFood) {
        super(name);
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}

