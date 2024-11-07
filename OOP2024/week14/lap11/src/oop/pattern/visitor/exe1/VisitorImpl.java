package oop.pattern.visitor.exe1;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Visiting BusinessBook published by " + book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Visiting DesignPatternBook with resource " + book.getResource() + " and bestseller " + book.getBestseller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Visiting JavaCoreBook with resource " + book.getResource() + " and favorite book " + book.getFavoriteBook());
    }
}
