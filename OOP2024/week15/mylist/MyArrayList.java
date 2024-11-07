package hus.oop.mylist;

import java.util.NoSuchElementException;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return Kích thước của list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index Vị trí của phần tử cần lấy.
     * @return Phần tử tại vị trí index.
     */
    @Override
    public Object get(int index) {
        checkIndex(index);
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * @param index Vị trí của phần tử cần xóa.
     */
    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload Dữ liệu của phần tử cần thêm.
     */
    @Override
    public void append(Object payload) {
        if (size == data.length) {
            enlarge();
        }
        data[size++] = payload;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload Dữ liệu của phần tử cần thêm.
     * @param index Vị trí cần thêm phần tử.
     */
    @Override
    public void insert(Object payload, int index) {
        checkIndexForAdd(index);
        if (size == data.length) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = payload;
        size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     * @return MyIterator.
     */
    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator();
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    /**
     * Kiểm tra chỉ số hợp lệ cho phương thức get và remove.
     * @param index Chỉ số cần kiểm tra.
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Kiểm tra chỉ số hợp lệ cho phương thức thêm phần tử.
     * @param index Chỉ số cần kiểm tra.
     */
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Lớp MyArrayListIterator để duyệt qua các phần tử của MyArrayList.
     */
    private class MyArrayListIterator implements MyIterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the list.");
            }
            return data[currentIndex++];
        }
    }
}
