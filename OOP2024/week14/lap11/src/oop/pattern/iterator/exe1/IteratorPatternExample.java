package oop.pattern.iterator.exe1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalogImplementation productCatalog = new ProductCatalogImplementation();
        Iterator iterator = productCatalog.getIterator();

        System.out.println("Products:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
