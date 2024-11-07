package oop.hus.exe2.author1;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Tock", "akteck@nowhere.com", 'M');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for Dummies", ahTeck, 19.99);
        System.out.println(dummyBook);

        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("New price is: " + dummyBook.getPrice());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'M'), 20.95);
        System.out.println(anotherBook);
    }
}
