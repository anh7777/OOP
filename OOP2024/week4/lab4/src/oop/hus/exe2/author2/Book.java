package oop.hus.exe2.author2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorInfo = new StringBuilder();
        for (Author author : authors) {
            authorInfo.append(author).append(", ");
        }
        authorInfo.delete(authorInfo.length() - 2, authorInfo.length()); // Remove the last comma and space
        return "Book[name=" + name + ", authors= (" + authorInfo + "), price=" + price + ", qty=" + qty + "]";
    }
}
