package oop.pattern.iterator.exe1;

public class ProductCatalogImplementation implements ProductCatalog {
    private String[] productCatalog;

    public ProductCatalogImplementation() {
        productCatalog = new String[4];
        productCatalog[0] = "Product 1";
        productCatalog[1] = "Product 2";
        productCatalog[2] = "Product 3";
        productCatalog[3] = "Product 4";
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog);
    }
}
