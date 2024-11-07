package oop.pattern.iterator.exe1;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int index;

    public ProductIterator(String[] productCatalog) {
        this.productCatalog = productCatalog;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (index < productCatalog.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return productCatalog[index++];
        }
        return null;
    }
}
