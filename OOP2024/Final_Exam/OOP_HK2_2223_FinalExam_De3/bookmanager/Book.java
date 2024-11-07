package hus.oop.bookmanager;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
    private String publisher;

    private Book() {}

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public Object getGenre() {
        return genre;
    }

    public Object getPublisher() {
        return publisher;
    }

    public Object getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static class BookBuilder {

        private String title;
        private String author;
        private String genre;
        private int pages;
        private double price;
        private String publisher;

        public BookBuilder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder withGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder withPages(int pages) {
            this.pages = pages;
            return this;
        }

        public BookBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder withPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book();
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}