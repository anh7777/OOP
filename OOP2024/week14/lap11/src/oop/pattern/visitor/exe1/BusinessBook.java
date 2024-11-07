package oop.pattern.visitor.exe1;

public class BusinessBook implements Book {
    private String publisher;

    public BusinessBook(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
