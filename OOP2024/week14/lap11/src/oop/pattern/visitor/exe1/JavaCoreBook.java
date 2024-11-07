package oop.pattern.visitor.exe1;

public class JavaCoreBook implements ProgramingBook {
    private String resource;
    private String favoriteBook;

    public JavaCoreBook(String resource, String favoriteBook) {
        this.resource = resource;
        this.favoriteBook = favoriteBook;
    }

    public String getResource() {
        return resource;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
