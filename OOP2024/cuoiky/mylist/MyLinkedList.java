package hus.oop.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
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
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index Vị trí của phần tử cần xóa.
     */
    @Override
    public void remove(int index) {
        checkIndex(index);

        if (size == 0) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list.");
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previous = getNodeByIndex(index - 1);
            previous.setNext(previous.getNext().getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload Dữ liệu của phần tử cần thêm.
     */
    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);

        if (head == null) {
            head = newNode;
        } else {
            MyLinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload Dữ liệu của phần tử cần thêm.
     * @param index Vị trí cần thêm phần tử.
     */
    @Override
    public void insert(Object payload, int index) {
        checkIndexForAdd(index);

        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
        } else {
            MyLinkedListNode previous = getNodeByIndex(index - 1);
            MyLinkedListNode newNode = new MyLinkedListNode(payload, previous.getNext());
            previous.setNext(newNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return MyIterator.
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index Vị trí của node cần lấy.
     * @return MyLinkedListNode tại vị trí index.
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        MyLinkedListNode current = head;
        while (current != null) {
            stringBuilder.append(current.getPayload());
            if (current.getNext() != null) {
                stringBuilder.append("] [");
            }
            current = current.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
