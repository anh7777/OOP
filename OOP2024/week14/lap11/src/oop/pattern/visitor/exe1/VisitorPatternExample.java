package oop.pattern.visitor.exe1;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        BusinessBook businessBook = new BusinessBook("Penguin");
        DesignPatternBook designPatternBook = new DesignPatternBook("Head First Design Patterns", "Design Patterns");
        JavaCoreBook javaCoreBook = new JavaCoreBook("Java: A Beginner's Guide", "Effective Java");

        businessBook.accept(visitor);
        designPatternBook.accept(visitor);
        javaCoreBook.accept(visitor);
    }
}
