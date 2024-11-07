package hus.oop.bai1;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    final List<Book> bookList;
    public BookManager() {
        bookList = new ArrayList<Book>();
    }

    public Book bookAt(int index) {
        return bookList.get(index);
    }

    boolean checkBoundaries(int index, int length) {
        return index >= 0 && index < length && index < length + bookList.size();
    }

    public List<Book> filterBookLowestPages(int page) {
        List<Book> lowestPages = new ArrayList<>();
        for (Book book : bookList) {

        }
        return lowestPages;
    }
}
