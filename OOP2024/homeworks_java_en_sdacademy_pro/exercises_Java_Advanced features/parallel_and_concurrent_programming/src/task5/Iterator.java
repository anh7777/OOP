package task5;

import java.util.concurrent.atomic.AtomicInteger;

class Iterator<T> {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private T[] data;
    public Iterator(T[] data) {
        this.data = data;
    }
    public T next() {
        if (atomicInteger.get() < data.length) {
            return data[atomicInteger.getAndIncrement()];
        }
        throw new IllegalArgumentException("Out of range!");
    }
    public T prev() {
        if (atomicInteger.get() > 0 && atomicInteger.get() <
                data.length) {
            return data[atomicInteger.getAndDecrement()];
        }
        throw new IllegalArgumentException("Out of range!");
    }
}
