package oop.pattern.iterator.exe2;
public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.config();

        Profile profile = new Profile("123", "example@example.com");

        app.sendSpamToFriends(profile);
        app.sendSpamToCoworkers(profile);
    }
}
