package hus.oop.bai1;

public class Book implements MyBookComparable {
    private final String title;
    private final String author;
    private final String genre;
    private final int pages;
    private final double price;
    private final String publisher;
    Book(String title, String author, String genre, int pages, double price, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
        this.publisher = publisher;
    }

    public int compareTo(Book book) {
        if (this.price < book.price) {
            return 1;
        } else if (this.price > book.price) {
            return -1;
        }
        return 0;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String toString() {
        return String.format("Book[title=%s,author=%s,genre=%s,pages=%d,price=%.2f,publisher=%s]", title, author, genre, pages, price, publisher);
    }
}
