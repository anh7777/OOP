package task5;

import java.util.Arrays;
import java.util.Stack;

public class Exercise5 {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');
        Book book1 = new Book("Book 1", 34, 2000,
                Arrays.asList(author1), Genre.FANTASY);
        Book book2 = new Book("Book 1", 56, 1999,
                Arrays.asList(author2, author3, author4), Genre.ACTION);
        BookServiceExt2 bookService = new BookServiceExt2();
        bookService.add(book1);
        bookService.add(book2);
        Stack<Book> bookStack = bookService.createBookStack();
        while (!bookStack.isEmpty()) {
            System.out.println(bookStack.pop());
        }
    }
}