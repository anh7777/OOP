package hus.oop.mylist;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    /**
     * Khởi tạo dữ liệu cho Iterator bằng dữ liệu của MyArrayList để nó có thể duyệt qua các phần tử dữ liệu
     * của MyArrayList.
     * @param data Dữ liệu của MyArrayList.
     */
    public MyArrayListIterator(Object[] data) {
        this.data = data;
        this.currentPosition = 0;
    }

    /**
     * Kiểm tra trong MyArrayList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return true nếu có phần tử tiếp theo, false nếu không.
     */
    @Override
    public boolean hasNext() {
        return currentPosition < data.length;
    }

    /**
     * Dịch chuyển iterator sang phần tử kế tiếp của MyArrayList và trả về phần tử hiện tại.
     * @return Phần tử hiện tại của MyArrayList.
     * @throws IndexOutOfBoundsException Nếu không còn phần tử tiếp theo.
     */
    @Override
    public Object next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements to iterate.");
        }
        return data[currentPosition++];
    }
}
