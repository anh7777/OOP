package task2;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');
        Book book1 = new Book("Book 1", 34, 2000, Arrays.asList(author1), Genre.FANTASY);
        Book book2 = new Book("Book 1", 56, 1999, Arrays.asList(author2, author3, author4), Genre.ACTION);
        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        System.out.println(bookService.findByAuthor(author2));
        System.out.println(bookService.getAll());
        System.out.println(bookService.findMostExpensiveBook());
        System.out.println(bookService.sortByTitleAsc());
        System.out.println(bookService.sortByTitleDsc());
    }
}

