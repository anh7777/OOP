package oop.hus.exe2.author1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Tock", "akteck@nowhere.com", 'M');

        System.out.println(ahTeck);

        ahTeck.setEmail("paul@somewhere.com");
        System.out.println("Name is: " + ahTeck.getName());
        System.out.println("Email is: " + ahTeck.getEmail());
        System.out.println("Gender is: " + ahTeck.getGender());
    }
}
