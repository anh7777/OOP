package hus.oop.bookmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    // Singleton pattern
    private static BookManager instance;
    private List<Book> bookList;

    private BookManager() {
        bookList = new LinkedList<>();
    }

    public static BookManager getInstance() {
        if(instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public List<Book> getBookList() {
        return Collections.unmodifiableList(bookList);
    }

    public void append(Book book){
        bookList.add(book);
    }

    public void add(Book book, int index) {
        bookList.add(index, book);
    }

    public void remove(int index) {
        bookList.remove(index);
    }

    public void remove(Book book) {
        bookList.remove(book);
    }

    public Book bookAt(int index) {
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự số trang tăng dần.
     * @return
     */
    public List<Book> sortPagesIncreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book left, Book right) {
                return left.getPages() - right.getPages();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp book theo thứ tự số trang giảm dần.
     * @return
     */
    public List<Book> sortPagesDecreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book2.getPages() - book1.getPages();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sách theo thứ tự giá tăng dần.
     * @return
     */
    public List<Book> sortPriceIncreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sách theo thứ tự giá giảm dần.
     * @return
     */
    public List<Book> sortPriceDecreasing() {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return newList;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book2.getPages() - book1.getPages();
            }
        });
        return newList.subList(0, howMany);
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        List<Book> newList = new LinkedList<>();
        for (Book book : bookList) {
            if (book.getPages() > lowerBound) {
                newList.add(book);
            }
        }
        return newList;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getPages() - book2.getPages();
            }
        });
        return newList.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */

        public List<Book> filterBooksPagesLowerThan(double upperBound) {
            List<Book> newList = new LinkedList<>();
            for (Book book : bookList) {
                if (book.getPages() < upperBound) {
                    newList.add(book);
                }
            }
            return newList;
        }


    /**
     * Lọc ra howMany sách có giá cao nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBooksHighestPrice(int howMany) {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Double.compare(book2.getPrice(), book1.getPrice());
            }
        });
        return newList.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sách có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */

        public List<Book> filterBooksPriceHigherThan(int lowerBound) {
            List<Book> newList = new LinkedList<>();
            for (Book book : bookList) {
                if (book.getPrice() > lowerBound) {
                    newList.add(book);
                }
            }
            return newList;
        }


    /**
     * Lọc ra howMany sách có giá thấp nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBooksLowestPrice(int howMany) {
        List<Book> newList = new LinkedList<>(this.bookList);
        Collections.sort(newList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Double.compare(book1.getPrice(), book2.getPrice());
            }
        });
        return newList.subList(0, howMany);
    }

    /**
     * Lọc ra howMany sách có giá thấp hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPriceLowerThan(double upperBound) {
        List<Book> newList = new LinkedList<>();
        for (Book book : bookList) {
            if (book.getPrice() < upperBound) {
                newList.add(book);
            }
        }
        return newList;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        List<Book> newList = new LinkedList<>();
        for (Book book : bookList) {
            if (book.getPublisher().equals(publisher)) {
                newList.add(book);
            }
        }
        return newList;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        List<Book> newList = new LinkedList<>();
        for (Book book : bookList) {
            if (book.getGenre().equals(genre)) {
                newList.add(book);
            }
        }
        return newList;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        List<Book> newList = new LinkedList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                newList.add(book);
            }
        }
        return newList;
    }


    /**
     * Returns a string representation of the titles of the given list of books.
     * @param bookList
     * @return
     */
    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder sb = new StringBuilder();
        for (Book book : bookList) {
            sb.append(book.getTitle()).append(", ");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

    /**
     * Prints the given list of books to the console.
     * @param bookList
     */
    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}