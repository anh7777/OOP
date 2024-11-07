package oop.pattern.observer.exe1;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber s1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber s2 = new ConcreteSubscriber("Subscriber 2");

        publisher.subscribe(s1);
        publisher.subscribe(s2);

        publisher.mainBusinessLogic("New State");
    }
}
