package hus.oop.comparator;

import java.util.*;

/**
 * A class 'Movie' that implements Comparable
 */
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie m) {
        return this.year - m.year;
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

/**
 * Class to compare Movies by name
 */
class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}

/**
 * Class to compare Movies by ratings
 */
class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        if (left.getRating() < right.getRating()) return -1;
        if (left.getRating() > right.getRating()) return 1;
        return 0;
    }
}

class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " +
                    movie.getName() + " " +
                    movie.getYear());
        }

        // Sort by name
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getYear() + " " +
                    movie.getRating() + " " +
                    movie.getName());
        }
    }
}

