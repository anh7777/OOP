package task4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>(new Book[]{new
                Book("Harry Potter", "Fantasy")});
        System.out.println(Arrays.toString(bookLibrary.getElements()));
        Library<Movie> movieLibrary = new Library<>(new Movie[]
                {new Movie("Star Wars", "J.J Ambrams")});
        System.out.println(Arrays.toString(movieLibrary.getElements()));
        Library<Newspaper> newspaperLibrary = new Library<>(new
                Newspaper[]{new Newspaper("NYC", "US")});
        System.out.println(Arrays.toString(newspaperLibrary.getElements()));
    }
}

