package hus.oop.comparable;

import java.util.*;

/**
 * A class 'Movie' that implements Comparable
 */
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
