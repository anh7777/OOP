package task5;

import java.util.*;
import java.util.function.ToDoubleFunction;

class BookServiceExt2 {
    private List<Book> books = new ArrayList<>();
    public void add(Book book) {
        books.add(book);
    }
    public void remove(Book book) {
        books.remove(book);
    }
    public List<Book> getAll() {
        return books;
    }
    public Stack<Book> createBookStack() {
        Collections.sort(books, Comparator.comparingDouble(new ToDoubleFunction<Book>() {
               @Override
               public double applyAsDouble(Book value) {
                   return value.getPrice();
               }
           }));
        Stack<Book> bookStack = new Stack<>();
        for (Book book : books) {
            bookStack.push(book);
        }
        return bookStack;
    }
}