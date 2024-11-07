package oop.pattern.visitor.exe1;

public class DesignPatternBook implements ProgramingBook {
    private String resource;
    private String bestseller;

    public DesignPatternBook(String resource, String bestseller) {
        this.resource = resource;
        this.bestseller = bestseller;
    }

    public String getResource() {
        return resource;
    }

    public String getBestseller() {
        return bestseller;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
