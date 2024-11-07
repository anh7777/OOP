package task2;

import java.util.List;

public class Exercise2 {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("Harry Potter Part 1", "J.K.Rowling", "3323-434ds"));
        bookRepository.add(new Book("Harry Potter Part 2", "J.K.Rowling", "54dsd-dsds"));
        List<Book> book = bookRepository.findByName("??");
        Book book1 = bookRepository.findByIsbn("??");
        bookRepository.delete("43");
    }
}
